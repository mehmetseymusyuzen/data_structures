package linked_list;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.addToTail(6);
        l.addToTail(10);
        l.addToTail(3);
        l.addToTail(2);
        l.addToTail(8);
        l.addToTail(6);
        l.addToHead(4);
        l.addToTail(1);
        l.addToHead(9);
        l.addToTail(12);

        l.print();

        l.addIntoLinkedList(3, 4);
        l.print();

        l.addIntoLinkedList(10, 9);
        l.print();

        l.addIntoLinkedList(0, 0);
        l.print();

        l.removeFromHead();
        l.print();

        l.removeFromTail();
        l.print();

    }
}
