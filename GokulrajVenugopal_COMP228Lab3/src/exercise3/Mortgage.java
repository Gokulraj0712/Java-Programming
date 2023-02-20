package exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

//Abstract class to implement the MortgageConstants interface 
public abstract class Mortgage implements MortgageConstants 
{

	protected String mortgageNumber;
	protected String customerName;
	protected double amtOfMortgage;
	protected double interestRate;
	protected int    term;

	public Mortgage(String mortgageNum, String custName, double amount, double intRate, int term)
	{

		this.mortgageNumber = mortgageNum;
		this.customerName   = custName;
		this.interestRate   = intRate;
		this.amtOfMortgage  = amount;
		this.term           = term;
			
		while (amount > maxMortgageAmount) 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please Enter Mortgagevalue Below CAD " +maxMortgageAmount );
			try 
			{
				amount = Double.parseDouble(br.readLine());
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		this.amtOfMortgage = amount + (amount*intRate*this.term/100);
	}
    
	//GetMortgageInfo method to display all the mortgage data.
	abstract void getMortgageInfo();
}


