package Chapter13_FILES;
import java.io.*;
import java.util.*;
class samplef
{
public static void main(String args[])throws IOException
{
String fname,path,finame,loc; // fname - folder name , path- where to place the file,finame-filename
boolean bool; 
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Folder path");
    path=sc.next();
    System.out.println("Enter Folder name");
    fname=sc.next();
    loc=path+fname;
    File fa = new File(loc);
    bool=fa.mkdirs();
    if(bool)
    {
    System.out.println("Folder Created");
    System.out.println("Enter File Name");
    finame=sc.next();
    File fa1 = new File(loc+finame);
    if(fa1.createNewFile())
    {	
    System.out.println("New File Created");	
    String text;	
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader Br = new BufferedReader(r);	
    System.out.println("Enter a Line into A");
    text=Br.readLine();
    try (PrintWriter ps = new PrintWriter(loc+finame)) {
        ps.println(text);
    }
    }
    else 
    {
    System.out.println("File Not Created");	
    }	
    }
    else
    {
    System.out.println("Folder Not Created");
    }
}
}
}