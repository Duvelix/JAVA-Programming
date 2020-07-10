class SuperClass {

}

class SubClass extends SuperClass {
    @Override
    public String toString() {
        return "Overriding toString";
    }
}

public class ClassObject {
    public static void main(String[] args) {
        SubClass obj1 = new SubClass();
        SuperClass obj2 = obj1;

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj1));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

    }
}