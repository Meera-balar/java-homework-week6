//Created by Manisha Mavani
/*20. Write a Java Program to print as below.
"+------------------------+"
"|                        |"
"|     CORNER STORE       |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+"
 */

package javahomeworkweek6;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date (YYYY-MM-DD) "+"Enter Time (hh:mm or hh:mm)"+"AM or PM?"); // 2022-10-11 02:30PM
        String datetime = scanner.nextLine();
        System.out.println("Enter Gallons :");
        float gallons = scanner.nextFloat();
        System.out.println("Enter Price/gallon :");
        float pricePerGallon = scanner.nextFloat();
        float fuelTotal = gallons*pricePerGallon;
        float fuelTotalroundoff = (float) Math.round(fuelTotal*100)/100;
        System.out.println(" \"+----------------------------+\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"|        CORNER STORE        |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"|   " +datetime+"       |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"| Gallons:        "+gallons+ "      |\" ");
        System.out.println(" \"| Price/gallon:  $ "+pricePerGallon+"     |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"| Fuel total:    $ "+fuelTotalroundoff+"     |\" ");
        System.out.println(" \"|                            |\" ");
        System.out.println(" \"+----------------------------+\" ");
        scanner.close();
    }
}

