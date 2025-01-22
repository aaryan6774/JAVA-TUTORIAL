//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//    }
//}

//JDK = Used to develop Java applications
//JRE = Used to run Java applications
//JVM = Responsible for running java code

/*
public class Main{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}
*/

/*
public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
}
 */

/*
public class Main  {
    public static void  main(String[] args)
    {
        final int x = 10;
        if(x > 10)
        {
            System.out.println("Failed");
        }
        else
        {
            System.out.println("succesful");
        }
*/

/*
public class Main {
    public  static void main(String[] args)
    {
        String this  = "Hello World";
        System.out.println(this);
    }
}

 */

/*
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

    }

}
 */

/*
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        char a = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.5454;
        float f = 4.765777777777f;
        long l = 12312442;
    }
}
There are 8 main primitive data types in java as mentioned below:

 boolean
 byte
 char
 short
 int
 long
 float
 double
 */

/*
import  java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int var = 10;
        System.out.println("Local Variable: " + var);
    }
}

 */

/*
import  java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int x = 10;
        String message = "Hello";
        System.out.println("x = " + message);

        if(x > 5)
        {
            String result = "x is greater than 5";
            System.out.println(result);
        }

        for (int i = 0; i < 3; i++) {
            String loopMessage
                    = "Iteration "
                    + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }
    }
}
 */


/*
import java.io.*;
class Test {
    static int var = 10; // A static variable in the Test class
}

public class Main {
    public static void main(String[] args) {
        // Accessing the static variable from the Test class
        System.out.println(Test.var);
    }
}
*/

/*
public class Main {
    public static void  main(String[] args)
    {
        int num1 = 500;
        int num2 = 100;

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
 */

/*
import java.io.*;

class Geeks
{
    public static void main (String[] args)
    {

        // Arithmetic operators on integers
        int a = 10;
        int b = 3;

        // Arithmetic operators on Strings
        String n1 = "15";
        String n2 = "25";

        // Convert Strings to integers
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a1 + b1 = " + (a1 + b1));

    }
}
 */

/*

import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println((b--));
        System.out.println(--b);
    }
}

 */


/*
// Java Program to show the use of
// Unary Operators
import java.io.*;

// Driver Class
class Geeks {
    // main function
    public static void main(String[] args)
    {
        // Interger declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
 */


/*
// Java Program to show the use of
// Assignment Operators
import java.io.*;

// Driver Class
class Geeks {
    // Main Function
    public static void main(String[] args)
    {

        // Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
    }
}
 */


/*
// Java Program to show the use of
// Relational Operators
import java.io.*;

// Driver Class
class Geeks {
    // main function
    public static void main(String[] args)
    {
        // Comparison operators
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}
 */


/*
== , Equal to.
        != , Not equal to.
< , Less than.
<= , Less than or equal to.
> , Greater than.
        >= , Greater than or equal to.
*/

/*
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println((!x));
    }
}
 */


/*
public class Main {
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a << 1);
    }
}
 */

/*
import  java.util.Scanner;
import  java.io.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scn.nextInt();

        System.out.println("Enter a number again");
        int b = scn.nextInt();

        System.out.println(a + b);


        scn.close();

    }
}
 */


/*
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.next();

        System.out.println(str1);
        String str2 = scn.nextLine();
        System.out.println(str2);

        int x = scn.nextInt();
        System.out.println(x);

        Float f = scn.nextFloat();

        System.out.println(f);
    }
}

 */



/**  JAVA CONTROL FLOW **/
/*
// Java program to illustrate If statement
class GfG {
    public static void main(String args[])
    {
        int i = 10;

        // using if statement
        if (i < 15)
            System.out.println("10 is less than 15");

        System.out.println("Outside if-block");

        // both statements will be printed
    }
}


 */


/*
// Java program to illustrate If statement
class GFG {
    public static void main(String args[])
    {
        String str = "GeeksforGeeks";
        int i = 4;

        // if block
        if (i == 4) {
            i++;
            System.out.println(str);
        }

        // Executed by default
        System.out.println("i = " + i);
    }
}
 */

/*// Java program to illustrate the if else statement
public class IfElseExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("a is true");
        } else {
            System.out.println("a is false");
        }

        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
    }
}

 */


/*
// Java Program to demonstrate
// if-else statement
public class IfElse {

    public static void main(String[] args) {

        int n = 10;

        if (n > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is 5 or less.");
        }
    }
}
 */

/*
// Java Program to implement
// Nested if statement
public class NestedIf {

    public static void main(String[] args) {

        int a = 25;
        double w = 65.5;

        if (a >= 18) {
            if (w >= 50.0) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}
 */


/*
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner snc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = snc.nextInt();

        if(x <= 10)
        {
            System.out.println("Number less than or ");
        } else if (x >= 20) {
            System.out.println("Number is Greater than 10");
        }
        else {
            System.out.println("Number We Cannot define");
        }
    }
}
 */

/*
// Java program to illustrate if-else-if ladder
import java.io.*;

class GFG {

    public static void main(String[] args) {

        // initializing expression
        int i = 20;

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");

        // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");

        // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");

        else
            System.out.println("i is not present\n");

        System.out.println("Outside if-else-if");
    }
}
 */


/*
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        for(int i = 1; i<= 5; i++)
        {
            System.out.println(i);
        }
    }
}
 */

/*

import java.io.*;
import java.util.Scanner;

public class Main {
    public void main(String[] args)
    {
        int s = 0;
        for(int i = 0; i<10; i++)
        {
            s+=i;
        }
        System.out.println(s);
    }
}
 */

    /*
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<4; i++){
            System.out.println("Infinite Loop");
        }
    }
}

*/


    /*
public class Main {
    public static void main(String[] args)
    {
        int c = 1;
        while (c <= 5)
        {
            System.out.println(c);
            c=+1;
        }
    }
}

     */


    /*
public class Main {
    public static void main(String[] args) {

        // Initialize the counter variable
        int c = 1;

        // While loop to print numbers from 1 to 5
        while (c <= 5) {

            System.out.println(c);

            // Increment the counter
            c++;
        }
    }
}
     */


    /*
public class Main {
    public static void main(String[] args)
    {
        int i = 1;
        while (i < 6)
        {
            System.out.println("Hello");
            i++;
        }
    }
}
     */

/*
// Java program to illustrate while loop
class whileLoop {
    public static void main(String args[])
    {
        int i = 1, s = 0;

        // loop continues until i becomes greater than 10
        while (i <= 10) {

            // add the current value of i to s
            s = s + i;

            // increment i for the next iteration
            i++;
        }
        System.out.println("Summation: " + s);
    }
}
 */

/*
// Java program to show the use of do while loop
public class GFG {

    public static void main(String[] args) {

        int c = 1;

      // Using do-while loop
        do {
            System.out.println("GeeksforGeeks: " + c);
            c++;
        } while (c <= 5);
    }
}
 */


/*
// Java Program to Illustrate One Time
// Iteration Inside do-while Loop
// When Condition is Not Satisfied
class GFG {

    public static void main(String[] args)
    {
        // initial counter variable
        int c = 0;

        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print Statement");
            c++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (c < 0);
    }
}
 */

/*// Java Program to Illustrate break statement
import java.io.*;

class GFG {

    public static void main (String[] args) {

      //assigning n as integer value
      int n = 1;

      //passing n to switch
      // it will check n and display output accordingly
      switch(n) {

        case 1:
          System.out.println("GFG");
          break;
        case 2:
          System.out.println("Second Case");
          break;
        default:
          System.out.println("default case");
      }
    }
}

 */

/*
// Java program to illustrate using
// break to exit a loop
class BreakLoop {

    public static void main(String args[]) {

        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {

            // terminate loop when i is 5
            if (i == 5)
                break;

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
 */


/*
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Before Break Statement");
                }
            }
        }
    }
}
 */

// Java Program to illustrate the use of continue statement

//public class Main {
//    public static void main(String args[]){
//
//        // For loop for iteration
//        for (int i = 0; i <=5; i++) {
//
//            // Check condition for continue
//            // skip the execution of loop when i==3
//            if (i == 3)
//                continue;
//
//            System.out.print(i + " ");
//        }
//    }
//}

// Java Program to illustrate the use of continue statement
// inside an inner loop or simply nested loops


/*
import java.util.*;

public class Main {
    public static void main(String[] args){

        // Outer loop for iteration
        for (int i = 1; i <= 4; i++) {

            // Inner loop for iteration
            for (int j = 1; j <= 3; j++) {

                // Continue statement in inner loop to
                // skip the execution when i==3
                if (i == 3 && j==2) {
                    continue;
                }

                System.out.print(i+"."+j+"  ");
            }

            System.out.println();
        }
    }
}

 */



/*
// Java Program to implement continue
// And break in same loop
import java.io.*;

class GFG
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            // Skip condition where i==3
            if (i == 3)
                continue;

            // Exit the loop when i == 7
            if (i == 7)
                break;

            System.out.print(i + " ");
        }
    }
}

 */


/*
import java.io.*;
import java.util.Scanner;

public class aa {
    double avg(double x, double y)
    {
        double res = (x + y)/2.0;
        return res;
    }
    public static void main(String[] args)
    {
        System.out.println(new aa().avg(2.2, 2,4));
    }
}
 */

/*
// Java Program to Illustrate Usage of return Keyword
class Geeks {

    // Method to calculate average
    double avg(double x, double y) {
        double res = (x + y) / 2.0;
        return res;    // Return the calculated result
    }

    // Main driver method
    public static void main(String[] args) {
        System.out.println(new Geeks().avg(5.5, 6.5));
    }
}
 */

/*
public class Main {
    void calc(int a, int b)
    {
        int res = (a + b)/10;
        System.out.println(res);
    }
    public static void main(String[] args)
    {
        new Main().calc(5,5);
        System.out.println("No return");
    }
}

 */

/*
// Java program to illustrate usage
// of return keyword in void method
class Geeks {

    // Method to check a condition
    void check(double v) {
        if (v < 9) {
            return;   // Exit method if condition is met
        }
        v++;
    }

    // Main driver method
    public static void main(String[] args) {
        Geeks o = new Geeks();
        o.check(5.5);
        System.out.println("Program executed successfully");
    }
}
 */

/** JAVA METHODS **/

//Java Methods are blocks of code that perform a specific task

    /*
public class Main {

    public void printMessage()
    {
        System.out.println("hello Geeks");
    }
    public static void main(String[] args){
        Main m = new Main();
        m.printMessage();

    }
}
     */

    /*
class Add{
    int s = 0;
    public int add2ints(int a, int b)
    {
        s = a + b;
        return s;
    }
}
class Main{
    public static void main(String[] args){
        Add a = new Add();
        int res = a.add2ints(1, 2);
        System.out.println(res);
    }
}
     */

/*
class GFG
{
    void hello(){
        System.out.println("This is");
    }
    public static void main(String[] args){
        GFG obj = new GFG();
        obj.hello();
    }
}
 */

    /*
class Aaryan{
    void hello(){
        System.out.println("This is Good");
    }
    public static void main(String[] args){
        Aaryan obj = new Aaryan();
        obj.hello();

    }
}
     */

    /*
public class Main {
    public static void main(String[] args)
    {
        Main ob = new Main();
        System.out.println(ob.hashCode());
    }
}
     */


/*
// Java Program to call Static Methods
import java.io.*;

class test {

    // Static method
    static void hello()
    {
        System.out.println("Hello");
    }
}

class GFG {

    public static void main(String[] args) {

        // calling the Method 1
        // Accessing method
        test.hello();
    }
}
 */


/** Arrays in JAVA **/

/*
public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
 */

    /*

class Main{
    public static void main(String[] args)
    {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++)
        System.out.println("Element at index "
                + i + " : " + arr[i]);
    }
}

     */
/*
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        System.out.println(arr[0].length);
    }
}
*/

// Java Program to Multidimensional Array
/*
// Driver Class
public class Main {
    // main function
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}
 */

    /*
public class Main {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
     */


// Java Program to Demonstrate
// Multi Dimensional Array
/*
import java.io.*;

public class Main {
    public static void main(String[] args){

        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);
    }
}
 */

/*
import java.io.*;
class Main{
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3}, {1,2,3}};
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}

 */


import java.awt.desktop.SystemSleepEvent;
import java.awt.geom.Arc2D;
import java.sql.Struct;

/** OOPS IN JAVA **/

/*
import java.io.*;
class Numbers{
    private int a;
    private int b;

    public void sum() {
        System.out.println(a + b);
    }
    public void sub(){
        System.out.println(a - b);
    }

    public static void  main(String[] args)
    {
        Numbers obj = new Numbers();
        obj.a = 1;
        obj.b = 2;

        obj.sub();
        obj.sum();
    }
}

*/

/*
import java.io.*;
class Aaryan{
    private int rollNum;
    private int enroll;

    public void Diff(){
        System.out.println(rollNum + enroll);
    }
    public void Diff2(){
        System.out.println(rollNum-enroll);
    }


    public static void main(String[] args)
    {
        Aaryan obj = new Aaryan();

        obj.enroll = 1001;
        obj.rollNum = 10023;

    }
}


 */

/*
import java.io.*;
import java.util.Scanner;

public class Main {
    static String Emplyee_name;
    static float Employee_salary;

    static void set(String n, float p)
    {
        Employee_name = n;
        Employee_salary = p;
    }

    static void set(String n, float p){
        Employee_salary = p;
        Employee_name = n;
    }
    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }


    public static void main(String args[]) {
        Main.set("Rathod Avinash", 10000.0f);
        Main.get();
    }
}

 */

    /*
class Student{
    int id;
    String n;
    public static void  main(String args[])
    {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
*/

/*
public class Dog{
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }
    @Override public String toString()
    {
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }

    public static void main(String[] args)
    {
        Dog tuffy
                = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}

 */

/**
Abstraction in java --> it is the process of hiding the implementation details and only showing the essential functionality ot feature
**/
/*
// Demonstrating Abstraction in Java
abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Geeks {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class Main {
    public static void main(String[] args) {
        Geeks remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
*/

/*
import java.io.*;

// Interface Declared
interface testInterface {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// Class implementing interface
class TestClass implements testInterface {

    // Implementing the capabilities of
    // Interface
    public void display(){
        System.out.println("Geek");
    }
}

class Main
{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }

}

 */


    /*
public class Main {
    public static void main(String[] args)
    {
        String name = "Aaryan Vasalya";
                int length = name.length();
    }
}
*/

    /*
public class Main{
    String Color;
    String brand;
    String model;
    int year;
    int speed;

    public void acclerate(int increment)
    {
        speed += increment;
    }
    public void brake(int decrement)
    {
        speed -= decrement;
    }
}

*/


/** MULTITHREADING IN JAVA **/

//multithreading refers to the ability to execute multiple threads whithin a single process concurrentlty
//multithreading enhances the efficiency of multitasking
/*
public class Main {
    public static void main(String[] args)
    {
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();

        for (int i = 0; i<100000; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
 */

//Class -> blueprint for creating objects.
//it defines the structure and behavior of objects.

/*
class Car{
    String color;
    int speed;

    void drive(){
        System.out.println("Car is Driving");
    }
}
public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.speed = 110;
        car.color = "Green";
        car.drive();
    }
}

 */

    /*
class Car{
    int speed;
    private String color;

    void drive(){
        System.out.println("Driving...");
    }
}

     */

    /*

class Animal{
    void eat(){
        System.out.println("This animal eats");
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("Dog barks");
        }
    }
}

     */
/*
class Calculator{
    int add(int a, int b)
    {
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println((calc.add(4,5, 8)));
    }
}
 */

    /*
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks...");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meow...");
    }
}
public class Main {
    public static void main(String[] args){
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();
    }
}


     */

/*
import java.io.*;
import java.util.Scanner;
class Number{
    // Proeperties
    private int a;
    private int b;


    // Methods
    public void sum(){
        System.out.println(a + b);
    }
    public void sub(){
        System.out.println(a - b);
    }

    public static void main(String[] args) {

        // Creating INstance of class
        Number obj = new Number();
        // Assiging values
        obj.a = 1;
        obj.b = 2;


        //Using the methods
        obj.sub();
        obj.sum();
    }
}

 */

    /*
class GFG {
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p)
    {
        Employee_salary = p;
        Employee_name = n;
    }
    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String[] args) {
        GFG.get();
    }
}


     */

/*
import java.io.*;
class Student{
    int id;
    String name;
    public void printStudent(){
        System.out.println("Id:" + id);
        System.out.println("Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 1;
        obj.name = "Abc";
        obj.printStudent();
    }
}

 */

//abstract  class  GFG{
//    abstract void add();
//    abstract  void nul();
//    abstract  void div();
//}

/** Encapsulation **/
/*
class Employee{
    private int empid;
    private String ename;

    public void set_id(int empid) {
        this.empid = empid;
    }
    public void set_name(String ename)
    {
        this.ename = ename;
    }
    public String get_name(){
        return ename;
    }
}
public class Main{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set_id(89);
        e.set_name("John");

        System.out.println(e.get_name());
        System.out.println(e.get_id());
    }
}
 */

    /*
class A{
    void method(){}
    void  method1(){}
}
class B extends A{
    void method3(){}
    void method4(){}
}

     */
/*
class Parent{
    public void func(){
        System.out.println("this is parent method function");
    }
    public void func(int a){
        System.out.println("Parent Method" + a);
    }
}
class Child extends  Parent{
    @Override
    public void func(int a) {
        System.out.println("Child Method" + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.func();
        obj1.func(5);

        Child obj2 = new Child();
        obj2.func(4);
    }
}
 */

/** JAVA FULL COURCE **/

//JAVA platform independent
//JDK --> development kit
//JRE --> run time environment
//JVM --> actuall place whre program runs

//.java
//.class

//code --> byte code
    /*
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
     */
    /*
public class Main {
    public static void main(String[] args) {
//        System.out.println(1);
        int a = 1;
        byte b = 1;
        short c = 1;
        long d = 1;
        System.out.println(a);
    }
}
     */

    /*
public class Main {
    public static void main(String[] args) {
//        boolean isAdult = true;
//        isAdult = false;
        int a = 1;
        String n = "aaryan_vasalya";
        System.out.println(n);
//        System.out.println((int)n);
    }
}
     */

    /*
public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1 == str2);
//        String b = "Hello";
//        b = b.toUpperCase();
//        System.out.println(b);
        int a = 5 + 3;
        int b = 10 / 4;
        System.out.println(b);
        a +=5;
        a -=2;
        a /= 3;
        a %= 2;
        System.out.println(a);

    }
}


     */

    /*
public  class Main {
    public static void main(String[] args) {
        int z = 1;
        System.out.println(z++ + --z);
        System.out.println(z-- + ++z);

    }
}
     */

    /*
public class Main {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
    }
}
     */


//A and b  == TRUE
    /*
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.print(a & b);
        System.out.print(a | b);
        System.out.print((a ! b));
    }
}
     */

/*
public class Main {
    public static void main(String[] args) {
        System.out.print(1 != 2 && 1 < 2);
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isGood = isSunny && isWarm;
        System.out.print(isGood);

        if(isSunny && isWarm)
        {
            System.out.print("Hello");
        }
        else
        {
            System.out.println("HelloWOrld");
        }
    }
}
 */

    /*
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i <= 10);
    }
}
     */

    /*
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int nums[] = {1,23,4,5,6,6,7,8};
        for (int i = 0; i< nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}     */

//Import driver
//load driver
//REgister Driver
//Create connection
//close connection

/** OOPS **/

//Object Oriednted Programmming
//In Java
//Object Oriented progreamming in Java

//OOPs
//OOPs --> Object Oriendted Programming in Java

    /*
class Car{
    String color;
    int speed;
    void drive(){
        System.out.println("Car is Driving");
    }
}
public class Main{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.drive();
    }
}

     */
public class Main {
    public static void main(String[] args)
    {
        
    }
}
