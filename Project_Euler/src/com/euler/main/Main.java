package com.euler.main;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.euler.fibonacci.Fibonacci;
import com.euler.largestpalindromeproduct.LargestPalindromeProduct;
import com.euler.primefactors.PrimeFactorGenerator;
import com.euler.smallestmultiple.SmallestMultipleFinder;
import com.euler.sumsquaredifference.SumSquareDifferenceFinder;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) throws IOException {

		String input = null;
		long longInput;
		int intInput1, intInput2;

		intInput1 = Integer.parseInt(readInput());
		intInput2 = Integer.parseInt(readInput());
		//longInput = Long.parseLong(readInput());

		SumSquareDifferenceFinder sumSquareDifferenceFinder = new SumSquareDifferenceFinder(intInput1, intInput2);
		sumSquareDifferenceFinder.findSumSquareDifference();
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