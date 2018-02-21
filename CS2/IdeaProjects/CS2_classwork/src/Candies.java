/**
 * Created by cody on 3/1/16.
 */
import com.sedgewick.stdlib.StdOut;

public class Candies {
   public static void main(String[] args){
       double total = 0;
       int i = 0;
       double price = 0.10;
       while(total < 1.0){
           total = total + price;
           i++;
           price = price + .1;
       }
       StdOut.println(i);
   }
}

