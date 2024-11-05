package BasicsOfJava;

public class Variable {
	
	/*
	 * its a container which holds the value
	 * syntax:
	 * accessmodifier datatype variablename = value;
	 */
	
	public static int firstnumber = 1000; // global / instance variable
	
	
	public static void myAmount(int a)
	{
		double discount = 0.1; // local variable
		System.out.println(firstnumber);
		System.out.println(discount);
	}
	
	public void balcnceAmount()
	{
		double discount = 0.2;

		System.out.println(firstnumber);
		System.out.println(discount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable V = new Variable();
		V.myAmount(8);
		V.balcnceAmount();
		
	}

}
