/**
 * Money.java
 * A class to model money, in dollars and
 * cents.  This class contains fields for
 * dollars and cents, and methods that can
 * be used to manipulate these fields:
 * adding, subtracting, multiplying and
 * dividing.
 * @author Scott DeRuiter and YOUR NAME HERE
 * @version 1.0
 * @since 8/25/2021
 */
public class Money
{
	/** The number of dollars in the money object.  */
	private int myDollars;
	/** The number of cents in the money object.  */
	private int myCents;
	
	/** Creates a Money object, setting both the
	 *  fields equal to zero.
	 */
	public Money ( )
	{
		myDollars = 0;
		myCents = 0;
		//initialize(0, 0);
	}
	
	/** Creates a Money object, setting both the
	 *  fields equal to the values passed in through
	 *  the parameter list.
	 *  @param  newDollars  The number of dollars.
	 *  @param  newCents  The number of cents.
	 */
	public Money(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
		//initialize(newDollars, newCents);
	}
	
	/** Initializes the money, with the values
	 *  passed in through the parameter list.
	 *  @param  newDollars  The number of dollars.
	 *  @param  newCents  The number of cents.
	 */
	public void initialize(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
	}
	
	/** Adds the Money in the parameter list to 
	 *  the Money in the current Money object.
	 *  @param  amount    Money to be added.
	 *  @return  The result of adding this and amount.
	 */
	public Money add(Money amount)
	{
		Money result = new Money();
		result.myCents = myCents + amount.myCents;
		result.myDollars = myDollars + amount.myDollars;
		return result;
//		Money result = new Money();
//		result.myCents = this.myCents + amount.myCents;
//		result.myDollars = this.myDollars + amount.myDollars + result.myCents / 100;
//		result.myCents = result.myCents % 100;
//		return result;
	}
	
	/** Returns a String that represents the amount of Money.
	 *  @return  A String representing the amount of Money.
	 */
	public String toString ( )
	{
		normalize();
		if (myCents < 10)
		{
			return "$" + myDollars + ".0" + myCents;
		}
		else
			{
				return "$" + myDollars + "." + myCents;
			}
	}

	/** The method makes it so that myCents is between
	 * 0 and 99, and the extra money gets added to
	 * myDollars.
	 */

	private void normalize( )
	{
		if (myCents > 100)
		{
			int remainder = myCents % 100;
			int quotient = myCents/100;
			myCents = remainder;
			myDollars += quotient;
		}
	}

	public Money multiply(int multiplier)
	{
		Money result = new Money();
		result.myCents = myCents * multiplier;
		result.myDollars = myDollars * multiplier;
		result.normalize();
		return result;
	}

	public Money subtract(Money amount)
	{
		Money result = new Money();
		result.myCents = myCents - amount.myCents;
		result.myDollars = myDollars - amount.myDollars;
		if (result.myCents < 0) {
			result.myDollars -= 1;
			result.myCents = (100 + myCents) - amount.myCents;
		}
		result.normalize();
		return result;
	}


	/** Returns the number of dollars in the Money object.
	 *  @return  an int representing the number of dollars.
	 */

	public int getDollars ( )
	{
		return myDollars;
	}
	
	/** Returns the number of cents in the Money object.
	 *  @return  an int representing the number of cents.
	 */
	public int getCents ( )
	{
		return myCents;
	}
}
