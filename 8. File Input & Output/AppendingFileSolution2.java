import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class AppendingFileSolution2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("src/output.txt");
        pw.println("First Sentence.");
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("src/output.txt", true));
        pw2.println("Second Sentence.");
        pw2.close();
    }
}
