
import java.io.*;
class import2 // main class 
{
public static void main(String [] args) throws IOException 
{
int Sno;  // Integer Data type 
String Name; // String Data type 
float Weight; // Float Data type 
DataInputStream Dia = new DataInputStream(System.in); // Object Creation for DataInputStream 
System.out.println("Enter Sno");
Sno=Integer.parseInt(Dia.readLine()); // Getting Integer Input ( Integer. parseInt is used before using readLine )
System.out.println("Enter your Name");
Name=Dia.readLine(); // String can be directly called using readLine
System.out.println("Enter your Weight");
Weight=Float.parseFloat(Dia.readLine()); // Getting Float Input ( Float. parseFloat is used before using readLine )
System.out.println("S.no: "+Sno); // print statements 
System.out.println("Name :"+Name);
System.out.println("Weight :"+Weight);
}
}
