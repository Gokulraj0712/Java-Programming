package exercise1;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

public class Health extends Insurance
{
	protected double pay;
	
	//Constructor with 2 parameter
	public Health(String Type_Of_Insurance,double Monthly_Cost) 
	{
		super(Type_Of_Insurance, Monthly_Cost);
	}
	
	//Set method to set cost
	@Override
	public void setInsuranceCost(double monthly_cost) 
	{
		pay = monthly_cost;
	}
	
	//Method To Display Information
	@Override
	public void displayInfo()
	{
		System.out.println(" ");
		System.out.println("Insurance Type: "+getTypeOfInsurance());
		System.out.println("Monthly Payment For "+ getTypeOfInsurance() +" Insurance: " +"CAD" +getMonthlyCost());
		
	}
}