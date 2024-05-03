package doubly_linked_list;

public class DoublyLinkedList<T> {

    Node<T> head = null;
    Node<T> tail = null;

    void addToHead(final T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    void addToTail(final T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void printFromHead() {
        Node<T> tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void printFromTail() {
        Node<T> tmp = tail;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.prev;
        }
        System.out.println();
    }

}
