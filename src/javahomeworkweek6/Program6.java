//Created by Manisha Mavani
//Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

package javahomeworkweek6;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        circle();
    }
    public static void circle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius for circle r = ");
        float r = scanner.nextFloat();
        float PI = 3.14f;
        System.out.print("Area of Circle is = " + (PI*r*r)); // formula of area of circle
        scanner.close();
    }
}
