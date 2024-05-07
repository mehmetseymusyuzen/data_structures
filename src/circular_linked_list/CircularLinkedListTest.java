package circular_linked_list;

public class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList<Integer> c = new CircularLinkedList<>();

        c.addToHead(2);
        c.print();

        c.addToHead(1);
        c.print();

        c.addToTail(4);
        c.print();

        c.addIntoCircularLinkedList(2, 3);
        c.print();


    }
}
