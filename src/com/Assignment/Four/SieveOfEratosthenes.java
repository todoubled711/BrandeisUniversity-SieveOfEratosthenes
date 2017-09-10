package com.Assignment.Four;
import java.util.Scanner;

public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
	//get the max number to use for test
	int N;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the max integer to check: ");
	N = sc.nextInt();
	sc.close();
	
	//Placing numbers into an array and the true ones get denoted to prime
	boolean[] isPrime = new boolean[N];
	isPrime[0] = false;
	
	for (int c = 1; c < N; c++) {
		isPrime[c] = true;
	}
	
	//check all numbers >= 2 for to see if they're prime
	for (int i = 2; i < N; i++) {
		
		//i is prime if it hasn't been removed yet
		if (isPrime[i-1]) {
			
			//print out all prime numbers
			System.out.println(i);
			
			//remove all the subsequent multiples of i
			for (int j = i*i; j <= N; j += i) {
				isPrime[j-1] = false;
			}
		}
		}
	}
}
//test