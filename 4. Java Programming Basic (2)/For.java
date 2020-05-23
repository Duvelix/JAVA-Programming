public class For {

    public static void main(String[] args) {
        int i, sum = 0;

        for (i = 1 ; i <= 10 ; i++) {
            if( i == 10)
                System.out.print(i);
            else
                System.out.print(i + " + ");
            sum += i;
        }
        System.out.println(" = " + sum);
    }
}