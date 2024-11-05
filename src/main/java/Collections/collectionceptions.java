package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class collectionceptions {
	
	/*
	 * List
	 * set
	 * Map
	 */
	
	/*
	 * List-
	 * 1.store multiplevalues 
	 * 2.allow duplicate values
	 * 
	 * 2 classes
	 * ArrayList --multiple value, allow to store duplicate values
	 * LinkedList --multiple value, allow to store duplicate values
	 */
	
	public void GetItemList()
	{
		// predefeined class -its avaible in java
		//ArrayList<String> A = new ArrayList(); --Singly list
		LinkedList<String> A = new LinkedList();  // -- doubly linked list
		
		/*
		 * Add
		 * update
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
		if(A.size()>4)
		{
		A.remove(4);
		System.out.println(A);
		}
		//Update
		A.set(3, "Maggi");
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
		collectionceptions c = new collectionceptions();
		c.GetItemList();
	}

}
