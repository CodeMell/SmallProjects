import com.sedgewick.stdlib.StdIn;
import com.sedgewick.stdlib.StdOut;





public class Stats {
    public static double avg(double[] a) {
        //add up all numbers
        double total = 0;
        for (double num : a) {
             total = total + num;
        }
        //divide by array length or n
        return total / a.length;
    }

    public static double stdDev(double[] a){
        double average = avg(a);
        double sum = 0;
        //find difference from average and square it for each index
        for(double num : a){
            double difSq = (average - num) * (average - num);
            //add them all up
            sum = sum + difSq;
        }
        //take square root
        double sumSqrt =Math.sqrt(sum);
        //divide by n - 1 and return
        return sumSqrt / (a.length - 1);

    }

    public static void main(String[] args){
        //get input of array length
        StdOut.println("Input quantity of numbers.");
        int n = StdIn.readInt();
        //get array contents
        StdOut.println("input " + n + " numbers.");
        double[] a = StdIn.readAllDoubles();
        //find average and standard deviation and print
        StdOut.println("average: " + avg(a));
        StdOut.println("standard deviation: " + stdDev(a));
        }
    }

