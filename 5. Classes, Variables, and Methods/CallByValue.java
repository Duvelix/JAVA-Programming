public class CallByValue {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 20;
        swap(a1, a2);
        System.out.println(a1 + " " + a2);
    }
}