package Inheritance;   //3rd example 3rd part

public class children extends father {
 public void car()  {
	 System.out.println("child owns a car");
 }
 public static void main(String[] args) {
	
	 children c = new children();

	c.land();
	c.house();
	c.car();
	
 }
	
 }

