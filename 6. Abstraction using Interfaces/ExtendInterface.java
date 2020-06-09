interface Person {
    String retName();
}

interface Student extends Person {
    int retID();
}

class Undergrad implements Student {
    private String Name;
    private int ID;

    public Undergrad(String name, int num){
        this.Name = name;
        this.ID = num;
    }
    public String retName(){
        return this.Name;
    }
    public int retID(){
        return this.ID;
    }
}

public class ExtendInterface {

    public static void main(String[] args){
        Undergrad stu1 = new Undergrad("James", 2010);
        System.out.println("Name : " + stu1.retName());
        System.out.println("Student ID : " + stu1.retID());
    }
}
