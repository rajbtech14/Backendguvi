package com.practices;

import java.util.Arrays;
import java.util.Scanner;

public class Arrtest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        int [] arr= new int [n] ;
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
        
	}

}
