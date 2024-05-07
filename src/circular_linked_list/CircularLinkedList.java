package circular_linked_list;

public class CircularLinkedList<T> {

    Node<T> head = null;
    Node<T> tail = null;

    void addToHead(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
    }

    void addToTail(T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    void addIntoCircularLinkedList(int index, T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else if (index == 0) {
            node.next = head;
            head = node;
            tail.next = head;

        } else {
            int count = 0;
            Node<T> tmp = head;
            Node<T> tmp2 = null;

            while (tmp != tail) {
                tmp = tmp.next;
                count++;
            }
            count++;

            if (index >= count - 1) {
                tail.next = node;
                tail = node;
                tail.next = head;
            } else {
                tmp = head;
                tmp2 = tmp;

                int i = 0;
                while (i < index) {
                    i++;
                    tmp2 = tmp;
                    tmp = tmp.next;
                }
                tmp2.next = node;
                node.next = tmp;
            }
        }
    }

    public void print() {
        Node<T> tmp = head;

        while (tmp != tail) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.print(tmp.data + "\n");
    }

}
