package com.euler.largestpalindromeproduct;

public class LargestPalindromeProduct 
{
	int first;
	int second;
	long largestPalindrome;
	int palindromeFirst;
	int palindromeSecond;
	int numberOfDigits;
	
	public LargestPalindromeProduct(int numberOfDigits)
	{
		first = 0;
		second = 0;
		largestPalindrome = 0;
		palindromeFirst = 0;
		palindromeSecond = 0;
		this.numberOfDigits = numberOfDigits;
		for (int i = 0; i < numberOfDigits; i++)
		{
			first = (first * 10) + 9;
			second = (second * 10) + 9;
		}
		System.out.println("Created largest palindrome product generator for " + numberOfDigits + " digits.");
	}
	
	public void calculateLargestPalindromeProduct() 
	{
		while(first != (int)Math.pow(10, numberOfDigits - 1) - 1)
		{
			isPalindrome(first, second);
			if(second == (int)Math.pow(10, numberOfDigits - 1))
			{
				first--;
				second = first;
			}
			else
			{
				second--;
			}
		}
		
		if (largestPalindrome != 0)
			System.out.println("The largest palindrome product for " 
								+ numberOfDigits 
								+ " digits is "
								+ largestPalindrome
								+ ", a product of numbers "
								+ this.palindromeFirst
								+ " and "
								+ this.palindromeSecond);
		else
			System.out.println("No palindromes for that number of digits!");
	}

	private boolean isPalindrome(int first, int second) 
	{	
		long product = first * second;
		boolean palindrome = true;
		String stringProduct = Long.toString(product);
		
		for (int i = 0; i < (stringProduct.length() - i); i++)
		{
			if(stringProduct.charAt(i) != stringProduct.charAt(stringProduct.length() - i -1))
			{
				palindrome = false;
			}
		}
		
		if (palindrome)
		{
			if (largestPalindrome == 0 || largestPalindrome < product)
			{
				largestPalindrome = product;
				palindromeFirst = first;
				palindromeSecond = second;
			}
		}
		return palindrome;
	}
}
