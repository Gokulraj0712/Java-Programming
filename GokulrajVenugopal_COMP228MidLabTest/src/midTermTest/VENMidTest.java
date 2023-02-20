package midTermTest;

import java.util.Scanner;

//Driver Class
public class VENMidTest {
	
	//main method
	public static void main(String[] args) 
	{
       
	   //Scanner object to read input from keyboard
       Scanner scan = new Scanner(System.in);
      
       //Promp for user input
       System.out.println("How many employees work in your business?");
       int numEmp = scan.nextInt();
      
       System.out.println("\nHow much do you earn from your grocery business?");
       double groceryIncome = scan.nextDouble();
      
       //Uses above 2 user inputs to create a GroceryBusiness object -groceryBusiness
       GroceryBusiness groceryBusiness = new GroceryBusiness(numEmp, groceryIncome);
      
       //Display the string representation of the object you just created.
       System.out.println("\nThe Data You Just Entered for Your Grocery Business: ");
       System.out.println(groceryBusiness);
      
       //User Prompt asking for the year the grocery business was established
       System.out.println("\n\nIn which year you established your grocery business? ");
       int year = scan.nextInt();
      
       //Display the year you entered.
       groceryBusiness.yearEstablished(year);
      
       //User Prompt asking for  the current price of onion per kilo
       System.out.println("\n\nWhat is the price for onion per kilo?");
       double onionPrice = scan.nextDouble();
       
       //User Prompt asking for the current price of coke per bottle
       System.out.println("\nWhat is the price for coke per bottle?");
       double cokePrice = scan.nextDouble();
      
       //Display the prices you entered for Onion and Coke
       System.out.println("\n\nPrice List:");
       groceryBusiness.onionPrice(onionPrice);
       groceryBusiness.cokePrice(cokePrice);
   }

}
