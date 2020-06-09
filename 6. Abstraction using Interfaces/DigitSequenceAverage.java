interface Sequence {
    boolean hasNext();
    int next();
}

class DigitSequence implements Sequence {
    private int number;
    public DigitSequence(int n) {
        number = n;
    }
    public boolean hasNext() {
        return number != 0;
    }
    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }
    public int rest() {
        return number;
    }
}

public class DigitSequenceAverage {

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
        Sequence sequence = new DigitSequence(12345678);
        System.out.println(average(sequence, 6));
    }
}