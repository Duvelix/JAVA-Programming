public class opPriority {

    public static void main(String[] args)
    {
        int x = 1, y = 2, z;
        z = x + y * 2 - ++x + (y += 3);
        System.out.println("x : " + x + " y : " + y + " z : " + z);
        System.out.println("x / y * z : " + (x / y * z));
        System.out.println("x = y += z : " + (x = y += z));
    }
}