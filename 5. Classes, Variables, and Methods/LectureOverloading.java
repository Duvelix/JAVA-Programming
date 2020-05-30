class Employee {
    private String name;
    public Employee() {
        this.name = "NoName";
    }
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class LectureOverloading {

    public static void main(String[] args) {
        Employee m = new Employee("Harry Potter");
        Employee n = new Employee();
        System.out.println(m.getName());
        System.out.println(n.getName());
    }
}