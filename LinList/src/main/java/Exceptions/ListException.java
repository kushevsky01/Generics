package Exceptions;

public class ListException extends Exception {
    String message;

    public ListException(String massage) {
        this.message = massage;
    }

    public void Message() {
        System.out.println("Error : " + message);
    }
}

