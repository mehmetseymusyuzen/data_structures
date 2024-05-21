package bst;

public class BST_TEST {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(30);
        bst.add(20);
        bst.add(15);
        bst.add(40);
        bst.add(50);
        bst.add(45);
        bst.add(38);
        bst.add(12);
        bst.add(18);

        System.out.println(bst.search(30));

        bst.print();

        System.out.print("Pre-Order  : ");
        bst.preOrder();
        System.out.println();

        System.out.print("In-Order   : ");
        bst.inOrder();
        System.out.println();

        System.out.print("Post-Order : ");
        bst.postOrder();
        System.out.println();

        System.out.println(bst.findMax(bst.root.leftChild.leftChild));

        bst.print();
        bst.delete(40);
        bst.print();

    }
}
