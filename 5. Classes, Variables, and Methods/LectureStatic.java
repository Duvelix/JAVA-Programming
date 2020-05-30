class Employee {
    private static String static_name;
    public void setName(String name) {
        static_name = name;
    }
    public String getName() {
        return static_name;
    }
}

public class LectureStatic {

    public static void main(String[] args) {
        Employee m = new Employee();
        Employee n = new Employee();
        m.setName("Peter");
        n.setName("John");
        System.out.println(m.getName());
        System.out.println(n.getName());
    }
}