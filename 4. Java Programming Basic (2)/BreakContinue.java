public class BreakContinue {

    public static void main(String[] args) {
        int i = 1;

        while(i <= 10){

            if ( i == 4 ){
                i++;
                continue;
            } else if ( i == 8 ){
                break;
            }
            System.out.println("i의 값은 " + i + "입니다.");
            i++;
        }
    }
}