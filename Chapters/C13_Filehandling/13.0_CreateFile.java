// Java Program to create a file 

package Chapter13_FILES;
import java.io.*;
import java.io.IOException;

class F_creation 
{
	public static void main(String args[])
	{
		 
		try
		{
			File fr = new File("D://Test.txt");
			//fr.mkdir();
			if (fr.createNewFile())
			{
			System.out.println("File Created");
			}
			else
			{
			System.out.println("File Already Exists");
			}
		}
		catch(Exception e)
		{
			System.out.println("An Error Occured");
		}
	}
}