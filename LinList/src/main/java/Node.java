import Exceptions.EmptyListException;
import Exceptions.IndexOutOfBoundsException;
import Exceptions.ListException;

public class Node<T> {
    private LinkList head;


    public Node() {

        head = null;
    }

    public <E extends T> void Add(E data) {
        LinkList tmp = new LinkList(data);
        LinkList tmp2 = head;
        if (tmp2 == null) {
            head = tmp;
        } else {
            while (tmp2.next != null) {
                tmp2 = tmp2.next;
            }
            tmp2.next = tmp;
        }
    }


    public <E extends T> E get(int number) throws ListException {

        int i = 0;
        LinkList tmp = head;
        if (tmp == null) {
            throw new EmptyListException("List is empty");
        } else {

            while (i != number && tmp.next != null) {
                tmp = tmp.next;
                i = i + 1;
            }
        }

        if (i == number) {
            return (E) tmp.data;
        } else {
            throw new IndexOutOfBoundsException("Непдоходящий диапозон");
        }
    }


    public void remove(T data) throws ListException {
        int i = 0;
        LinkList tmp = head;
        if (tmp != null) {
            if (tmp.data == data) {
                head = tmp.next;


            } else {
                while (tmp.next != null) {

                    LinkList nextEl = tmp.next;
                    if (nextEl.data == data) {
                        tmp.next = tmp.next.next;
                        i += 1;
                        return;

                    }
                    tmp = tmp.next;

                }
                if (i == 0) {
                    throw new Exceptions.IndexOutOfBoundsException("Element is not found");
                }

            }

        } else {

            throw new Exceptions.EmptyListException("List is empty");
        }

    }


    public void print() throws ListException {
        LinkList tmp = head;
        if (tmp == null) {
            throw new EmptyListException("List is empty");
        } else {

            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }

    }

    public int size() {
        int count = 0;
        LinkList sz = head;
        while (sz != null) {
            count++;
            sz = sz.next;
        }
        return count;
    }
}
