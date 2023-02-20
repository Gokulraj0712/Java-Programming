package exercise1;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

//Abstract superclass 
public abstract class Insurance 
{
	//Instance variable of type String depicting type of insurance 
	protected String typeOfInsurance;
	
	//Instance variable of type double to hold the monthly cost of insurance.
	protected double monthlyCost;
	
	public Insurance(String Type_of_insurance,double Monthly_cost)
	{
		typeOfInsurance = Type_of_insurance;
		monthlyCost     = Monthly_cost;
	}
	
	
	//Get methods for both variables of class Insurance.
	public String getTypeOfInsurance() 
	{
		return typeOfInsurance;
	}

	public double getMonthlyCost()
	{
		return monthlyCost;
	}
	
	//Two abstract methods.
    public abstract void setInsuranceCost(double monthly_fee);	
	public abstract void displayInfo();

}

