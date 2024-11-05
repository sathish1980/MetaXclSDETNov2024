package BasicsOfJava;

/*
 * syntax : accessmodifier class classname{}
 */

public class FirstClass
{
	
/*
 * Methods
 * its is used for reusable purpose
 * syntax : accessmodifier returntype methodname(){}
 * 	
 */
	public void PrintMyName()
	{
		System.out.println("sathish");
	}
	
	public void PrintMyNamewithparameter1(String a)
	{
		System.out.println(a);
	}
	
	public int Sum(int one,int two)
	{
		int output = one+two;
		System.out.println(output);
		return output;
	}
	
	public int SumofThreenumber(int one,int two,int three)
	{
		int output = one+two+three;
		System.out.println(output);
		return output;
	}
	
	public void Aftersumplus10()
	{
		int finaloutput = Sum(2, 5)+10;
		System.out.println(finaloutput);
	}
	
	
	public void purchase(int firstitme, int seconditem)
	{
		int billamount  =firstitme+seconditem;
		System.out.println(billamount);	
		//double taxamount = purchaseamount*0.13;
		double finaltax =CaculateTax(billamount);
		//System.out.println(CaculateTax(billamount));
		System.out.println(finaltax);
		
	}
	
	public double CaculateTax(int purchaseamount)
	{
		double taxamount = purchaseamount*0.13;
		return taxamount;
	}
	
public static void main(String[] args)
{
	//System.out.println("sathish");
	/*System.out.println("kumar");  // single line comment
	System.out.println("R");*/ /* Multi line comment*/
	FirstClass FC = new FirstClass(); // instantiation
	FC.PrintMyName();
	FC.PrintMyNamewithparameter1("Facebook");
	FC.Sum(15, 6);
	FC.Aftersumplus10();
	FC.SumofThreenumber(3, 5, 9);
	FC.purchase(1000, 500);
}
}
