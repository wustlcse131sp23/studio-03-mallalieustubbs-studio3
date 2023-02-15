package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to check?");
		int n = in.nextInt();
		
		boolean[] arr = new boolean[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
			
		}
			
			for ( int i = 2; i < Math.sqrt(n); i++) {
				
				if (arr[i] == true) {
				for (int j = i*i; j < arr.length; j = j + i) {
				
					arr[j] = false;
			}
				System.out.println(arr[i]);
			}
			
			}
}
}

		
		

	


