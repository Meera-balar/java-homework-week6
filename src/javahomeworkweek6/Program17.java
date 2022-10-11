//Created by Manisha Mavani
/*17. Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5
Expected Output Binary number is: 101
*/
package javahomeworkweek6;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Decimal Number : ");
        int num = scanner.nextInt();
        System.out.print("Output Binary number is : "+Integer.toBinaryString(num));
    }
}
