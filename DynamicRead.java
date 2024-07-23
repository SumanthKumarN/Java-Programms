package Methods;
import java.util.Scanner;
public class DynamicRead 
{
public static void main(String[] args) 
  {
	Scanner s = new  Scanner(System.in);
	
	System.out.println("enter your name");
	String name = s.next();
	
	System.out.println("enter your age");
	int age =s.nextInt();
	
	System.out.println("enter your height");
	float height =s.nextFloat();
	
	
	System.out.println("enter your weight");
	double weight =s.nextDouble();
	
	System.out.println("enter your number");
	long number =s.nextLong();
	
	System.out.println("enter your gender");
	char gender =s.next().charAt(0);
	
	System.out.println("enter your status");
	boolean status =s.nextBoolean();
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(height);
	System.out.println(weight);
	System.out.println(number);
	System.out.println(gender);
	System.out.println(status);
	
	s.close();
	
  }
}
