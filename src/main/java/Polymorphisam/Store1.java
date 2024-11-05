package Polymorphisam;

public class Store1 {

	//double discount =0.2;
	
	public void CalculateDiscount(int amount ,double discount)
	{
		double discountamount = amount*discount;
		System.out.println("Discount amount is : Rs. " +discountamount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store1 s = new Store1();
		s.CalculateDiscount(100,0.2);
	}

}
