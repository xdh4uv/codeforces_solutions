import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem4 {
    public static void main(String[] args) throws IOException {
        //limak wieght trippled each year while bob weight doubled each year
        int yearCount = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] weights = new int[2];
        for ( int i = 0; i<2; i++ ) {
            weights[i] = Integer.parseInt(input[i]);
        }
        while ( weights[0] <= weights[1] ){
            yearCount++;
            weights[0] = weights[0] * 3;
            weights[1] = weights[1] * 2;
        }
        System.out.println(yearCount);
    }
}