import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputWord = br.readLine();
            int upperCount = 0;
            int lowerCount = 0;
            for ( char x : inputWord.toCharArray() ) {
                if ( Character.isUpperCase(x)) {
                    upperCount++;
                } else if ( Character.isLowerCase(x)) {
                    lowerCount ++;
                }
        }
            if ( upperCount > lowerCount ){
                System.out.println(inputWord.toUpperCase());
            } else {
                System.out.println(inputWord.toLowerCase());
            }
    };

}
