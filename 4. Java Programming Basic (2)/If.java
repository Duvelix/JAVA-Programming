import java.util.Random;

public class If {

    public static void main(String[] args) {
        Random number = new Random();
        int n = number.nextInt(201) - 100;  /* -100 ~ 100 무작위 숫자 */

        System.out.println("무작위 숫자 : " + n);

        if (n == 0)
            System.out.println("정확히 중간 숫자가 나왔습니다!");

        if (n > 0)
            System.out.println("양수입니다.");
        else if (n < 0)
            System.out.println("음수입니다.");
        else
            System.out.println("양수도, 음수도 아닙니다.");
    }
}