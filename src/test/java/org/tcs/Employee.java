package org.tcs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		// to insert the values into map
		m.put(10, "java");
		m.put(50, "sql");
		m.put(20, ".net");
		m.put(80, "python");
		m.put(60, "php");
		m.put(90, "javascript");
		m.put(10, "c++");
		m.put(30, "sql");
		
		System.out.println(m);
		
		// to find the size of map
		int size = m.size();
		System.out.println(size);
		
		// to get the particular value
		String string = m.get(20);
		System.out.println(string);
		
		// to return all the values from map
		Collection<String> values = m.values();
		System.out.println(values);
		
		// to return all the keys
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		// to check the particular value is contain or not
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		
		// to check the particular key is contains or not
		boolean containsKey = m.containsKey(10);
		System.out.println(containsKey);
		
		// to check the map is e,mpty or not
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		// to remove the particular value
		m.remove(10);
		System.out.println(m);
		
		// to iterate the entries
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		// to clear all the values from map
		m.clear();
		System.out.println(m);
	}
	private void empId() {
		System.out.println("Employee Id is 87654");

	}
	private void empName() {
		System.out.println("Employee Name is Bala");
	}
	
	
}
