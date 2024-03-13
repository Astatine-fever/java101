package Chapters.C12_Filehandling;

import java.io.*;
import java.util.Scanner;

class files {
	public static void main(String args[]) {
		try {
			File test = new File("D:/test.txt");
			Scanner my = new Scanner(test);
			while (my.hasNextLine()) {
				String data = my.nextLine();
				System.out.println(data);
			}
			my.close();
		} catch (FileNotFoundException e) {
			System.out.println("Please check if the file is available");
		}
	}
}