package com.euler.main;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.euler.fibonacci.Fibonacci;
import com.euler.primefactors.PrimeFactorGenerator;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) throws IOException {

		String input = null;
		long numberInput;


		numberInput = Long.parseLong(readInput());

		PrimeFactorGenerator primeFactorGenerator = new PrimeFactorGenerator(numberInput);
		primeFactorGenerator.generatePrimeFactors();
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