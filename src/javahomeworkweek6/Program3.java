//Created by Manisha Mavani
/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/
package javahomeworkweek6;

public class Program3 {
    int m = 5; //Instance variable
    static int n = 25; //Static variable

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.myFirstMethod(); //Calling Instance method
        mySecondMethod(); //Calling Static method
    }
    //Instance Method
    public void myFirstMethod(){
        System.out.println(m); //Printing Instance variable to Instance method
        System.out.println(Program3.n); //Printing Static variable to Instance method
    }
    //Static Method
    public static void mySecondMethod() {
        Program3 program3 = new Program3(); // object creation
        System.out.println(program3.m); //Printing Instance variable to Static method
        System.out.println(n); ////Printing Static variable to Static method
    }
}

