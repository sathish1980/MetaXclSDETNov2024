package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionconceptsSet {
	
	/*
	 * set - 
	 * 1.it allows to store multiple value
	 * 2.It will not accept duplicate value
	 * 3 classes
	 * HashSet
	 * 	1.It doesnot maintain insertion order
	 * 	2.It should not add duplicate value
	 * Linked HashSet
	 * 1. It maintain insertion order
	 * 2. It should not add duplicate value
	 * TreeSet
	 *  1.It maintain insertion order in ascending order
	 * 	2.It should not add duplicate value
	 */
	

	public void GetItemList()
	{
		// predefeined class -its avaible in java
		//HashSet<String> A = new HashSet(); //--Singly list
		
		//LinkedHashSet<String> A = new LinkedHashSet(); //	CollectionconceptsSet
		TreeSet<String> A = new TreeSet(); //	CollectionconceptsSet
		
		//LinkedList<String> A = new LinkedList();  // -- doubly linked list
		
		/*
		 * Add
		 * delete
		 * retreive
		 */
		
		System.out.println(A);
		String item=null;
		//to Add
		do
		{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Items:");
		item =S.next();
		if(!item.equalsIgnoreCase("Stop"))
			//Add
			A.add(item);
		}while(!item.equalsIgnoreCase("Stop"));
		//item!=0;
		
		System.out.println(A);
		//remove
		A.remove("Salt");
		System.out.println(A);
		
		
		//Retrieve
		for(String eachValue :A)
		{
			System.out.println(eachValue);
		}
		
		System.out.println(A.contains("Rice"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionconceptsSet c = new CollectionconceptsSet();
		c.GetItemList();
	}

}
