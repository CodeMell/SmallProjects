import com.sedgewick.stdlib.StdIn;
import com.sedgewick.stdlib.StdOut;

/**
 * Created by cody on 2/16/16.
 */
public class IntegerToBinary {
    public static void iterative(int input) {
        while (input != 0) {
            StdOut.print(input % 2);
            input = input / 2;
        }
    }

    public static void recursive(int input){
        if (input == 0) return;
        StdOut.print(input % 2);
        recursive(input / 2);


    }

    public static void main(String[] args) {
        //get input
        int input = StdIn.readInt();
        StdOut.println();
        recursive(input);
    }
}
