public class opPlus {

    public static void main(String[] args) {
        int x=1;
        System.out.println("x:" + x);
        for (int i=1 ; i<=3 ; i++)
            System.out.print("x:" + x++ + " ");
        System.out.println("\nx:" + x);
        x = x*10;
        System.out.println("\nx:" + x);
        for (int i=1 ; i<=3 ; i++)
            System.out.print("x:" + ++x + " ");
        System.out.println("\nx:" + x);
    }
}