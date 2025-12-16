public class ArrayQueue extends AbstractQueue {
    private Object[] elements;
    private int head;
    private int tail;

    public ArrayQueue() {
        elements = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }


    public void enqueue(Object element) {
        assert element != null;
        ensureCapacity();
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }


    public Object element() {
        assert size > 0;
        return elements[head];
    }

    public Object dequeue() {
        assert size > 0;
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}