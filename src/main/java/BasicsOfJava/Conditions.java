package BasicsOfJava;

public class Conditions {
	
	/*
	 * conditions: 
	 * 2 types:
	 * If condition
	 * Switch Condition
	 * 
	 * if condition - 4 types
	 * if condition
	 * sytax :if(condition)
		{
			
		}
	 * if else condition
	 * if else if condition
	 * nested if condition
	 * 
	 */
	
	/*
	 * Red -stop
	 * Green - Good to go
	 * Orange- Ready to go /stop
	 */
	public void Trafficsignal(String color,String vehicle,Boolean patient)
	{
		if(color=="Green")
		{
			System.out.println("Your are good to go");
		}
		else if(color == "Red")
		{
			if(vehicle=="Ambulance" && patient==true)
			{
				//if(patient==true)
				//{
				System.out.println("Hi I am ambulance give me a way");
				/*}
				else
				{
				System.out.println("Please stop your vehicle");
				}*/
			}
			else
			{
			System.out.println("Please stop your vehicle");
			}
		}
		else if(color == "Orange")
		{
			System.out.println("Please ready to start /stop your engine");
		}
		else
		{
			System.out.println("You have given incorrect color");
		}
		
		int x =10;
		x-=3; //x = x-3
		System.out.println(x);
	}
	
	public void getGender(String value)
	{
		switch(value)
		{
		case "M":
			System.out.println("Male");
			break;
		case "F":
			System.out.println("FeMale");
			break;
		case "T":
			System.out.println("Transgender");
			break;
		default:
			System.out.println("Not a valid code");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions C = new Conditions();
		C.Trafficsignal("Red","Ambulance",true);
		C.getGender("Z");
	}

}
