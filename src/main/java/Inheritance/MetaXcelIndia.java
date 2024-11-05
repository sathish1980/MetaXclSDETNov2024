package Inheritance;

public class MetaXcelIndia extends MetaXcelBaseBranch{
	
	String currentCranchName = "MetaXcel India";
	String name ="india";
	public boolean GetCourseInIndia(String expectedcourse)
	{
		if(GetCourse(expectedcourse)==false)
		{
			System.out.println("The requested course is not available");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetaXcelIndia M = new MetaXcelIndia();
		M.GetCourseInIndia("SQL2");
	}

}
