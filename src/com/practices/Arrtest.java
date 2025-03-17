package com.practices;

import java.util.Arrays;
import java.util.Scanner;

public class Arrtest {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);  
	       int num = sc.nextInt();
	       int sum = 0;
	       
	       for (int i = num; num !=0; num= num/10){
	        sum = num %10 + sum;
	        
      
	       }System.out.println(sum*sum);
        
        
	}

}
