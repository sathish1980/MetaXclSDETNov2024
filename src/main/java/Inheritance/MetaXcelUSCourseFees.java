package Inheritance;

public class MetaXcelUSCourseFees extends MetaXcelBaseBranch{
	
	String[] coursesfees= {"python-200$","java-350$","SQL-150$","Testing-250$"};
	
	public void GetCourseFees(String expectedCourse)
	{
		if(GetCourse(expectedCourse)==true)
		{
			for(String eachCoursefee : coursesfees)
			{
				String[] spliteachcourseFee = eachCoursefee.split("-");
				if(spliteachcourseFee[0].equalsIgnoreCase(expectedCourse))
				{
					System.out.println("You have to pay fees for the course " +expectedCourse+" is Rs. "+spliteachcourseFee[1]);
				}
			}
		}
		else
		{
		System.out.println("The requested course is not avaialble");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetaXcelUSCourseFees M = new MetaXcelUSCourseFees();
		M.GetCourseFees("Java");
	}

}
