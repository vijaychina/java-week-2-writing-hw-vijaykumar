package java_week_2_homeork;

import java.util.Scanner;

/**
 * Write a program to enter radius value og the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //Closing the scanner object
        scanner.close();

    }
    // Calculating rthe area of circle
    public static void areaOfCircle(double radius) {


        double pi = Math.PI;
        double area = (pi * radius);
        System.out.println("The Area of Circle is :  " + area );
    }

}