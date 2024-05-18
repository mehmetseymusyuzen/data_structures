package bst;

public class BST {

    Node root = null;

    public void preOrder() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderRecursive(current.leftChild);
            preOrderRecursive(current.rightChild);
        }
    }

    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.leftChild);
            System.out.print(current.data + " ");
            inOrderRecursive(current.rightChild);
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node current) {
        if (current != null) {
            postOrderRecursive(current.leftChild);
            postOrderRecursive(current.rightChild);
            System.out.print(current.data + " ");
        }
    }

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

    public Node search(int s) {
        return searchRecursive(root, s);
    }

    private Node searchRecursive(Node current, int s) {
        if (current == null || current.data == s) return current;
        if (current.data < s) {
            return searchRecursive(current.rightChild, s);
        }
        return searchRecursive(current.leftChild, s);
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
