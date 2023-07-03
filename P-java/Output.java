// public // Java program to demonstrate working of printf()
//
// class JavaFormatter1 {
// public static void main(String args[])
// {
// int x = 100;
// System.out.printf(
// "Printing simple integer: x = %d\n", x);

// // this will print it upto 2 decimal places
// System.out.printf(
// "Formatted with precision: PI = %.2f\n",
// Math.PI);

// float n = 5.2f;

// // automatically appends zero to the rightmost part
// // of decimal
// System.out.printf(
// "Formatted to specific width: n = %.4f\n", n);

// n = 2324435.3f;

// // here number is formatted from right margin and
// // occupies a width of 20 characters
// System.out.printf(
// "Formatted to right margin: n = %20.4f\n", n);
// }
// }
// {

// }

// //////////////////////////output format in java

// // Java program to demonstrate working of printf()

// class JavaFormatter1 {
// public static void main(String args[])
// {
// int x = 100;
// System.out.printf(
// "Printing simple integer: x = %d\n", x);

// // this will print it upto 2 decimal places
// System.out.printf(
// "Formatted with precision: PI = %.2f\n",
// Math.PI);

// float n = 5.2f;

// // automatically appends zero to the rightmost part
// // of decimal
// System.out.printf(
// "Formatted to specific width: n = %.4f\n", n);

// n = 2324435.3f;

// // here number is formatted from right margin and
// // occupies a width of 20 characters
// System.out.printf(
// "Formatted to right margin: n = %20.4f\n", n);
// }
// }

// Printing simple integer: x = 100
// Formatted with precision: PI = 3.14
// Formatted to specific width: n = 5.2000
// Formatted to right margin: n = 2324435.2500

// //
// //
// //
// // // Java program to demonstrate working of DecimalFormat
// import java.text.DecimalFormat;

// class JavaFormatter2 {
// public static void main(String args[])
// {
// double num = 123.4567;

// // prints only numeric part of a floating number
// DecimalFormat ft = new DecimalFormat("####");
// System.out.println("Without fraction part: num = "
// + ft.format(num));

// // this will print it upto 2 decimal places
// ft = new DecimalFormat("#.##");
// System.out.println(
// "Formatted to Give precision: num = "
// + ft.format(num));

// // automatically appends zero to the rightmost part
// // of decimal instead of #,we use digit 0
// ft = new DecimalFormat("#.000000");
// System.out.println(
// "appended zeroes to right: num = "
// + ft.format(num));

// // automatically appends zero to the leftmost of
// // decimal number instead of #,we use digit 0
// ft = new DecimalFormat("00000.00");
// System.out.println(
// "formatting Numeric part : num = "
// + ft.format(num));

// // formatting money in dollars
// double income = 23456.789;
// ft = new DecimalFormat("$###,###.##");
// System.out.println("your Formatted Dream Income : "
// + ft.format(income));
// }
// }
// Output

// Without fraction part: num = 123
// Formatted to Give precision: num = 123.46
// appended zeroes to right: num = 123.456700
// formatting Numeric part : num = 00123.46
// your Formatted Dream Income : $23,456.79

//
//
//
// //
// //
// //
// // // Java program to demonstrate working of SimpleDateFormat

// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// class Formatter3 {
// public static void main(String args[])
// throws ParseException
// {
// // Formatting as per given pattern in the argument
// SimpleDateFormat ft
// = new SimpleDateFormat("dd-MM-yyyy");
// String str = ft.format(new Date());
// System.out.println("Formatted Date : " + str);

// // parsing a given String
// str = "02/18/1995";
// ft = new SimpleDateFormat("MM/dd/yyyy");
// Date date = ft.parse(str);

// // this will print the date as per parsed string
// System.out.println("Parsed Date : " + date);
// }
// }
// Output

// Formatted Date : 24-01-2022
// Parsed Date : Sat Feb 18 00:00:00 UTC 1995