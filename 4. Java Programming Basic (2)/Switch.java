import java.util.Random;

public class Switch {

    public static void main(String[] args) {
        Random number = new Random();
        int n = number.nextInt(6) + 1;  /* 1 ~ 6 무작위 숫자 */

        switch (n){
            case 1 : System.out.println("1이 나왔습니다!");
            case 2 : System.out.println("2가 나왔습니다!"); break;
            case 3 : System.out.println("3이 나왔습니다!"); break;
            case 4 : System.out.println("4가 나왔습니다!"); break;
            case 5 : System.out.println("5가 나왔습니다!"); break;
            case 6 : System.out.println("6이 나왔습니다!"); break;
            default:
        }
    }
}
