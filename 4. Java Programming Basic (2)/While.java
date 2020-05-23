public class While {

    public static void main(String[] args) {
        int i = 1, sum = 0;

        while ( i <= 10 ) {
            if( i == 10)
                System.out.print(i);
            else
                System.out.print(i + " + ");
            sum += i;
            i++;
        }
        System.out.println(" = " + sum);
    }
}
