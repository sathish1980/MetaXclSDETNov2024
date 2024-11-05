package BasicsOfJava;

public class Arrays {
	
	int age =25;
	
	public int[] price = {10,20,30,40,50,60,70,80,90};
	//					 	0, 1, 2, 3
	
	public String[] course= {"JAva","C#","SQL","Python"};
	
	public void printPrice()
	{
		System.out.println(age);
		System.out.println(price[1]);
		System.out.println(price[2]);
		price[5]=100;
		
		int totalValue = course.length;
		System.out.println(totalValue);
		for(int start=0;start<totalValue;start++)
		{
			System.out.println(course[start]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.printPrice();
	}

}
