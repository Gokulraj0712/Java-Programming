package exercise3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

//main class 
public class ProcessMortgage
{
	private static final String business ="B";
	private static final String personal ="P";

	public static void main(String[] args) 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Array of 3 mortgages
		Mortgage mortgageArray[] = new Mortgage[3];
		
		double intRate = 0;
		boolean flag = true;
		
		//Prompt the user for the current interest rate.
		System.out.println("Enter Current Interest Rate: ");
		try 
		{
			try 
			{
				intRate = Double.parseDouble(br.readLine());
			}
			catch (Exception e) 
			{
				throw new Exception("Please Enter Valid Interest Rate!!!!!");
			}
                //User is asked for Mortgage type and other Mortgage Informations 
			    for (int i = 0; i < 3; i++)
			    {
				System.out.println("Enter details of "+(i+1)+(i+1==1?"st":(i+1==2)?"nd":"rd") + " Mortgage.");
				System.out.println("Enter Name: ");
				String name = br.readLine();
				System.out.println("Enter Mortage Number: ");
				String mortgageNumber = br.readLine();
				System.out.println("Choose Mortgage Type from Below Code: ");
				System.out.println("Business Mortgage, Enter Code: B");
				System.out.println("Personal Mortgage, Enter Code: P");
				String mortgageType = br.readLine();
				
				if((null != mortgageType) && !(mortgageType.equals(business) || mortgageType.equals(personal))) 
				{
					throw new Exception ("Please enter correct Mortgate Type");
				}
				System.out.println("Enter Mortgage Term In Years: ");
				int term = Integer.parseInt(br.readLine());
				System.out.println("Enter Mortgage Amount: ");
				double amount = Double.parseDouble(br.readLine());

				Mortgage mortgage = null;
				switch(mortgageType)
				{
				case business:
					{
					mortgage = new BusinessMortgage(mortgageNumber, name, amount, intRate, term);
					break;
					}
				case personal:
					{
						mortgage = new PersonalMortgage(mortgageNumber, name, amount, intRate, term);
					break;
					}
				}
				mortgageArray[i] = mortgage;
			}
		} 
		catch (Exception ex)
		{
			flag = false;
			System.err.println(ex.getMessage());
		}	

		if(flag) 
		{
			if(null!= mortgageArray && mortgageArray.length>0)
			{
				//Display all mortgages
				System.out.println("\nDISPLAYING ALL MORTGAGE DETAILS");
				System.out.println("-----------------------------------");
				for (Mortgage mort : mortgageArray) 
				{
					if(null!=mort)
					{
						mort.getMortgageInfo();
					}


				}
			}
		}
	}


}
