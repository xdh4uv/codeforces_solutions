import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class problem9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ( (input = br.readLine()) != null ) {
            long n = Long.parseLong(input);
            if ( n <= 0) {
                break;
            }
            long sqrtN = (int) Math.sqrt(n);
            System.out.println( (sqrtN * sqrtN == n) ? "yes" : "no");
        }



    }
}
