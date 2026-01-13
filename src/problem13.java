import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * problem13
 */
public class problem13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int b = sc.nextInt();

        boolean[] isDoable = new boolean[a + 1];

       IntStream.range(0, b).forEach(i -> isDoable[sc.nextInt()] = true );

       int c = sc.nextInt();

       IntStream.range(0, c).forEach(i -> isDoable[sc.nextInt()] = true);

       int count = 0;

       for ( boolean element : isDoable ){
           if ( element = false){
               count++;
           }
           if ( count > 1 ){
               System.out.println("Oh, my keyboard!");
           } break;
       }
       if ( count == 0 ){
           System.out.println("I become the guy.");
       }
       sc.close();
    }
}
