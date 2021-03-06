interface IntSequence {
    boolean hasNext();
    int next();
}

class SquareSequence implements IntSequence {
    private int i;
    public boolean hasNext() {
        return true;
    }
    public int next() {
        i++;
        return i*i;
    }
}

class DigitSequence implements IntSequence {
    private int number;
    public DigitSequence(int n) { number = n; }
    public boolean hasNext() { return number != 0; }
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }
    public int rest() { return number; }
}

public class Interface {
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(2345);
        if (sequence instanceof IntSequence) { // true
            DigitSequence digits = sequence;
            System.out.println(digits.rest());
        }
    }
}
