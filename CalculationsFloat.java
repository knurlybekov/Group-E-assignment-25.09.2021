// Karen Nurlybekov, Nikolay Sekerbayev, Om Padhyay, Deva Narayanan
// Program counts 2 user-entered digits with +, -, *, /, % operators, but the resulting values are not rounded

package com.company;
import java.util.Scanner; // import Scanner class

public class CalculationsFloat {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // Scanner object
        float inputValue1 = 0; // variable declaration
        float inputValue2 = 0; // variable declaration
        float resultSum = 0; // variable declaration
        float resultDifference = 0; // variable declaration
        float resultProduct = 0; // variable declaration
        float resultQuotient = 0; // variable declaration
        float resultRemainder = 0; // variable declaration
 

        System.out.println("Please enter two values for the love of God!");
        System.out.println("And your first value will be...");
        inputValue1 = scan.nextFloat(); // taking user`s 1st number
        System.out.println("Interesting... What about your second value?");
        inputValue2 = scan.nextFloat(); // taking user`s 2nd number


        resultSum = inputValue1 + inputValue2; // calculation with +
        resultDifference = inputValue1 - inputValue2; // calculation with -
        resultProduct = inputValue1 * inputValue2; // calculation with *
        resultQuotient = inputValue1 / inputValue2; // calculation with /
        resultRemainder = inputValue1 % inputValue2; // calculation with %


        System.out.println ("The calculations for " + inputValue1 +"and " + inputValue2 + "are:") ;
        System.out.println (inputValue1 + " + " + inputValue2 + " = " + resultSum); // output of + calculation
        System.out.println (inputValue1 + " - " + inputValue2 + " = " + resultDifference); // output of - calculation
        System.out.println (inputValue1 + " * " + inputValue2 + " = " + resultProduct); // output of * calculation
        System.out.println (inputValue1 + " / " + inputValue2 + " = " + resultQuotient); // output of / calculation
        System.out.println (inputValue1 + " % " + inputValue2 + " = " + resultRemainder); // output of % calculation
    }
}
