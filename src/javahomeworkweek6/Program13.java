//Created by Manisha Mavani
//13. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package javahomeworkweek6;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        average();
    }
    public static void average(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First number : ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter Second number : ");
        float number2 = scanner.nextFloat();
        System.out.print("Enter Third number : ");
        float number3 = scanner.nextFloat();
        System.out.println("Average of entered number is = " + (number1+number2+number3)/3);
        scanner.close();
    }
}
