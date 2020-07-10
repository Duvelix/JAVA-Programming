class SuperClass {
    public SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass{
    public SubClass() {
        System.out.println("SubClass Constructor");
    }
}

public class InheritanceConstructor {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}