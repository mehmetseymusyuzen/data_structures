package doubly_linked_list;

public class DoublyLinkedListTest {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

        dl.addToHead(3);
        dl.addToHead(9);
        dl.addToTail(10);
        dl.addToHead(6);
        dl.addToTail(-5);

        dl.printFromHead();

        dl.printFromTail();

    }
}
