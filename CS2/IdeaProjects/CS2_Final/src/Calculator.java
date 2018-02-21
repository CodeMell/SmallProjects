/*
The goal here was to make an infix calculator using 2 stacks. I had trouble with getting the stacks to work properly and
also with getting the input and sorting through it efficiently. I tried several ways using scanners and Stdin and tried deliminating it
into characters to compare them but in the end the simpler solution was better. This project helped me understand stacks and switch
statements better.
 */
import Stacks.Stack;
import com.sedgewick.stdlib.*;
/**
 * Created by codymellon on 4/22/16.
 */
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result = 0;
        String op;
        //give instructions
        StdOut.println("Enter a problem in infix notation with spaces between each character");
        //get input
        String[] tokens = StdIn.readAllStrings();
        //create stacks
        Stack<Double> nums = new Stack<>();
        Stack<String> operators = new Stack<>();
        //start loop to sort input into stacks
        for (int i = 0; i < tokens.length; i++) { //push into stacks
            if (tokens[i].equals("(")) {
            //do nothing if token is a "("
            } else if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                operators.push(tokens[i]);//push operators into operator stack
            } else if (tokens[i].equals(")")) {
                //perform the most recent operation on the most recent 2 numbers when a ")" is found
                num1 = nums.pop();//pop out first number to be operated on
                num2 = nums.pop();//pop out second number
                op = operators.pop();//pop operator out
                switch (op) {//decide which operation to perform based on the operator that was popped out
                    case "+"://addition case
                        result = num1 + num2;
                        break;
                    case "-"://subtraction case
                        result = num2 - num1;//flip numbers because of lifo
                        break;
                    case "*"://multiplication case
                        result = num1 * num2;
                        break;
                    case "/"://division case
                        result = num2 / num1;//flip numbers because of lifo
                        break;
                    default :
                        StdOut.println("Something happened.");//error message in case there is no matching operator
                }
                nums.push(result);//push resulting number back into the number stack
            } else {//assume if token was not a parenthesis or operator it is a number. push number into nums stack
                nums.push(Double.valueOf(tokens[i]));
            }
        }
        while(!operators.isEmpty()){//empty operator stack which should be empty anyway
            StdOut.println(operators.pop());
        }
        while(!nums.isEmpty()){//empty numbers stack to reveal the answer
            StdOut.println("The answer is: " + nums.pop());
        }
    }
}


