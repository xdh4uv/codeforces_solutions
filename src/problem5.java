import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem5 {
    public static void main(String[] args) throws IOException {
        int moves = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        outerloop:
        // Use '< 5' for correct 0-4 indexing
        for (int i = 0; i < 5; i++) {
            // Split the input string by spaces " "
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                if (input[j].equals("1")) {
                    // Calculate moves to the center (2, 2)
                    moves = Math.abs(i - 2) + Math.abs(j - 2);
                    break outerloop; // Exit both loops once '1' is found
                }
            }
        }
        System.out.println(moves);
    }
}