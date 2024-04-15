package linked_list;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }


    public void addToHead(final T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void addToTail(final T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        Node<T> tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }


    public void print() {
        Node<T> tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

}
