public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;


    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity();
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        assert size > 0;
        return elements[head];
    }


    public static Object dequeue() {
        assert size > 0;
        Object result = elements[head];
        elements[head] = null; 
        head = (head + 1) % elements.length;
        size--;
        return result;
    }


    public static int size() {
        return size;
    }


    public static boolean isEmpty() {
        return size == 0;
    }


    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    private static void ensureCapacity() {
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