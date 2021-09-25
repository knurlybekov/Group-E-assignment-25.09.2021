package com.company;
import java.util.Scanner;

public class GallonsToLitres {
    static final double GAL2LT = 3.78541;
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    double inputGallons = 0.0;
    double resultLitres = 0.0;
    System.out.println("***Gallons to Litres Converter***");
    System.out.println("How many gallons?");
    inputGallons = scan.nextDouble();
    resultLitres = inputGallons * GAL2LT;
    System.out.println("Converted: " + inputGallons + " gal" + " = " +resultLitres+ " litre");
    }
}
