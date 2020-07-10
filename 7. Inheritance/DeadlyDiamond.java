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

class BClass extends SuperClass {
    public void fun1(){
        System.out.println("BClass fun1");
    }
}

class SubClass extends AClass, BClass {     // 죽음의 다이아몬드 발생 (컴파일 에러)

}

public class DeadlyDiamond {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.fun1();
    }
}