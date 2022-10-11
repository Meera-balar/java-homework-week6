//Created by Manisha Mavani
//15. Write a Java program to swap two variables.


package javahomeworkweek6;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {

        swap();
    }
    public static void swap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap number is as below :");
        System.out.print("First number = " );
        int number1 = scanner.nextInt();
        int temporary = number1;  // Value of firstnumber is assigned to temporary
        System.out.print("Second number = " );
        int number2 = scanner.nextInt();
        // Value of second is assigned to first
        number1 = number2;
        // Value of temporary (which contains the initial value of first) is assigned to second
        number2 = temporary;
        System.out.println("After swapping number is as below :");
        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);
    }
}