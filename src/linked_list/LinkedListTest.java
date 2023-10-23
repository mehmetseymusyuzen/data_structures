package linked_list;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        Node n1 = new Node(5);
        Node n2 = new Node(13);
        Node n3 = new Node(2);
        Node n4 = new Node(9);
        Node n5 = new Node(10);

        l.addInOrder(n1);
        l.print();

        l.addInOrder(n2);
        l.print();

        l.addInOrder(n3);
        l.print();

        l.addInOrder(n4);
        l.print();

        l.addInOrder(n5);
        l.print();

        l.delete(13);
        l.print();

    }
}
