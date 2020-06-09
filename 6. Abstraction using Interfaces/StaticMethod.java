interface Nintendo {
    static Nintendo Console(){
        return new Nintendo3DS();
    }
    boolean isPortable();
}

class Nintendo3DS implements Nintendo{
    public boolean isPortable(){
        return true;
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        Nintendo Console = Nintendo.Console();
        System.out.println("Is the Nintendo 3DS portable? : " + Console.isPortable());
    }
}