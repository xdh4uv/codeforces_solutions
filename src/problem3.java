import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        int n = Integer.parseInt(input1);
        String input2 = br.readLine();
        int countA = 0;
        int countD = 0;
        // lets convert this string into a list of chars
        char[] letters = input2.toCharArray();
        for (char c : letters ){
            switch (c) {
                case 'A':
                    countA++;
                    break;
                case 'D':
                    countD++;
            }
        }
        if ( countA > countD ) {
            System.out.println("Anton");
        } else if ( countD > countA ) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");

        }
    }
}
