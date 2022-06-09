import Exceptions.ListException;
import Exceptions.EmptyListException;
import Exceptions.TypeException;
import Exceptions.IndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) throws ListException {
        Node<Integer> node = new Node<Integer>();
        int n;

        try {
            node.Add(20);

            node.Add(20);
            node.Add(30);
            node.get(2);


            node.remove(20);
            ;


            node.print();
        } catch (EmptyListException | IndexOutOfBoundsException | TypeException e) {
            e.Message();
        }


    }

}
