import java.util.Scanner;

public class Input {
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /* 한 줄 입력 */
        System.out.println("당신의 이름은?");
        String name = in.nextLine();
        System.out.println("입력 : " + name);

        /* 정수 입력 */
        System.out.println("정수를 입력해 보세요.");
        int integer = in.nextInt();
        System.out.println("입력 : " + integer);

        /* 실수 입력 */
        System.out.println("실수를 입력해 보세요.");
        double real = in.nextDouble();
        System.out.println("입력 : " + real);

        /* 한 단어 입력 */
        System.out.println("단어를 입력해 보세요.");
        String word = in.next();
        System.out.println("입력 : " + word);
    }
}