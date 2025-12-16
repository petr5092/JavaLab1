public class ArrayQueueTest {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
        testLinkedQueue();
        System.out.println("All tests passed!");
    }

    private static void testArrayQueueModule() {
        ArrayQueueModule.clear();
        assert ArrayQueueModule.isEmpty();
        assert ArrayQueueModule.size() == 0;

        ArrayQueueModule.enqueue("a");
        assert !ArrayQueueModule.isEmpty();
        assert ArrayQueueModule.size() == 1;
        assert ArrayQueueModule.element().equals("a");

        ArrayQueueModule.enqueue("b");
        assert ArrayQueueModule.size() == 2;
        assert ArrayQueueModule.element().equals("a");

        assert ArrayQueueModule.dequeue().equals("a");
        assert ArrayQueueModule.size() == 1;
        assert ArrayQueueModule.element().equals("b");

        assert ArrayQueueModule.dequeue().equals("b");
        assert ArrayQueueModule.isEmpty();
    }

    private static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        assert ArrayQueueADT.isEmpty(queue);
        assert ArrayQueueADT.size(queue) == 0;

        ArrayQueueADT.enqueue(queue, "a");
        assert !ArrayQueueADT.isEmpty(queue);
        assert ArrayQueueADT.size(queue) == 1;
        assert ArrayQueueADT.element(queue).equals("a");

        ArrayQueueADT.enqueue(queue, "b");
        assert ArrayQueueADT.size(queue) == 2;
        assert ArrayQueueADT.element(queue).equals("a");

        assert ArrayQueueADT.dequeue(queue).equals("a");
        assert ArrayQueueADT.size(queue) == 1;
        assert ArrayQueueADT.element(queue).equals("b");

        assert ArrayQueueADT.dequeue(queue).equals("b");
        assert ArrayQueueADT.isEmpty(queue);
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();
        assert queue.isEmpty();
        assert queue.size() == 0;

        queue.enqueue("a");
        assert !queue.isEmpty();
        assert queue.size() == 1;
        assert queue.element().equals("a");

        queue.enqueue("b");
        assert queue.size() == 2;
        assert queue.element().equals("a");

        assert queue.dequeue().equals("a");
        assert queue.size() == 1;
        assert queue.element().equals("b");

        assert queue.dequeue().equals("b");
        assert queue.isEmpty();
    }

    private static void testLinkedQueue() {
        LinkedQueue queue = new LinkedQueue();
        assert queue.isEmpty();
        assert queue.size() == 0;

        queue.enqueue("a");
        assert !queue.isEmpty();
        assert queue.size() == 1;
        assert queue.element().equals("a");

        queue.enqueue("b");
        assert queue.size() == 2;
        assert queue.element().equals("a");

        assert queue.dequeue().equals("a");
        assert queue.size() == 1;
        assert queue.element().equals("b");

        assert queue.dequeue().equals("b");
        assert queue.isEmpty();
    }
}