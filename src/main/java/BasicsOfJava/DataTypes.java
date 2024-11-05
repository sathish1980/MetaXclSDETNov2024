package BasicsOfJava;

import java.math.BigInteger;

public class DataTypes {
	
	/*
	 * 2 types- Primitive and non primitive
	 * Wholenumber  int
	 * decimalvalue float ,double
	 * character char
	 * 
	 */
	
	// Primitive datatypes
	int firstnumber =01234567;
	float price =12.3f;
	double totalamount = 12.4456;
	char result ='A';
	String name = "Sathish";
	boolean Active =true;
	BigInteger mlarge = new BigInteger ("01234567890");
	
	//non promitive dataype
	// class ,arrays,interface
	
			
	public void billing()
	{
		System.out.println(mlarge);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes D = new DataTypes();
		D.billing();
	}

}
