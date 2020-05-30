public class CallByValueArray {

    public static void swap(int [] x) {
        int temp = x[0];
        x[0] = x[1];
        x[1] = temp;
    }

    public static void main(String[] args) {
        int [] a = new int[2];
        a[0] = 10;
        a[1] = 20;
        swap(a);
        System.out.println(a[0] + " " + a[1]);
    }
}