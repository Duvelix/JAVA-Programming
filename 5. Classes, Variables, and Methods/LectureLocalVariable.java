class Employee {
    int salary;
    public int getSalary() {
        return this.salary;
    }
}

public class LectureLocalVariable {

    public static void main(String[] args) {
        int local_var;
        Employee m = new Employee();
        System.out.println(m.getSalary());
        System.out.println(local_var);  // 컴파일 에러
    }
}