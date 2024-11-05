package BasicsOfJava;

public class AccessModifier {
	
	int totalAmount =1000;
	
	
	protected void getAmount()
	{
		System.out.println(totalAmount);
	}
	
	public void Getanotheramount()
	{
		System.out.println(totalAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier A = new AccessModifier();
		A.getAmount();
		A.Getanotheramount();
	}

}
