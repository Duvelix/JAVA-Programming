public class opConditional {

    public static void main(String[] args) {
        int x = 30, y = 10, z;
        char op;

        System.out.println("x : " + x + " y : " + y);

        op = '-';
        z = (op == '+') ? x+y : x-y;
        System.out.println("z : " + z);
    }
}
