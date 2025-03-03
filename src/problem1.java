import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1 {
    public static void main(String[] args) throws IOException{

//        BufferedReader readerFile = new BufferedReader(new FileReader("input.txt"));
        BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
        String num;
        num = readConsole.readLine();
        int count = Integer.parseInt(num);
        int res = 0;
        // we have to make a list for all the rest of the inputs

//        List<String> inputs = new ArrayList<>();

        for ( int i = 0; i < count; i++) {
            String[] inputs = readConsole.readLine().split(" ");
            int temp = 0;
            for ( String a : inputs ) {
                if ( a.equals("1") ){
                    temp++;
                }

            }
            if ( temp >= 2 ){
                res++;
            }

        }
        System.out.println(res);




    }
}