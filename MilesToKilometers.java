// Karen Nurlybekov, Nikolay Sekerbayev, Om Padhyay, Deva Narayanan
// Program converts inputted by user length in miles to kilometers

package com.company;
import java.util.Scanner; // import Scanner class

public class MilesToKilometers {
    static final double MIL2KM = 1.60934; // declaration of constant variable 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object
        double inputMiles = 0.0; // variable declaration
        double resulKilometers = 0.0; // variable declaration
        System.out.println("***Miles to Kilometers Converter***");
        System.out.println("What the distance in Miles?");
        inputMiles = scan.nextDouble(); // taking user's input
        resulKilometers = inputMiles * MIL2KM;  // calculation
        System.out.println("Converted: " + inputMiles + " miles" + " = " +resulKilometers+ " kilometers"); // output of result
    }
}
