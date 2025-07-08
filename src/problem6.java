import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_n = br.readLine();
        int numberColumns = Integer.parseInt(input_n);

        String[] input = br.readLine().split(" ");
        int[] cubesInColumns = new int[numberColumns];
        for (int i = 0; i < numberColumns; i++) {
            cubesInColumns[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(cubesInColumns);

        for ( int x : cubesInColumns) {
            System.out.print(x + " ");
        }

    }
}
