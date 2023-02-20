package exercise1;
import java.util.Scanner;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

public class InsuranceMain 
{
	public static void main(String[] args)
	{
		//Object of the class Scanner
		Scanner input = new Scanner(System.in);
		
		//User Inputs
		System.out.println("\tWELCOME TO GOKTES INSURANCE");
		System.out.println("-----------------------------------------\n");
		System.out.println("Please Enter The Number of Insurances you Like to Have:  ");
		int num= input.nextInt();
		Insurance[] insurarray = new Insurance[num]; 

		for(int i=0;i<num;i++)
		{
			System.out.println("Enter The Required Type of Insurance (Health/Life): ");
			String typeOfInsurance = input.next();
			
			//When 'Health' is chosen as Insurance Type
			if(typeOfInsurance.equalsIgnoreCase("Health") || typeOfInsurance.equals("health"))
			{
				System.out.println("Enter Monthly Installment Amount for Health Insurance: ");
				double inspay = input.nextDouble();
				
				//Object of the class Health
				Insurance h1 = new Health(typeOfInsurance, inspay);
				
				//Calling setter method for insurance cost
				h1.setInsuranceCost(inspay);
				
				//Assigning the object of Health class to insurarray
				insurarray[i] = h1;
			}
			//When 'Life' is chosen as Insurance Type
			else if(typeOfInsurance.equals("Life") || typeOfInsurance.equals("life"))
			{	
				System.out.println("Enter Monthly Installment Amount for Life Insurance: ");
				double inspay = input.nextDouble();
				//Object of the class Life
				Insurance l1 = new Life(typeOfInsurance, inspay);
				
				//Calling the setter method for insurance cost
				l1.setInsuranceCost(inspay);
				
				//assigning the object of Life class to insurarray
				insurarray[i] = l1;		
			}		
			else 
			{ 
				//When user gives wrong inputs
				System.out.println("NOT A VALID INPUT!!!!!!!!!!!!");
				System.out.println("Please choose either (Health/Life) insurance!!!!!");
				i=i-1;
		}		
	    	}
			//Printing Result
			for(int j=0;j<num;j++)
			{	
				System.out.print((j+1)+") ");
				insurarray[j].displayInfo();
			}
	}
}



