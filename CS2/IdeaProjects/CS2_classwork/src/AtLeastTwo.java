/**
 * Created by Cody on 3/23/2016.
 */
public class AtLeastTwo {
    public static boolean atLeastTwo(boolean a, boolean b, boolean c){
        //assume false
        boolean result = false;
        //check each combination of two trues.
        if(a && b){
            result = true;
        }
        if(b && c){
            result = true;
        }
        if(a &&c ){
            result = true;
        }
        //return false if each combination was false
        return result;
    }
    public static void main(String[] args){
        System.out.println(atLeastTwo(true,true,false));
    }
}
