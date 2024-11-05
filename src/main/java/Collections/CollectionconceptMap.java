package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectionconceptMap {
	
	/*
	 *  Map
	 *  Store the Key and Value Pair
	 *  	Key		Value
	 *  e.g Name = Sathish
	 *  
	 *  3 class
	 *  1.HashMap
	 *  2.LinkedHashMap
	 *  3.TreeMap
	 */
	

	
	public void SetItemPrice()
	{
		//HashMap<String,Integer> H = new HashMap();
		//LinkedHashMap<String,Integer> H = new LinkedHashMap();
		TreeMap<String,Integer> H = new TreeMap();
		/*
		 * add
		 * update
		 * delete
		 * retreive
		 */
		String item =null;
		int itemPrice=0;
		do
		{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Item Name:");
		item =S.next();
		System.out.println("Enter the "+item+" Price: ");
		itemPrice =S.nextInt();
		if(!item.equalsIgnoreCase("Stop"))
			//Add
			H.put(item, itemPrice);
		}while(!item.equalsIgnoreCase("Stop"));
		
		System.out.println(H);
		
		//getKeys
		
		System.out.println(H.keySet());
		
		// getvalues
		System.out.println(H.values());
		
		//get value for the specific key
		System.out.println(H.get("Rice"));
		
		//update
		for(String eachitem : H.keySet())
		{
		if(eachitem.equalsIgnoreCase("Biscuts"))
		{	
			double newitemPrice =H.get(eachitem)*0.2;
			double afterdiscount =H.get(eachitem)-newitemPrice;	
			H.replace(eachitem, (int)afterdiscount);
		}
		}
		System.out.println(H);
		
		H.remove("Rice");
		System.out.println(H);
	}
	
	
	public void StoreitemValue()
	{
		TreeMap<String,Integer> H = new TreeMap();
		H.put("Burger", 100);
		H.put("Pizaa", 60);
		H.put("Noodles", 50);
		
		System.out.println(H);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionconceptMap C = new CollectionconceptMap();
		C.StoreitemValue();
	}

}
