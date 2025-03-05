package com.practices;

import java.util.Scanner;

public class NumTest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
		 
		 
		 int num = sc.nextInt();
		 int num1 = sc.nextInt();
		 int small = 0;
	       
	   if(num<num1){
	       small= num;
	       }
	   
	       if(num1<num){
	         small= num1;  
	       }
	       System.out.println(small);
	   
	   } 
	}


