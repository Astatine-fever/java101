package Chapters.C10_Packages;
//import Chapters.C10_Packages.Simple;

class sample {

    public static void main(String args[]) {
        Simple s = new Simple();
        boolean result;
		
		result=s.even_or_odd(45);
		
		if(result==true)
		{
			System.out.println("Even");
		}
		System.out.println("Odd");
		
    }
}
