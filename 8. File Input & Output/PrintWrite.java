import java.io.PrintWriter;
import java.io.IOException;

public class PrintWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("src/output.txt");
        String str = "Hello World!";
        pw.println(str);
        pw.close();
    }
}