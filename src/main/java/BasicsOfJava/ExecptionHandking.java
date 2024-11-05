package BasicsOfJava;

import java.io.IOException;

public final class ExecptionHandking {
/*
 * try
 * catch
 * finally
 */
	final int age =19;
	
	public void ChangeAge()
	{
		//age =age+10;
		System.out.println(age);
	}
	
	public void div(int a, int b)
	{
		try
		{
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			int c=a*b;
			System.out.println("Multiply and pring by finaly "+c);
		}
	}
	
	
	public void add(int a, int b)
	{
		try
		{
		int c=a+b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public void mul(int a, int b) throws ArithmeticException,IOException,NullPointerException
	{
		int c=a*b;
		System.out.println(c);
	}
	
	public void Drivinglicense(int age , String state)
	{
		try
		{
		if(age>18 && state=="LS")
		{
			System.out.println("Hey !! you are good to apply license");
		}
		else if(age<18 && state == "LS")
		{
			throw new ArithmeticException("You are part of LS but you are not eligible to aply license");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws ArithmeticException,IOException,NullPointerException {
		// TODO Auto-generated method stub
		ExecptionHandking E = new ExecptionHandking();
		E.Drivinglicense(17, "LS");
		E.div(10, 2);
		E.add(3, 5);
		E.sub(3, 5);
		E.mul(3, 5);
		E.ChangeAge();
		
	}

}
