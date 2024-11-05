package Inheritance;

public class MetaXceIndiaCourseFees extends MetaXcelIndia {

	String[] coursesfees= {"python-20000","java-35000","SQL-15000","Testing-25000"};
	String name ="coursefees";
	public void GetCourseFees(String expectedCourse)
	{
		if(GetCourseInIndia(expectedCourse)==true)
		{
			for(String eachCoursefee : coursesfees)
			{
				//python-20000
				// python  --spliteachcourseFee[0] 
				// 20000 --spliteachcourseFee[1]
				String[] spliteachcourseFee = eachCoursefee.split("-");
				if(spliteachcourseFee[0].equalsIgnoreCase(expectedCourse))
				{
					System.out.println("You have to pay fees for the course " +expectedCourse+" is Rs. "+spliteachcourseFee[1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetaXceIndiaCourseFees M = new MetaXceIndiaCourseFees();
		M.GetCourseFees("SQL");
		System.out.println(M.name);
	}

}
