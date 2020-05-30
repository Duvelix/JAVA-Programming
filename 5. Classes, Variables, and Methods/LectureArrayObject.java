class Employee {
    private String name = "NoName";
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class LectureArrayObject {

    public static void main(String[] args) {
        Employee m[] = new Employee[3];
        m[0] = new Employee("Mario");
        m[1] = new Employee("Luigi");
        m[2] = new Employee("Toad");
        System.out.println(m[0].getName());
        System.out.println(m[1].getName());
        System.out.println(m[2].getName());
    }
}