import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problem10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // first read the input
        // input is in pair and must not be zero and must be string
        String input1 = br.readLine().trim();
        String input2 = br.readLine().trim();
        int[] result = new int[input1.length() + input2.length()];
        if (input1.equals('0') || input2.equals('0') ){
            return;
        }

        // reverse the strings
        for ( int i = (input2.length()-1); i >= 0; i-- ) {
            int num1 = input2.charAt(i) - '0';
            for ( int j = (input1.length()-1); j>= 0; j--) {
                int num2 = input1.charAt(j) - '0';
                int sum = num1*num2 + result[i+j+1];
                result[i+j+1] = sum%10;
                result[i+j] = sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for ( int x : result ){
            if ( !(sb.length() == 0 && x == 0)){
                sb.append(x);
            }
        }
        String finalAns = sb.length() == 0 ? "0" : sb.toString();
        System.out.println(finalAns);


    }
}
