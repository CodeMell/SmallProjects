/**
 * Created by Cody on 3/23/2016.
 */
public class equals {
    private static boolean result = true;
    public static boolean eq(int[] a, int[] b){
        //check if length is equal
        if(!(a.length == b.length)){
            result = false;
        }
        //check if each index is equal
        for(int i = 0; i < a.length; i++) {
            if (!(a[i] == b[i])) {
                result = false;
            }
        }
        //return true if no conditions were false
        return result;
    }
    public static void main(String[] args){
        int[] a;
        int[] b;
        a = new int[]{1, 2, 3, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
        System.out.println(eq(a,b));
    }
}
