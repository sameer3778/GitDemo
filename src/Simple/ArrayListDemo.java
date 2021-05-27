package Simple;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Check wheather string is empty: "+al.isEmpty());
		
		al.add("sam");
		al.add("sam");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add("Sam");
		al.add(null);
		System.out.println(al);
		System.out.println(al.contains("a"));
		System.out.println(al.indexOf("Sam"));
		
		System.out.println(al);
		
		//System.out.println("Check wheather string is empty: "+al.isEmpty());
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
