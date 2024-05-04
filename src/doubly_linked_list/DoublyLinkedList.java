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

    public void addIntoDoublyLinkedList(final int index, final T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
            tail = node;
        } else if (head != null && index == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        } else {
            int count = 0;
            Node<T> tmp = head;

            while (tmp != null) {
                tmp = tmp.next;
                count++;
            }
            tmp = head;

            if (index > count) {
                node.prev = tail;
                tail.next = node;
                tail = node;
            } else {
                int i = 0;

                while (i != index) {
                    tmp = tmp.next;
                    i++;
                }
                node.prev = tmp.prev;
                tmp.prev.next = node;

                tmp.prev = node;
                node.next = tmp;
            }
        }
    }

    public void removeFromHead() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void removeFromTail() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void removeIntoDoublyLinkedList(final int index) {
        if (head != null) {
            if (head.next == null && index <= 0) {
                head = null;
                tail = null;
            } else if (head.next != null && index <= 0) {
                head = head.next;
                head.prev = null;
            } else {
                int count = 0;
                Node<T> tmp = head;

                while (tmp != null) {
                    count++;
                    tmp = tmp.next;
                }
                if (index >= count - 1) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    tmp = head;

                    int i = 0;

                    while (i < index) {
                        i++;
                        tmp = tmp.next;
                    }
                    tmp.next.prev = tmp.prev;
                    tmp.prev.next = tmp.next;
                }
            }
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
