package BasicsOfJava;

public class Constructorexample {
	
	/*
	 * its is similar like method
	 * but the constructor name should be same as your class name
	 * Constructor should not have any return type.
	 * 
	 * 2 types
	 * with parameter /arguments
	 * withoutparameter /arguments
	 * 
	 */
	
	public Constructorexample(String name)
	{
		System.out.println("Hi "+ name +" welcome to today's session");
	}
	
	public void add(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorexample C = new Constructorexample("Nabeel");
		//C.add(30, 20);
	}

}
