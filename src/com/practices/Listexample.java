package com.practices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listexample {

	

	public static void main(String[] args) {
		List<String> li = new LinkedList<String>();
		
		List<String> mi = Arrays.asList("mahi","raju","gopi");
		List<String> mi1 = Arrays.asList("mahi","raju","gopi");
		
		boolean st = mi.equals(mi1);
		System.out.println(st);
		
		
		li.add("Raja");
		li.add("mahi");
		li.add("keer");
		
		Iterator<String> i  = li.iterator();
		
		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
			
		}
		
		for (String string : li) {
			System.out.println(string);
		}
		
		for (int j = 0; j < li.size(); j++) {	
		}System.out.println(li);
	}
}
