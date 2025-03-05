package com.practices;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String st1 = sc.next();  
        for(int i= 0 ; i<st1.length(); i++){
        	System.out.println(st1.charAt(i));	
				
        }
        String [] arr = st1.split("");
        for (String str : arr) {
			System.out.println(str);
		}
        
            
//            int s = sc.nextInt();
//            int num = 1;
//            for(int i=1;i <= num;i++){
//            	num  = num+1;
//            
//        }System.out.println(num);
         
        
    }

	
}