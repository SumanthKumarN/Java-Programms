package OOPS;     //encapsulation 2nd example

public class Bank {
	
	private String name = "sumanth";
	private long accno = 400200100;
	private int password = 2002;
	private String gmail = "sumanth@gmail.com";
	
	public String setname(  ) {
		return name;
	}
	public String getname() {
		return name;
	}
	
	public long getaccno(  ) {
		return accno;
	}
	
	void setpassword(int password) {
		this.password=password;
		System.out.println("Password chage successfully");
	}
	public int getpassword() {
		return password;
	}
	
	void setgmail(String gmail) {
		this.gmail=gmail;
		System.out.println("gmail chage successfully");
	}
	
	public String getgmail() {
		return gmail;
	}
	
	

}
