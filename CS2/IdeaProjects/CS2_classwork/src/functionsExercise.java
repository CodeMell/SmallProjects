/**
 * Created by cody on 2/9/16.
 */
import com.sedgewick.stdlib.StdIn;

public class functionsExercise {
    //public static boolean eq(int[] a, int[] b){
    //check lengths
       // if(a.length != b.length){
         //   return false;/home/cody
        //}else{
    //check matching values
          //  int n = a.length;
            //for(int i = 0; i <= n; i++){
              //  if(a[i] != b[i]){
                //    return false;
    //            }
      //      }
        //}
    //}


    public static int max3(int a, int b, int c){
        //default to a being largest
        int largest = a;
        //check if b is larger
        if(b > a){
            largest = b;
        }
        //check if c is larger if b was smaller than a
        else{
            if(c > a){
                largest = c;
            }
        }
        //check if c is larger than b if b was larger than a
        if(c > b){
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args){
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        max3(a,b,c);
    }
}