package exercise2;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

public class PartTimeGameTester extends GameTester
{
	private double hours;
	private double Salary;
	

	public PartTimeGameTester(double Hours,String Name, boolean Status) 
	{
		super();
		name  = Name;
		hours = Hours;		
	}
	@Override
	public void salary() 
	{
		Salary =  20 * hours;
		
	}
	public String toString()
	{
		System.out.println("\nGameTester Details\n----------------------");
		return  "GameTester Name: "+name+"\n"
			   +"GameTester Type: Part-Time GameTester" +"\n"
			   +"GameTester Salary: CAD "+Salary;
    }

}
