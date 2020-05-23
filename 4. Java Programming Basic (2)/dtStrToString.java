public class dtStrToString {
	
    public static void main(String[] args){
        int age = 30;
        double pi = 3.14;
        String str;

        /* String <-> Int 변환 */
        str = Integer.toString(age);
        System.out.println(str);
        age = Integer.parseInt(str);
        System.out.println(age);

        /* String <-> Double 변환 */
        str = Double.toString(pi);
        System.out.println(str);
        pi = Double.parseDouble(str);
        System.out.println(pi);
    }
}
