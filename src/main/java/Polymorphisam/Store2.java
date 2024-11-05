package Polymorphisam;

public class Store2 extends Store1{
	
	public void CalculateDiscount(int amount ,double percentage)
	{
		double discountamount = amount*percentage;
		System.out.println("Discount amount is : "+discountamount);
		double finalamount = amount-discountamount;
		System.out.println("Final amount is : "+finalamount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store2 s = new Store2();
		s.CalculateDiscount(100,0.1);
	}

}
