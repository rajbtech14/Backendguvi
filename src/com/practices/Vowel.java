package com.practices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s = sc.next();	
		char ch [] = s.toCharArray();	
		
		HashSet<String> vowel = new HashSet<String>();
		vowel.add("a");
		vowel.add("e");
		vowel.add("i");
		vowel.add("o");
		vowel.add("u");
		vowel.add("A");
		vowel.add("E");
		vowel.add("I");
		vowel.add("O");
		vowel.add("U");
		

		for (char str : ch) {
			if (vowel.contains(str)) {
				
				System.out.println(vowel);
			}
		}
		
	}



}
