// public class Input {
// public static void main (String[]args){

// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // float a = sc.nextFloat();
// // String name = sc.next();
// // String line = sc.nextLine();

// }
// }

// // Java Program for taking user
// // input using BufferedReader Class
// import java.io.*;

// class GFG {

// // Main Method
// public static void main(String[] args)
// throws IOException
// {
// // Creating BufferedReader Object
// // InputStreamReader converts bytes to
// // stream of character
// BufferedReader bfn = new BufferedReader(
// new InputStreamReader(System.in));

// // String reading internally
// String str = bfn.readLine();

// // Integer reading internally
// int it = Integer.parseInt(bfn.readLine());

// // Printing String
// System.out.println("Entered String : " + str);

// // Printing Integer
// System.out.println("Entered Integer : " + it);
// }
// }

/* package whatever //do not write package name here */

// import java.io.*;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// class Easy {
// public static void main(String[] args)
// {
// // creating the instance of class BufferedReader
// BufferedReader reader = new BufferedReader(
// new InputStreamReader(System.in));
// String name;
// try {
// System.out.println("Enter your name");
// name = reader.readLine(); // taking string input
// System.out.println("Name=" + name);
// }
// catch (Exception e) {
// }
// }
// }

//
//
//
//
// /
// //
// // / Java program to demonstrate working of System.console()
// // Note that this program does not work on IDEs as
// // System.console() may require console
// public class Sample {
// public static void main(String[] args)
// {
// // Using Console to input data from user
// String name = System.console().readLine();/
// // / Java program to demonstrate working of System.console()
// // Note that this program does not work on IDEs as
// // System.console() may require console
// public class Sample {
// public static void main(String[] args)
// {
// // Using Console to input data from user
// String name = System.console().readLine();

// System.out.println("You entered string " + name);
// }
// }

// System.out.println("You entered string " + name);
// }
// }

//
//
// //
// //
// //
// // // Java Program to Illustrate BufferedReader Class

// // Importing required class
// import java.io.*;

// // Main class
// class GFG {

// // Main driver method
// public static void main(String args[])
// throws IOException
// {

// // Creating object of class inside main() method
// BufferedReader br = new BufferedReader(
// new InputStreamReader(System.in));

// System.out.println("Enter an integer");

// // Taking integer input
// int a = Integer.parseInt(br.readLine());

// System.out.println("Enter a String");

// String b = br.readLine();

// // Printing input entities above
// System.out.printf("You have entered:- " + a
// + " and name as " + b);
// }
// }