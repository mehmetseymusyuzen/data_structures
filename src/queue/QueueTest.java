package queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.push(6);
        queue.push(3);
        queue.push(9);
        queue.push(0);
        queue.push(2);
        queue.push(1);

        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();
    }
}
