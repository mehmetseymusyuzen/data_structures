package doubly_linked_list;

public class DoublyLinkedListTest {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

        dl.addToHead(3);
        dl.addToHead(7);
        dl.addToTail(10);
        dl.addToHead(6);
        dl.addToTail(-5);

        dl.printFromHead();

        dl.printFromTail();

        dl.addIntoDoublyLinkedList(3, 21);
        dl.printFromHead();

        dl.removeFromHead();
        dl.printFromHead();

        dl.removeFromTail();
        dl.printFromHead();

        dl.removeIntoDoublyLinkedList(3);
        dl.printFromHead();

    }
}
