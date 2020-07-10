class SuperClass {
    public void fun1() {
        System.out.println("SuperClass fun1");
    }
}

class SubClass extends SuperClass{
    public void fun1() {
        System.out.println("SubClass fun1");
    }
    public void fun2() {
        System.out.println("SubClass fun2");
    }
}

public class LookupErrorSolution {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        SuperClass obj2 = obj;
        if(obj2 instanceof SubClass) {
            SubClass obj3 = (SubClass) obj2;
            obj3.fun2();
        }
    }
}