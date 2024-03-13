package Chapters.C09_Packages;
//import Chapters.C09_Packages.Simple;

class e90_sample {

    public static void main(String args[]) {
        e91_Simple s = new e91_Simple();
        boolean result;
		
		result=s.even_or_odd(45);
		
		if(result==true)
		{
			System.out.println("Even");
		}
		System.out.println("Odd");
		
    }
}
