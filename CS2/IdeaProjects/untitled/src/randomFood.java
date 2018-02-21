import com.sedgewick.stdlib.*;

import java.util.Scanner;

/**
 * Created by Cody on 3/31/2016.
 */
public class randomFood {
    public static void main(String[] args){
        //create a default list of choices
        String[] defaultList = new String[]{"Mexican Food", "Italian Food", "Chinese Food", "Sushi", "Thai Food", "Indian Food", "Burgers", "Steak"};
        //give instructions
        StdOut.println("Enter a list of restaurants in your area separated by spaces or leave blank and you will get default choices:");
        //get input
        Scanner kb = new Scanner(System.in);
        String input;
        input = kb.nextLine();
        //check if input is empty
        if(input.trim().isEmpty()){
            //if input is empty select randomly from defaultList
            StdOut.println(SelectRandomly(defaultList));
        }else {
            //if input contains strings select randomly from them
            String[] userList =  createList(input);
            StdOut.println(SelectRandomly(userList));

        }
    }
    public static String[] createList(String a){
        String[] list = a.split("\\s+");
        return list;
    }
    public static String SelectRandomly(String[] a){
        String[] list = a;
        double random = Math.random()*(list.length - 1);
        return list[(int)random];
    }
}
