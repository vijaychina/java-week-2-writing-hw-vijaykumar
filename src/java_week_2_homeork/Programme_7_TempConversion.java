package java_week_2_homeork;

import java.util.Scanner;

/**
 * Write a Program to insert any temperature value in degree Fahrenheit
 * and covert to degree Celsius (F-32) x 5/9 = 0C.
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temprerature in fahrenheit : ");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        // closing scanner object
        scanner.close();
    }
    // Temprature conversion method

        public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9 );
            System.out.println("The temerature " + temp + " fahhrenheit is equal to " + c + " degree celsius");
    }    
}