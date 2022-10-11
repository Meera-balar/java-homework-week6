//Created by Manisha Mavani
/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
package javahomeworkweek6;

public class Program4 {
    int a = 20;
    String name = "Manisha Mavani";
    static int b = 30;
    static String job = "Software Tester";
    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.myFirstMethod();
        mySecondMethod();
    }
    //Instance Method
    public void myFirstMethod(){
        System.out.println(a);
        System.out.println(name);
        System.out.println(Program4.b);
        System.out.println(Program4.job);
    }
    //Static Method
    public static void mySecondMethod(){
        Program4 program4 = new Program4();
        System.out.println(program4.a);
        System.out.println(program4.name);
        System.out.println(b);
        System.out.println(job);


    }

}
