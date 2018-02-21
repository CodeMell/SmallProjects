/**
 * Created by Cody on 3/23/2016.
 */
public class odd {
    public static boolean odd(boolean a, boolean b, boolean c){
        //assume false
        boolean result = false;
        //true if all 3 are true
        if(a && b && c){
            result = true;
        }
        //true if only one is true and other 2 are false
        if(a && !b && !c){
            result = true;
        }
        if(!a && b && !c){
            result = true;
        }
        if(!a && !b && c){
            result = true;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(odd(true,true,false));
    }
}
