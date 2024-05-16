package bst;

public class BST {

    Node root = null;

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            current = new Node(data);
            return current;
        } else if (current.data > data) {
            current.leftChild = addRecursive(current.leftChild, data);
        } else if (current.data < data) {
            current.rightChild = addRecursive(current.rightChild, data);
        }
        return current;
    }

    public void print() {
        printRecursive(root, "");
    }

    private void printRecursive(Node current, String indent) {
        System.out.println(indent + current.data);
        if (current.leftChild != null) {
            printRecursive(current.leftChild, indent + "    ");
        }
        if (current.rightChild != null)
            printRecursive(current.rightChild, indent + "    ");
    }

}
