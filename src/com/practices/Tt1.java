package com.practices;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Tt1 {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String st = "";
		
		//char [] rev = s.toCharArray(); 
//		
//		LinkedHashSet <Character> a1 = new LinkedHashSet <>();
//		
//		for(int i = 0; i<s.length();i++){
//			a1.add(s.charAt(i));
//		}
//		for (Character ch : a1) {
//			System.out.print(ch);
//		}	
		
//		for (int i = rev.length-1; i >=0; i--) {
//			System.out.print(rev[i]);
//		}
		
		for (int i = 0; i < s.length(); i++) {
			st =  s.charAt(i) + st;	
		}
		System.out.println(st);
		
    }
	
}

