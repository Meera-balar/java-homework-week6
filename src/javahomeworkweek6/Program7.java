//Created by Manisha Mavani
//Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).

package javahomeworkweek6;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
       temperature();
    }
    public static void temperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter temperature value in degree Fahrenheit : ");
        float F = scanner.nextFloat();
        System.out.print("Temperature from Fahrenheit to degree Celsius is : " + ((F-32)*5/9)); // formula of area of circle
        scanner.close();
    }
}
