// Created by Manisha Mavani
/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5
Expected Output: Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
package javahomeworkweek6;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        rectangle();
    }
    public static void rectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Test Data : " + "Width = ");
        float width = scanner.nextFloat();
        System.out.print("Enter Test Data : " + "Height = ");
        float height = scanner.nextFloat();
        System.out.println("Expected output : Area is Width * Height = " + width*height);
        System.out.println("Perimeter is : 2 * (Width+Height) = " + 2*(width+height));
        scanner.close();

    }
}
