import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("src/output.txt");
        String str = "Hello World!";
        byte[] bytes = str.getBytes();
        output.write(bytes);
        output.close();
    }
}