class SuperClass {
    public void fun1(){
        System.out.println("SuperClass fun1");
    }
}

class AClass extends SuperClass {
    public void fun1(){
        System.out.println("AClass fun1");
    }
}

interface BClass {
    void fun1();
}

class SubClass extends AClass implements BClass {
}

public class DeadlyDiamondSolution {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.fun1();
    }
}