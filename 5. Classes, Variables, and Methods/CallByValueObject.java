class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}
public class CallByValueObject {

    public static void changeName(Employee e) {
        e.name = "John";
    }

    public static void main(String[] args) {
        Employee m = new Employee("Peter");
        changeName(m);
        System.out.println(m.name);
    }
}