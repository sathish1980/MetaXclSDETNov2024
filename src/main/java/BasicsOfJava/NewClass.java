package BasicsOfJava;

public class NewClass {
	
	
	public void AccessData()
	{
		//Variable V = new Variable();
		System.out.println(Variable.firstnumber);
		Variable.myAmount(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass N =new NewClass();
		N.AccessData();
	}

}
