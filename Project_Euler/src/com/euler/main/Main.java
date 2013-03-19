package com.euler.main;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.euler.fibonacci.Fibonacci;
import com.euler.largestpalindromeproduct.LargestPalindromeProduct;
import com.euler.primefactors.PrimeFactorGenerator;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) throws IOException {

		String input = null;
		long longInput;
		int intInput;

		intInput = Integer.parseInt(readInput());
		//longInput = Long.parseLong(readInput());

		LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct(intInput);
		largestPalindromeProduct.calculateLargestPalindromeProduct();
	}

	public static String readInput() throws IOException
	{
		String input = null;
		System.out.println("Enter number: ");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		input = bReader.readLine();
		return input;	
	}

}