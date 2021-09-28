// Karen Nurlybekov, Nikolay Sekerbayev, Om Padhyay, Deva Narayanan
// Program converts inputed by user number of gallons to litres

package com.company;
import java.util.Scanner; // import Scanner class

public class GallonsToLitres {
    static final double GAL2LT = 3.78541; // declaration of constant variable 
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); // Scanner object
    double inputGallons = 0.0; // variable declaration
    double resultLitres = 0.0; // variable declaration
    System.out.println("***Gallons to Litres Converter***");
    System.out.println("How many gallons?");
    inputGallons = scan.nextDouble(); // taking user's input
    resultLitres = inputGallons * GAL2LT; // calculation
    System.out.println("Converted: " + inputGallons + " gal" + " = " +resultLitres+ " litre"); // output of result
    }
}
