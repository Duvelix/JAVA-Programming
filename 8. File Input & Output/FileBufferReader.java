import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/output.txt"));
        while(true) {
            String line = br.readLine();
            if(line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}