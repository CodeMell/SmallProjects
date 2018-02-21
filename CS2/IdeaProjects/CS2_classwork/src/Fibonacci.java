import com.sedgewick.stdlib.StdIn;
import com.sedgewick.stdlib.StdOut;

/**
 * Created by cody on 3/3/16.
 */
public class Fibonacci {
    public static long recursive(int a){
        //cover 0 case
        if(a == 0){
            return 0;
        }else {
            //cover 1 case
            if (a == 1) {
                return 1;
            } else {
            //calculate fibonacci number recursively
                return recursive(a - 1) + recursive(a - 2);
            }
        }
    }
    public static long iterative(int a){
        //set first two numbers
        int b = 0;
        int c = 1;
        int fib = 0;
        if(a == 0){
        //cover 0 case
            return 0;
        }else if(a == 1){
        //cover 1 case
            return 1;
        }else {
            for (int i = 0; i < a - 1; i++) {
                //add two previous numbers to find next number
                fib = b + c;
                //move each number down a space
                b = c;
                c = fib;
            }
            return fib;
        }
    }
    public static void main(String[] args){
        //I tried to use StdIn to get input but it was throwing exceptions with the recursive method
        //and I couldn't figure out why
        int input = 6;
        StdOut.println(recursive(input));
        StdOut.println(iterative(input));
    }
}
