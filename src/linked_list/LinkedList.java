package linked_list;

public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void addInOrder(Node n) {
        if (head == null) {
            head = n;
        } else if (head.data > n.data) {
            n.next = head;
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null && tmp.next.data < n.data) {
                tmp = tmp.next;
            }
            n.next = tmp.next;
            tmp.next = n;
        }
    }

    public void addToTail(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is Empty");
        } else if (head.data == data) {
            head = head.next;
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (tmp.next.data == data) {
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }
        }
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " - ");
            tmp = tmp.next;
        }
        System.out.println();
    }

}
