class SuperClass {
    public final void fun1() {
        System.out.println("SuperClass fun1");
    }
}

class SubClass extends SuperClass{
    public void fun1() {    // 컴파일 에러
        System.out.println("SubClass fun1");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.fun1();
    }
}