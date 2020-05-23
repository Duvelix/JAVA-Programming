public class DoWhile {

    public static void main(String[] args) {
        int i = 11, sum = 0;

        do {
            if (i > 10)
                i = 0;
            else if ( i == 10)
                System.out.print(i);
            else
                System.out.print(i + " + ");
            sum += i;
            i++;
        }
        while ( i <= 10 );
        System.out.println(" = " + sum);
    }
}
