interface Input {
    default String KeyBoard() {
        return "Razer Blackwidow Elite";
    }
    String Mouse();
}

class Computer implements Input {
    public String Mouse(){
        return "Razer DeathAdder Elite";
    }
}

public class DefaultMethod {

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        System.out.println("My Keyboard : " + myComputer.KeyBoard());
        System.out.println("My Mouse : " + myComputer.Mouse());
    }
}
