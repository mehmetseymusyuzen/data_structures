package arrays;

public class ArrayTest {
    public static void main(String[] args) {

        Array arr = new Array(6);
        arr.addElement(6);
        arr.addElement(3);
        arr.addElement(9);
        arr.addElement(0);
        arr.addElement(2);
        arr.addElement(1);

        arr.print();
        arr.remove(0);
        arr.print();
        arr.update(9,6);
        arr.print();


    }
}
