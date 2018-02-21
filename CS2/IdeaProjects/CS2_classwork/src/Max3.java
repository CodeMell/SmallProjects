/**
 * Created by Cody on 3/23/2016.
 */
public class Max3 {
    public static int max3(int a, int b, int c){
        //compare each entry to each other entry
        int largest = 0;
        if(a > b && a > c){
            largest = a;
        }
        if(b > a && b > c){
            largest = b;
        }
        if(c > a && c > b){
            largest = c;
        }
        //check for all numbers being the same or anything that causes largest not to change.
        if(largest == 0) {
            System.out.println("Incompatible entry.");
        }
        //return the largest entry
        return largest;
    }
    public static double max3(double a, double b, double c){
        //compare each entry to each other entry
        double largest = 0;
        if(a > b && a > c){
            largest = a;
        }
        if(b > a && b > c){
            largest = b;
        }
        if(c > a && c > b){
            largest = c;
        }
        //check for all numbers being the same or anything that causes largest not to change.
        if(largest == 0) {
            System.out.println("Incompatible entry.");
        }
        //return the largest entry
        return largest;
    }
    public static void main(String[] args){
        System.out.println(max3(29,87,47));
    }
}
