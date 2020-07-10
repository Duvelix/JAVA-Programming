final class SuperClass {
    public void fun1() {
        System.out.println("SuperClass fun1");
    }
}

class SubClass extends SuperClass{      // 컴파일 에러
    public void fun1() {
        System.out.println("SubClass fun1");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.fun1();
    }
}