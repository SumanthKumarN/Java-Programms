package statickeyword;
import java.util.Scanner;
public class calculator_driver 
{
	static 
	{
		System.out.println("welcome to calculator");
	}
	
public static void main(String[] args) 
  {
 	Scanner sc = new Scanner(System.in);
  
 boolean exit = true;
 {
 while(exit)
 {
	System.out.println("enter your choise"); 
	System.out.println("1.add");
	System.out.println("2.sub"); 
	System.out.println("3.mul"); 
	System.out.println("4.div"); 
	System.out.println("5.exit"); 
	

	int choice = sc.nextInt();
	switch (choice)
	{
	
	case 1 : {
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator.add(a,b);
		} break;
		
	case 2 : {
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b =sc.nextInt();
		Calculator.sub(a,b);
		} break;
		
	case 3 : {
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator.mul(a,b);
		} break;
		
	case 4 : {
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator.div(a,b);
		} break;
		
	case 5 : {
		System.out.println("exit");
		exit = false;
		} break;
		
		default:{
			System.out.println("invalid input");
		
		sc.close();	
		}
	}
 }
 }
  }
}

 


