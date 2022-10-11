//Created by Manisha Mavani
//9. Write a program to convert the upper case to lower case.
package javahomeworkweek6;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        upperLower();
    }
    //Static method
    public static void upperLower(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text in UpperCase letter : ");
        String text = scanner.nextLine();
        System.out.print("Text is converted into lowercase as : " + text.toLowerCase()); // text.toLowerCase is method to convert upper case to lower case
        scanner.close();


    }
}
