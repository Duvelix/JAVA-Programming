import java.io.FileWriter;
import java.io.IOException;

public class AppendingFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/output.txt");
        fw.write("First Sentence.\r\n");
        fw.close();

        FileWriter fw2 = new FileWriter("src/output.txt");
        fw2.write("Second Sentence.\r\n");
        fw2.close();
    }
}