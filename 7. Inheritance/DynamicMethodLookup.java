class SuperClass {
    public void fun1() {
        System.out.println("SuperClass fun1");
    }
}

class SubClass extends SuperClass{
    public void fun1() {
        System.out.println("SubClass fun1");
    }
}

public class DynamicMethodLookup {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        SuperClass obj2 = obj;
        obj2.fun1();
    }
}