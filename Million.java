/** 
 * Million.java
 * Finds all of the prime numbers
 * under one million and then returns
 * the sum of them.
 * @author Krithika Singh
 * @version 1.0
 * @since 8/30/2021
 */

import java.lang.Math;

public class Million
{
	/** Runs an instance of Million. */
	public static void main(String []args)
	{
		Million run = new Million();
		run.isPrime();
	}

	public long isPrime ()
	{
		long sumOfPrime = 2;
		boolean isPrime = true;
		for (int i = 3; i < 1000000; i++)
		{
			isPrime = true;
			for (int j = 2; j < Math.sqrt(i) + 1; j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime == false)
			{
				continue;
			}
			sumOfPrime += i;

		}
		System.out.println("Sum of Primes: " + sumOfPrime);
		return sumOfPrime;
	}

}


/** for loop under one million
 * do mod to see if number is divisible
 * by all the numbers less than it
 * then add that
 */
