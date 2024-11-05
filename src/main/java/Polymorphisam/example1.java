package Polymorphisam;

public class example1 {
	
	
	// Method overloading:
	// same method name but diffence in parameter
	/*
	 * 1. by changing the number of arguments
	 * 2. by changing the data type
	 */
	
	public void add(int a , int b)
	{
		int c= a+b;
		System.out.println("output of 2 number is : "+c);
	}
	
	public void add(int a , int b ,int d)
	{
		int c= a+b+d;
		System.out.println("output of 3 number is : "+c);
	}
	
	
	public void add(int a , double b)
	{
		double c= a+b;
		System.out.println("output of 2 number with decimal : "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 e = new example1();
		e.add(10, 20);
				
	}

}
