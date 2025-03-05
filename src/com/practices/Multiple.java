package com.practices;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
	        int num = sc.nextInt();
	        
	        int mult =  0 ;
	        
	        for(int i = 1 ;i<=num;i++){
	        	mult = 9 *i;
	            if (i == num){
	                
	                System.out.print(mult);
	            }else{
	             System.out.print(mult + " ");   
	            }
	            
	            }
	}

}
