package statickeyword;

public class Calculator {
	static
	{
		System.out.println("calculator function");
	}
	
	public static void add(int a , int b)
	{
	int sum = a+b;
	System.out.println(sum);
	}
	
	public static void sub(int a , int b)
	{
	int diff = a-b;
	System.out.println(diff);
	}
	
	public static void mul(int a , int b)
	{
	int pro = a*b;
	System.out.println(pro);
	}
	
	public static void div(int a , int b)
	{
	int quo = a/b;
	System.out.println(quo);
	}
	
}


