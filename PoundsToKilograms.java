// Karen Nurlybekov, Nikolay Sekerbayev, Om Padhyay, Deva Narayanan
// Program converts inputted by user weight in pounds to kilograms

package com.company;
import java.util.Scanner; // import Scanner class

public class PoundsToKilograms {
    static final double PND2KG = 0.453592; // declaration of constant variable 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object
        double inputPounds = 0.0; // variable declaration
        double resultKilograms = 0.0;  // variable declaration
        System.out.println("***Pounds to Kilograms Converter***");
        System.out.println("What weight in pounds?");
        inputPounds = scan.nextDouble(); // taking user's input
        resultKilograms = inputPounds * PND2KG; // calculation
        System.out.println("Converted: " + inputPounds + " pounds" + " = " +resultKilograms+ " kilograms"); // output of result
    }
}
