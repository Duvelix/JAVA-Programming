abstract class SuperClass {
    private int number;
    public abstract void fun1();
}

class SubClass extends SuperClass {
    @Override
    public void fun1(){
        System.out.println("SubClass fun1");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        //SuperClass obj = new SuperClass(); // 이렇게 선언하면 컴파일 에러
        SuperClass obj = new SubClass();
        obj.fun1();
    }
}