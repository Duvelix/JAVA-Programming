interface First {
    default int duplicate(){
        return 0;
    }
}

interface Second {
    int duplicate();
}

class Collision implements First, Second {
    public int duplicate() {
        return 1;
    }
}

public class DefaultMethodCollision {

    public static void main(String[] args) {
        Collision m = new Collision();
        System.out.println(m.duplicate());
    }
}
