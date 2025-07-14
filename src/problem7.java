import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
// lexographically find karo
// using ascii will not work
//
public class problem7 {
    public int returnOutput(int a, int b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstWord = br.readLine().toLowerCase();
        String secondWord = br.readLine().toLowerCase();
        if ( firstWord.compareTo(secondWord) > 0 ){
            System.out.println(1);
        } else if (firstWord.compareTo(secondWord) < 0 ) {
            System.out.println(-1);
        } else if (firstWord.compareTo(secondWord) == 0) {
            System.out.println(0);
        }


    }
}
