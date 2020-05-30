class Employee {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class Lecture {

    public static void main(String[] args) {
        Employee m = new Employee();
        Employee n = new Employee();
        m.setName("Peter");
        n.setName("John");
        System.out.println(m.getName());
        System.out.println(n.getName());
    }
}