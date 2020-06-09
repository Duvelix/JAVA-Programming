interface Brand {
    String retCompany();
}

interface Design {
    String retColor();
}

class SmartPhone implements Brand, Design {
    private String brand, design;
    public SmartPhone(String name, String color){
        this.brand = name;
        this.design = color;
    }
    public String retCompany(){
        return this.brand;
    }
    public String retColor(){
        return this.design;
    }
}


public class MultipleInterface {

    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("Galaxy Note 10+", "Aura White");
        System.out.println("My Phone Brand : " + myPhone.retCompany());
        System.out.println("My Phone Color : " + myPhone.retColor());
    }
}
