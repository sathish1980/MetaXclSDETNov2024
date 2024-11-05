package Inheritance;

public class MetaXcelBaseBranch {
	
	String name = "MetaXcel Base Branch";
	String[] courses= {"python","java","SQL","Testing"};
	
	public boolean GetCourse(String expectedCourse)
	{
		/*for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}*/
		// for each loop
		for(String eachcourse : courses)
		{
			if(eachcourse.equalsIgnoreCase(expectedCourse))
			{
				System.out.println("The given course is avaialble: "+eachcourse);
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args)
	{
		MetaXcelBaseBranch M = new MetaXcelBaseBranch();
		M.GetCourse("C#");
	}
}
