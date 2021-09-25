package com.company;
import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int inputValue1 = 0;
        int inputValue2 = 0;
        int resultSum = 0;
        int resultDifference = 0;
        int resultProduct = 0;
        int resultQuotient = 0;
        int resultRemainder = 0;


        System.out.println("Please enter two values for the love of God!");
        System.out.println("And your first value will be...");
        inputValue1 = scan.nextInt();
        System.out.println("Interesting... What about your second value?");
        inputValue2 = scan.nextInt();


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
