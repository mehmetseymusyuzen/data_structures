package linked_list;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addToHead(final T data) {
        final Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void addToTail(final T data) {
        final Node<T> node = new Node<>(data);

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

    public void addIntoLinkedList(final int index, final T data) {
        final Node<T> node = new Node<>(data);

        if (head == null && index == 0) {
            head = node;
            tail = node;
        } else if (head != null && index == 0) {
            node.next = head;
            head = node;
        } else {
            int count = 0;

            Node<T> tmp = head;
            Node<T> tmp2 = head;

            while (tmp.next != null) {
                count++;
                tmp2 = tmp;
                tmp = tmp.next;
            }
            if (count == index) {
                tmp2.next = node;
                node.next = tmp;
            } else {
                tmp = head;
                tmp2 = head;
                int i = 0;

                while (i < index) {
                    tmp2 = tmp;
                    tmp = tmp.next;
                    i++;
                }
                tmp2.next = node;
                node.next = tmp;
            }
        }
    }

    public void print() {
        Node<T> tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
