package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack sta = new Stack(6);
        sta.push(8);
        sta.push(4);
        sta.push(7);
        sta.push(0);
        sta.push(2);
        sta.push(1);

        sta.print();

        sta.pop();
        sta.print();

        sta.pop();
        sta.print();
    }
}
