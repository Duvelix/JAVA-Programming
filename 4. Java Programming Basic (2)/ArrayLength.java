public class ArrayLength {

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int b[] = new int[a.length];
        int i;

        b = a;
        for (i = 0 ; i < a.length ; i++)
            System.out.println(a[i] + " " + b[i]);

        b[2] = 10;

        for (i = 0 ; i < a.length ; i++)
            System.out.println(a[i] + " " + b[i]);

    }
}