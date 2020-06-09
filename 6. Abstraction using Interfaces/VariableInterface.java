interface Motion {
    int NORTH = 1;
    int EAST = 2;
    int SOUTH = 3;
    int WEST = 4;
    void move(int direction);
    int getX();
    int getY();
}

class TwoDMotion implements Motion {
    private int posX, posY;
    public TwoDMotion() { posX = 0; posY = 0; }
    public void move(int direction) {
        if(direction == NORTH) posY--;
        else if(direction == SOUTH) posY++;
        else if(direction == EAST) posX++;
        else if(direction == WEST) posX--;
    }
    public int getX() { return posX; }
    public int getY() { return posY; }
}

public class VariableInterface {

    public static void main(String[] args){
        TwoDMotion Car = new TwoDMotion();
        System.out.println("Initial Position : (" + Car.getX() + ", " + Car.getY() + ")");
        Car.move(Motion.SOUTH);
        Car.move(Motion.EAST);
        Car.move(Motion.EAST);
        Car.move(Motion.SOUTH);
        System.out.println("Current Position : (" + Car.getX() + ", " + Car.getY() + ")");
    }
}
