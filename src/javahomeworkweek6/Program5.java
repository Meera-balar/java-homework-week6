//Created by Manisha Mavani
/*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/

package javahomeworkweek6;

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double number2 = scanner.nextDouble();
        System.out.println("Please select the operation : '+' , '-' , '*' , '/'");
        char operator = scanner.next().charAt(0);
        if (operator == '+') {                      //If statement use for selecting different operations for calculator
            System.out.println("Result is : ");
            Program5 obj = new Program5();
            obj.addition(number1, number2);
        }
        if (operator == '-') {
            System.out.println("Result is : ");
            Program5 obj = new Program5();
            obj.subtraction(number1, number2);
        }
        if (operator == '*') {
            System.out.println("Result is : ");
            multiplication(number1, number2);
        }
        if (operator == '/') {
            System.out.println("Result is : ");
            division(number1, number2);
        }
        scanner.close();
    }
    public void addition(double number1, double number2) {

        System.out.println(number1 + number2);
    }
    public void subtraction(double number1, double number2) {

        System.out.println(number1 - number2);
    }
    public static void multiplication(double number1, double number2) {

        System.out.println(number1 * number2);
    }
    public static void division(double number1, double number2) {

        System.out.println(number1 / number2);
    }
}
