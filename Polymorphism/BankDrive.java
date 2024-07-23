package Polymorphism;
import java.util.Scanner;
public class BankDrive {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome, please choose your bank");
		System.out.println("1.SBI");
		System.out.println("2.ICICI");
		System.out.println("3.HDFC");
		System.out.println("4.CANARA");
		
		 int choice = sc.nextInt();
		 switch(choice)  {
		 
		 case 1 : {
			 SBI S = new SBI();
			 S.loanrate();
		 } break;
		 
		 case 2 : {
			 ICICI I = new ICICI();
			 I.loanrate();
		 } break;
		 
		 case 3 : {
			HDFC H = new HDFC();
			H.loanrate();
		 } break;
		 
		 case 4 : {
			 CANARA C = new CANARA();
			 C.loanrate();
		 } break;
		 
		
		 }
		 sc.close();
	}

}
