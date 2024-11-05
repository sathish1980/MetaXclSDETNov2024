package Inheritance;

public class multipleinheritance extends MetaXcelUSCourseFees {
	
	MetaXcelIndia M1 = new MetaXcelIndia();
	public void printNAme()
	{
		System.out.println(M1.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleinheritance M = new multipleinheritance();
		M.printNAme();
	}
}
