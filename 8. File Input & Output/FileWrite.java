import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/output.txt");
        String str = "Hello World!";
        fw.write(str);
        fw.close();
    }
}