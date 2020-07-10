class SuperClass {
    public SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass{
    public SubClass() {
        super();
        System.out.println("SubClass Constructor");
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}