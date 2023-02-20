package exercise3;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

//Extends Mortgage class
public class BusinessMortgage extends Mortgage
{
    //Constructor sets the interest rate to 1% over the current prime rate.
	public BusinessMortgage(String mortgageNumber, String name, double amt, double intRate, int term) 
	{
		super(mortgageNumber, name, amt,  (1+intRate), term);
	}

	@Override
	void getMortgageInfo() 
	{
		System.out.println("\nHello  " +customerName +" , Welcome to "+bankName );
		System.out.println("***You have chosen Business Mortgage***");
		System.out.println("Mortage Number    : "    +mortgageNumber);
		System.out.println("Bank Name         : "          +bankName);
		System.out.println("Interest Rate     : "      +interestRate);
		System.out.println("Term              : "             + term);
		System.out.println("Amount of Mortgage: "     +amtOfMortgage);
		
	}
}