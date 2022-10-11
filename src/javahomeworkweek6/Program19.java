//Created by Manisha Mavani
/*19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
*/
package javahomeworkweek6;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        System.out.println("Sample Input : THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        System.out.print("Output : " + "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".toLowerCase());
    }
}
