package com.euler.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.euler.fibonacci.Fibonacci;
import com.euler.largestpalindromeproduct.LargestPalindromeProduct;
import com.euler.largestproductinseries.LargestProductInSeries;
import com.euler.primefactors.PrimeFactorGenerator;
import com.euler.primefinder.PrimeFinder;
import com.euler.primesummarizer.PrimeSummarizer;
import com.euler.pythagoreantriplets.PythagoreanTripletFinder;
import com.euler.smallestmultiple.SmallestMultipleFinder;
import com.euler.sumsquaredifference.SumSquareDifferenceFinder;
import com.euler.utils.Utils;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) throws IOException {

		String input = null;
		long longInput;
		int intInput1, intInput2;

		//intInput1 = Integer.parseInt(Utils.readInput());
		//longInput = Long.parseLong(Utils.readInput());
		PrimeSummarizer primeSummarizer = new PrimeSummarizer(Integer.parseInt(Utils.readInput("Input limit: ")));
		primeSummarizer.Summarize();
	}
}