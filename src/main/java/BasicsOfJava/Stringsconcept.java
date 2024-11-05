package BasicsOfJava;

public class Stringsconcept {
	
	String name ="Sathish";
	String anothername ="sathish";
	
	int age =10;
	
	
	public void Printdata()
	{
		System.out.println(name);
		System.out.println(name.length());
		boolean check = name.startsWith("thi");
		System.out.println(check);
		boolean check1 = name.contains("thih");
		System.out.println(check1);
		boolean check2 = name.endsWith("az");
		System.out.println(check2);
		System.out.println(name.trim());
		System.out.println(name.replace("a", "A"));
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.substring(2,5));
		System.out.println(name.equals(anothername));
		System.out.println(name.equalsIgnoreCase(anothername));
		System.out.println(name==anothername);
		System.out.println(name.compareTo(anothername));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringsconcept S = new Stringsconcept();
		S.Printdata();
	}

}
