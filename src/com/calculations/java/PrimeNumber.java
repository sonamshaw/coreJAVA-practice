package com.calculations.java;

public class PrimeNumber {

	public static void main(String[] args) {
		int a[] = { 3, 5, 9, 12, 102 };
		boolean isPrime = true;

		for (int i = 0; i < a.length; i++) {
			isPrime = true;
			for (int j = 2; j < a[i]; j++) {
				if ((a[i] % j) == 0) {
					isPrime = false;
					break;

				}
			}
			
			if(isPrime){
				System.out.println(a[i]+" is prime");
			}else{
				System.out.println(a[i]+" is not prime");
			}
		}
	}
}
