interface Sequence {
    boolean hasNext();
    int next();
}

class IntSequence implements Sequence{
    private int i;
    public boolean hasNext() {
        return true;
    }
    public int next() {
        i++;
        return i;
    }
}

class SquareSequence implements Sequence {
    private int i;
    public boolean hasNext() {
        return true;
    }
    public int next() {
        i++;
        return i*i;
    }
}

public class AverageUsingInterface {

    public static double average(Sequence seq, int n) {
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args){
        IntSequence sequence1 = new IntSequence();
        SquareSequence sequence2 = new SquareSequence();
        System.out.println(average(sequence1, 4));
        System.out.println(average(sequence2, 4));
    }
}