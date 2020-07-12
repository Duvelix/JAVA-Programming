import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("src/output.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();
    }
}