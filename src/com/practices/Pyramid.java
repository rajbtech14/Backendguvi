package com.practices;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pattern = sc.nextInt();
		
	for(int i = pattern ; i>=1;i--) {
		if(i%2==1) {
			for(int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
		}else {
			for (int j = 1; j <=i ; j++) {
				System.out.print("* ");
				
			}
			
		}
		System.out.println();
	}
}
}

