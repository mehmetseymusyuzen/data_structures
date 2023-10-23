package linked_list;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }

    @Override
    public String toString() {
        return "[" + data + "," + next + "]";
    }
}
