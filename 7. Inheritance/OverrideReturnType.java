class Employee {
    private String name;
    protected Employee supervisor;
    public Employee() {
        this.name = "NoName";
    }
    public Employee getSupervisor() {
        System.out.println("Employee");
        return supervisor;
    }
}
class Manager extends Employee {
    @Override  // 문제 없음
    public Manager getSupervisor() {
        System.out.println("Manager");
        return (Manager)supervisor;
    }
}

public class OverrideReturnType {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getSupervisor());
        Employee e = new Employee();
        System.out.println(e.getSupervisor());
    }
}