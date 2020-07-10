class SuperClass {
    public SuperClass(int a, int b) {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass{
    public SubClass() {
        //super(10, 20);  // 반드시 선언해주어야 함
        System.out.println("SubClass Constructor");
    }
}

public class SuperConstructorwithParameter {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}