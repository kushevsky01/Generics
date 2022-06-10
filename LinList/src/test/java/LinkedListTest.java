import Exceptions.EmptyListException;
import Exceptions.IndexOutOfBoundsException;
import Exceptions.ListException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {


    @Test
    void getTest() throws ListException {

        LinkedList<Integer> list = new LinkedList<>();
        list.Add(15);
        list.Add(20);
        Boolean thrown = false;

        try {
            list.get(4);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    void getTest1() throws ListException {
        LinkedList<Integer> list = new LinkedList<>();
        list.Add(15);
        list.Add(20);

        Object n = list.get(1);
        assertEquals(20, n);


    }

    @Test
    void getTest2() throws ListException {
        LinkedList<Integer> list = new LinkedList<>();
        Boolean thrown = false;

        try {
            list.get(0);
        } catch (EmptyListException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    void addTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.Add(15);
        list.Add(20);

        assertEquals(2, list.size());
    }

    @Test
    void removeTest1() throws ListException {
        LinkedList<Integer> list = new LinkedList<>();
        list.Add(15);
        list.Add(20);
        list.remove(20);
        list.remove(15);
        assertEquals(0, list.size());
    }

    @Test
    void removeTest2() throws ListException {
        LinkedList<Integer> list = new LinkedList<>();
        Boolean thrown = false;

        try {
            list.remove(15);
        } catch (EmptyListException e) {
            thrown = true;
        }
        assertTrue(thrown);


    }

    @Test
    void sizeTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.Add(10);
        list.Add(20);
        assertEquals(2, list.size());

    }
}