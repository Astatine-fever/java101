package Chapters.C20_Regular_Expressions;
// Java Program to check on Regex
import java.io.*;
import java.util.regex.*;

// Driver class
class GFG {
	// Main function
	public static void main(String[] args)
	{
		// Checks if the string matches with the regex
		// Should be single character a to z
		System.out.println(Pattern.matches("[a-z]", "geeks"));

		// Check if the element is range a to z or A to Z
		System.out.println(
			Pattern.matches("[a-zA-Z]", "G"));
	}
}