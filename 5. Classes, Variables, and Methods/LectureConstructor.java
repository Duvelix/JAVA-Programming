class Employee {
    private String name;
    public Employee() {
        this.name = "NoName";
    }
    public String getName() {
        return this.name;
    }
}

public class LectureConstructor {

    public static void main(String[] args) {
        Employee m = new Employee();
        System.out.println(m.getName());
    }
}