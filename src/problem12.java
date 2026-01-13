/*
 * 
 *
 *
 *
 *
 *
 *
 * */

import java.util.Scanner;

/*
 * first come the odd numbers
 *  to find the number at kth position, we need to see if k is odd or not
 *  if k is odd, kth position is also odd
 *  if kth position is odd, then we can link kth position 
 * */
public class problem12 {

    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long k = sc.nextLong();
        long numberOfOdds = ((a+1)/2);
        if (k <= numberOfOdds){
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - numberOfOdds));
        }
        sc.close();

    }
}

