//Created by Manisha Mavani
//8. Write a program to calculate the area of a triangle.
package javahomeworkweek6;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
    triangle();
    }
    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter length of base : ");
        float b = scanner.nextFloat();
        System.out.print("Please enter length of height : ");
        float h = scanner.nextFloat();
        System.out.print("Area of Triangle is : " + (b*h)/2); // formula of area of triangle
        scanner.close();
    }
}
