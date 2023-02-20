package exercise2;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

public class FullTimeGameTester extends GameTester
{

	private double Salary;
	public FullTimeGameTester(String Name, boolean Status)
	{
		super();
		name = Name;
	}

	@Override
	public void salary() 
	{
		Salary = 3000;
		
	}
	public String toString()
	{
		System.out.println("\nGameTester Details\n----------------------");
		return  "GameTester Name: "+name+"\n"
		       +"GameTester Type: Full-Time GameTester" +"\n"
		       +"GameTester Salary: CAD "+Salary;
	 }
}
