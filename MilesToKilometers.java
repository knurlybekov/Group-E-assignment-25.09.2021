package com.company;
import java.util.Scanner;

public class MilesToKilometers {
    static final double MIL2KM = 1.60934;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputMiles = 0.0;
        double resulKilometers = 0.0;
        System.out.println("***Miles to Kilometers Converter***");
        System.out.println("What the distance in Miles?");
        inputMiles = scan.nextDouble();
        resulKilometers = inputMiles * MIL2KM;
        System.out.println("Converted: " + inputMiles + " miles" + " = " +resulKilometers+ " kilometers");
    }
}
