package org.saro;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
	 int n=s.nextInt();
	 int factorial=1;
	 for (int i = 1; i <=n; i++) {
		 factorial=factorial*i;
		
	}
	System.out.println(factorial);
	}
}

