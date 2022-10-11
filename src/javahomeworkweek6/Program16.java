//Created by Manisha Mavani
/*16. Write a Java program to add two binary numbers.
 Input Data: Input first binary number: 10
 Input second binary number: 11
 Expected Output: Sum of two binary numbers: 101
*/
package javahomeworkweek6;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        add();
    }
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First binary number = ");
        String num1 = scanner.nextLine(); //to defined binary values first value taken as string variable
        int a = Integer.parseInt(num1, 2);  // to convert string to decimal or integer here Integer.parseInt is used , 2 is used for giving binary base 2
        System.out.print("Enter Second binary number = ");
        String num2 = scanner.nextLine();
        int b = Integer.parseInt(num2, 2);
        int sum = a+b;   //now as we get integer number we just added to get addition
        System.out.println("Expected Output: Sum of two binary numbers = " + Integer.toBinaryString(sum)); //  addition of two number is now converted to binary string by using toBinaryString() method.
        scanner.close();
    }
}
