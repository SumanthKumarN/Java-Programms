package OOPS;  // encapsulation 2nd example continue

import java.util.Scanner;

public class Bankdriver {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Bank b = new Bank();
		boolean exit = true;
		 {
		 while(exit)
		 {
		
		System.out.println("enter your choice");
		System.out.println("1.change name");
		System.out.println("2.change accno");
		System.out.println("3.change password");
		System.out.println("4.change gmail");
		System.out.println("exit");
		
		int choice = sc.nextInt();
		switch(choice) {
		
		
		case 1:{
			System.out.println(b.getname());
			System.out.println(b.getaccno());
			System.out.println(b.getgmail());
		}break;
		
		case 2: {
			System.out.println("enter your name to update");
			String name = sc.next();
			b.setname();
		} break;
		
		case 3:{
			System.out.println("enter your new password");
			int password=sc.nextInt();
			b.setpassword(password);
		}break;
		
		case 4:{
			System.out.println("enter your new email");
			String gmail=sc.next();
			b.setgmail(gmail);
			} break;
			
		case 5:{
			exit = false;
		}
		
		default :  {
			System.out.println("invalid input");
			sc.close();
		}
		
	}

	}
}
	}
}
