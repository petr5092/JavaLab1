public class ArrayQueueADT {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueADT() {
        elements = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }


    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert queue != null && element != null;
        queue.ensureCapacity();
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }


    public static Object element(ArrayQueueADT queue) {
        assert queue != null && queue.size > 0;
        return queue.elements[queue.head];
    }


    public static Object dequeue(ArrayQueueADT queue) {
        assert queue != null && queue.size > 0;
        Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }


    public static int size(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size;
    }


    public static boolean isEmpty(ArrayQueueADT queue) {
        assert queue != null;
        return queue.size == 0;
    }


    public static void clear(ArrayQueueADT queue) {
        assert queue != null;
        while (!isEmpty(queue)) {
            dequeue(queue);
        }
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