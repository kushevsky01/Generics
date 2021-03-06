import Exceptions.ListException;
import Exceptions.EmptyListException;
import Exceptions.TypeException;
import Exceptions.IndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) throws ListException {
        LinkedList<Integer> list = new LinkedList<>();
        int n;

        try {
            list.Add(20);
            list.Add(12);
            list.Add(30);
            list.get(12);
            list.remove(20);
            list.remove(20);
            list.remove(12);
            list.print();

        } catch (EmptyListException | IndexOutOfBoundsException | TypeException e) {
            e.Message();
        }


    }

}
