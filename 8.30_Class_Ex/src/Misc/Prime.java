package Misc;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter intital number");
		int min = sc.nextInt();
		System.out.println("Enter max number");
		int max = sc.nextInt();
		
		
		String result = getPrimeList(min,max);
		System.out.println(result);
		
	}

	private static String getPrimeList(int min, int max) {
		
		String result = "";
		for(int i = min; i <= max ; i++) {
			for (int j = min+ 1 ; j<max ; j++ ) {
				
				if (isPrime(i) && isPrime(j) ) {
					
					if (j-i == 2) {
						
						result = i+" ";
					}
				}
			}
			
		
		}
		return result;
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <=n/2; i++) {
			
			if (n%i == 0)
				return false;
	
	
	}
	
	
		
		
		return true;
	}

}
