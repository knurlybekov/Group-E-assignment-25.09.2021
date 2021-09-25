package com.company;
import java.util.Scanner;

public class CalculationsFloat {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float inputValue1 = 0;
        float inputValue2 = 0;
        float resultSum = 0;
        float resultDifference = 0;
        float resultProduct = 0;
        float resultQuotient = 0;
        float resultRemainder = 0;


        System.out.println("Please enter two values for the love of God!");
        System.out.println("And your first value will be...");
        inputValue1 = scan.nextFloat();
        System.out.println("Interesting... What about your second value?");
        inputValue2 = scan.nextFloat();


        resultSum = inputValue1 + inputValue2;
        resultDifference = inputValue1 - inputValue2;
        resultProduct = inputValue1 * inputValue2;
        resultQuotient = inputValue1 / inputValue2;
        resultRemainder = inputValue1 % inputValue2;


        System.out.println ("The calculations for " + inputValue1 +"and " + inputValue2 + "are:") ;
        System.out.println (inputValue1 + " + " + inputValue2 + " = " + resultSum);
        System.out.println (inputValue1 + " - " + inputValue2 + " = " + resultDifference);
        System.out.println (inputValue1 + " * " + inputValue2 + " = " + resultProduct);
        System.out.println (inputValue1 + " / " + inputValue2 + " = " + resultQuotient);
        System.out.println (inputValue1 + " % " + inputValue2 + " = " + resultRemainder);
    }
}