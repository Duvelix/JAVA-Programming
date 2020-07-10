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
    @Override
    protected Manager getSupervisor() { // 컴파일 에러
        System.out.println("Manager");
        return (Manager)supervisor;
    }
}

public class OverrideAccessibility {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m.getSupervisor());
        Employee e = new Employee();
        System.out.println(e.getSupervisor());
    }
}
