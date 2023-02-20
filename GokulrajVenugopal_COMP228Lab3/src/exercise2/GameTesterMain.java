package exercise2;

import java.util.Scanner;

	/* 
	 * File Name: GokulrajVenugopal_COMP228Lab3
	 * Student Name: Gokulraj Venugopal
	 * Student ID: 301202722
	 * Date: 28-Feb-2022 
	*/

public class GameTesterMain
{
	public static void main(String[] args)
	{
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//Finding the type of game tester
		System.out.println("\tWELCOME TO GOKTES GAME COMPANY");
		System.out.println("-----------------------------------------------------\n");
		System.out.println("Enter Game Tester Type (FullTime/PartTime): ");
		String gametype = input.next();
		
		//Checking all possible inputs for Full time Gamer
		if(gametype.equals("Fulltime") || gametype.equals("FullTime") || gametype.equals("fulltime")) 
		{
			System.out.println("Enter GameTester Name: ");
			String name = input.next();
			GameTester game1 = new FullTimeGameTester(name, true);
			game1.salary();
			System.out.println(game1);	
		}
		
		//checking all possible inputs for Part time Gamer
		else if(gametype.equals("Parttime") || gametype.equals("PartTime") || gametype.equals("parttime")) 
		{
			System.out.println("Enter GameTester Name: ");
			String name = input.next();
			System.out.println("Enter Number of Hours Worked: ");
			double hrs = input.nextDouble();
			GameTester game1 = new PartTimeGameTester(hrs, name, false);
			game1.salary();
			System.out.println(game1);
		}
		else 
		{
			System.out.println("Wrong Input For Game Tester Type");
	    }
	}
}
