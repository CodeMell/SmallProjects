/**
 * Created by cody on 2/26/16.
 */
import com.sedgewick.stdlib.*;

public class PhoneNumber {
    //delcare instance variables
    String area;
    String exch;
    String ext;
    //constructor
    public PhoneNumber(String a, String b, String c){
        area = a;
        exch = b;
        ext = c;
    }
    public String toString (){
        return "(" + area + ") " + exch + "-" + ext;
    }
    public boolean equals (String a, String b){
        return a.equals(b);
    }
    public static void main(String[] args){
        StdOut.print("input a phone number in format XXX XXX XXXX: ");
        //read input and seperate
        String a = StdIn.readString();
        String b = StdIn.readString();
        String c = StdIn.readString();
        //create phone number object with input
        PhoneNumber n1 = new PhoneNumber(a,b,c);

        StdOut.print("input a second phone number: ");
        //read input and seperate
        a = StdIn.readString();
        b = StdIn.readString();
        c = StdIn.readString();
        //create phone number object with input
        PhoneNumber n2 = new PhoneNumber(a,b,c);
        //print numbers in correct format
        StdOut.println( n1.toString());
        StdOut.println( n2.toString());
        //notify user if they are the same
        if(n1.equals(n1.toString(),n2.toString())){
            StdOut.println("The phone numbers are the same.");
        }
    }
}
