import java.util.Arrays;

public class dtStrSplit{
	
    public static void main(String[] args){
        String names = "Peter, Paul, Mary";
        String[] result = names.split(", ");
        System.out.println(Arrays.toString(result));
    }
}