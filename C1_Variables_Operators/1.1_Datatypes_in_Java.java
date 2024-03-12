
// DataTypes in Java Example Getting Input from User using Scanner 
import java.util.*;
class import1  // Main Class 
{

public static void main(String [] args) // Main Method 
{
	
byte a; ///The byte data type can store whole numbers from -128 to 127. 

/* Byte can be used instead of int or other integer types to save memory 
when you are certain that the value will be within -128 and 127: */

int b; ///The int data type can store whole numbers from -2147483648 to 2147483647. 

/* In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value. */

short c; /// The short data type can store whole numbers from -32768 to 32767:

long d; ///The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. 

/* This is used when int is not large enough to store the value. Note that you should end the value with an "L": */

float e; ///The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. 

/* Note that you should end the value with an "f": */

double f; ///The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. 

/*Note that you should end the value with a "d": */

// A floating point number can also be a scientific number with an "e" to indicate the power of 10:
float g;  

// A boolean data type is declared with the boolean keyword and can only take the values true or false:
boolean h;

// The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

String i;

// Alternatively, you can use ASCII values to display certain characters:

	
Scanner sc = new Scanner(System.in);  // Scanner Method calling .. Sc is the object for scanner 

System.out.print("Byte: \n");
System.out.print(" Enter Number between -128 to 127  ");
a=sc.nextByte(); // getting input in byte

System.out.print("Integer: \n");
System.out.print(" Enter Number between -2147483648 to 2147483647  ");
b=sc.nextInt(); // getting input in integer

System.out.print("Short Integer: \n");
System.out.print(" Enter Number between -32768 to 32767 ");
c=sc.nextShort(); // getting input in Short Int

System.out.print("Long Integer: \n");
System.out.print(" Enter Number between  -9223372036854775808 to 9223372036854775807 ");
System.out.print(" Number Should have L in the ending \n ");
d=sc.nextLong(); // getting input in long Int

System.out.print("Long Float: \n");
System.out.print(" Enter Number between 3.4e−038 to 3.4e+038  \n");
System.out.print(" Number Should have F in the ending \n ");
e=sc.nextFloat(); // getting input in float

System.out.print("Duuble: \n");
System.out.print(" Enter Number between 1.7e−308 to 1.7e+308  ");
f=sc.nextDouble(); // getting input in double

System.out.print("Float: \n");
System.out.print(" Enter Number with scientific number with an 'e' to indicate the power of 10 ");
g=sc.nextFloat(); // getting input in float

System.out.print("Boolean: \n");
System.out.print(" Enter true or false ");
h=sc.nextBoolean(); // getting input in boolean


System.out.println("");
System.out.println("Byte");	
System.out.println("a="+a);

System.out.println("");
System.out.println("Integer");	
System.out.println("b="+b);

System.out.println("");
System.out.println("Short Int");	
System.out.println("c="+c);

System.out.println("");
System.out.println("Long Int");	
System.out.println("d="+d);

System.out.println("");
System.out.println("Float");	
System.out.println("e="+e);

System.out.println("");
System.out.println("Double");	
System.out.println("f="+f);

System.out.println("");
System.out.println("Float with Scientific Notation");	
System.out.println("g="+g);

System.out.println("");
System.out.println("Boolean ");	
System.out.println("h="+h);

}
}





/*

Use float or double?

The precision of a floating point value indicates how many digits the value can have after the decimal point. 
The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
Therefore it is safer to use double for most calculations.

*/