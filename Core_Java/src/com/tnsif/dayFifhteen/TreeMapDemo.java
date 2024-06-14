package com.tnsif.dayFifhteen;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> personMap =new TreeMap<String,String>();
		personMap.put("kavita@gmail.com", "Kavita");
		personMap.put("thoke.diksha@gmail.com", "Diksha");
		personMap.put("jayshree@gmail.com", "Jayshree");
		personMap.put("shewale.dhanshree@gmail.com", "Dhanu");
		personMap.put("jadhav.apeksha@gmail.com", "Apeksha");
		
		System.out.println(personMap);
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		personMap.put("kavita@gmail.com", "Kavita Uttam Sonawane");
		System.out.println(personMap);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		personMap.put("sonawane@gmail.com", "Kavita Uttam Sonawane");
		System.out.println(personMap);
		System.out.println("-----------------------------------------------------------------------------------------------");
		Set<String> emailIdSet =personMap.keySet();
		System.out.println(emailIdSet);
		System.out.println("-----------------------------------------------------------------------------------------------");
		
		Collection<String> names=personMap.values();
		System.out.println(names);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println(personMap.get("sonawane@gmail.com"));
		System.out.println(personMap.get("sonawane123@gmail.com"));
	
		Set<Entry<String,String>> persons=personMap.entrySet();
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------");
		Iterator<Entry<String,String>> p=persons.iterator();
		while(p.hasNext())
		{
			Map.Entry<String, String> entry =p.next();
			System.out.println(entry);
			
			} 
		}

}
