// Karen Nurlybekov, Nikolay Sekerbayev, Om Padhyay, Deva Narayanan

package com.company;
import java.util.Scanner;

public class PoundsToKilograms {
    static final double PND2KG = 0.453592;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputPounds = 0.0;
        double resultKilograms = 0.0;
        System.out.println("***Pounds to Kilograms Converter***");
        System.out.println("What weight in pounds?");
        inputPounds = scan.nextDouble();
        resultKilograms = inputPounds * PND2KG;
        System.out.println("Converted: " + inputPounds + " pounds" + " = " +resultKilograms+ " kilograms");
    }
}
