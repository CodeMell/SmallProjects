import com.sedgewick.stdlib.StdIn;
import com.sedgewick.stdlib.StdOut;

/**
 * Created by cody on 2/12/16.
 */
public class maxMin {
    public static int max(int[] input){
        //set default value to 0
        int highest = 0;
        //compare each index to the default highest and to each other
        //return result
        for(int i = 0; i < input.length; i++){
            if(input[i] > highest){
                highest = input[i];
            }
        }
        return highest;

    }

    public static int min(int[] input){
        //set default to max value of integer to be safe
        int lowest = Integer.MAX_VALUE;
        //compare all indexes and return result
        for(int i = 0; i < input.length; i++){
            if(input[i] < lowest){
                lowest = input[i];
            }
        }
        return lowest;
    }



    public static void main(String[] args) {
        //put input into an array
        int[] input = StdIn.readAllInts();
        //assume input is positive
        boolean positive = true;
        //check if all entries are positive
        for(int num : input){
            if(num <= 0) positive = false;
        }
        //assign min and max methods to variables if all entries were positive
        //otherwise display message to enter positive values
        if(positive) {
            int lowest = min(input);
            int highest = max(input);
            StdOut.println("min: " + lowest + " " + "max: " + highest);
        }else{
            StdOut.println("Please enter positive values.");
        }
    }
}
