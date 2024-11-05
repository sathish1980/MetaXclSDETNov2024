package BasicsOfJava;

import java.util.Scanner;

public class GetInputFromuser {
	
	public void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.next();
		System.out.println(name);
		
	}
	
	public void add2number()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter firstnumber:");
		int firtsnumber = s.nextInt();
		System.out.println("Enter second number:");
		int secondnumber = s.nextInt();
		int result = firtsnumber+secondnumber;
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetInputFromuser G = new GetInputFromuser();
		G.add2number();
	}

}
