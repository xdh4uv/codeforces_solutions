import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// help - 2
public class problem2 {
    public static int main(String[] args) throws IOException {
//        there are n person of height a each and height of fence is h
//        if a > h, width = 2 else width = 1
//        min width for n personw

        // first input is two integers
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = new int[2];
        String[] input1 = br.readLine().split(" ");
        for ( int i = 0; i < 2; i++ ) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int n = arr1[0];
        int h = arr1[1];
        int width = n;
        // take another array of size n that takes in the inputs of the hieghts of the people

        int[] arr2 = new int[n];
        String[] input2 = br.readLine().split(" ");
        for ( int i = 0; i < n; i++ ){
            arr2[i] = Integer.parseInt(input2[i]);
        }
        // now we have both arrays
        // we need to find the minimum width so that ppl who have to duck can fit in
        for ( int i : arr2 ) {
            if ( i > h ){
                width++;
            }
        }
       return  width;
    }
}