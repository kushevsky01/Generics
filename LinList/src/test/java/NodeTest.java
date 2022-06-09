import Exceptions.EmptyListException;
import Exceptions.IndexOutOfBoundsException;
import Exceptions.ListException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NodeTest {


    @Test
    void getTest() throws ListException {

        Node<Integer> node = new Node<Integer>();
        node.Add(15);
        node.Add(20);
        Boolean thrown = false;

        try {
            node.get(4);
        } catch (IndexOutOfBoundsException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    void getTest1() throws ListException {
        Node<Integer> node = new Node<Integer>();
        node.Add(15);
        node.Add(20);

        Object n = node.get(1);
        assertEquals(20, n);


    }

    @Test
    void getTest2() throws ListException {
        Node<Integer> node = new Node<Integer>();
        Boolean thrown = false;

        try {
            node.get(0);
        } catch (EmptyListException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    void addTest() {
        Node<Integer> node = new Node<Integer>();
        node.Add(15);
        node.Add(20);

        assertEquals(2, node.size());
    }

    @Test
    void removeTest1() throws ListException {
        Node<Integer> node = new Node<Integer>();
        node.Add(15);
        node.Add(20);
        node.remove(20);
        node.remove(15);
        assertEquals(0, node.size());
    }

    @Test
    void removeTest2() throws ListException {
        Node<Integer> node = new Node<Integer>();
        Boolean thrown = false;

        try {
            node.remove(15);
        } catch (EmptyListException e) {
            thrown = true;
        }
        assertTrue(thrown);


    }

    @Test
    void sizeTest() {
        Node<Integer> node = new Node<Integer>();
        node.Add(10);
        node.Add(20);
        assertEquals(2, node.size());

    }
}