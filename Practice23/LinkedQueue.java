public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }


    public void enqueue(Object element) {
        assert element != null;
        Node newNode = new Node(element);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }


    public Object element() {
        assert size > 0;
        return head.value;
    }


    public Object dequeue() {
        assert size > 0;
        Object result = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }
}