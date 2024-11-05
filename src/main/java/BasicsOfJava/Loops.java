package BasicsOfJava;

public class Loops {
	
	public void first10number()
	{
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/
		
		for(int firstnumber=1;firstnumber<=10;firstnumber++)
		{
			firstnumber=firstnumber+2;
			System.out.println(firstnumber);
		}
		
		
		for(int firstnumber =10;firstnumber>=1;firstnumber--)
		{
			if(firstnumber==5 || firstnumber==7)
			{
				continue;
			}
			System.out.println(firstnumber);
		}
		
		int i=11;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.first10number();
	}

}
