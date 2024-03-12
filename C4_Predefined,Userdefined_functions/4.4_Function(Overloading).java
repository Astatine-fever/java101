

// Function Overloading

class func_05
{
	public void add(int x , int y)
	{
		int z= x+y;
		System.out.print("Z="+z);
	}
	
	public void add(int m, int n, int o)
	{
		int p= m+n+o;
		System.out.print("P="+p);
	}
}


class Fun_05
{
	public static void main(String Args[])
	{
	 func_05 f5= new func_05();
	 f5.add(25,30);
	 f5.add(25,30,40);
	}
	
	
}
