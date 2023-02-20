package gokulrajVenugopal_COMP228Lab1_Exercise1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SingersTest 
{

	public static void main(String[] args) 
	{
		Singers singer1 = new Singers();
		System.out.println("___________________________________________________________________");
		System.out.println("Displaying default values of object singer1");	
		System.out.println("___________________________________________________________________");	
		System.out.println("Singer’s id               : "+singer1.getId());
		System.out.println("Singer’s name             : "+singer1.getName());
		System.out.println("Singer's address          : "+singer1.getAddress());
		System.out.println("Date of birth             : "+singer1.getDob());
		System.out.println("Number of albums published: "+singer1.getNumberOfAlbums());

		
		//Setting the values of each instance variables with the help of setters
		singer1.setId(231);
		singer1.setName("Gokulraj Venugopal");
		singer1.setAddress("Toronto, CA");
		singer1.setDob("19/11/1997");
		singer1.setNumberOfAlbums(5);
		System.out.println("\n___________________________________________________________________");
		System.out.println("Displaying values of each instance variables after setting values");
		System.out.println("___________________________________________________________________");
		System.out.println("Singer’s id               : "+singer1.getId());
		System.out.println("Singer’s name             : "+singer1.getName());
		System.out.println("Singer's address          : "+singer1.getAddress());
		System.out.println("Date of birth             : "+singer1.getDob());
		System.out.println("Number of albums published: "+singer1.getNumberOfAlbums());
	    
		
		//reading inputs from user
		Scanner scan = new Scanner(System.in);
		{
		    try 
		    {	    	
			System.out.println("\n\nPlease enter the below informations about the Singer");
			System.out.println("________________________________________________________");
			System.out.println("Enter the Singer's Id : ");
			singer1.setId(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter the Singer's Name : ");
			singer1.setName(scan.nextLine());
			System.out.println("Enter the Singer's Address : ");
			singer1.setAddress(scan.nextLine());
			System.out.println("Enter the Singer's Date in the format dd-mm-yyyy : ");
			singer1.setDob(scan.nextLine());
			System.out.println("Enter the Singer's Number of Published Albums : ");
			singer1.setNumberOfAlbums(scan.nextInt());
		    }
		    
		    catch(Exception e)
		    {
			System.out.println("Unexpected Value Entered!!! \nProgram Terminating.....");
			System.exit(0);
		    }
		    
		    //Displaying Values	after reading inputs from user
		    System.out.println("\n_______________________________________________________________________");
		    System.out.println("Displaying values of each instance variables after accepting user input");
		    System.out.println("_______________________________________________________________________");
		    System.out.println("Singer’s id               : "+singer1.getId());
		    System.out.println("Singer’s name             : "+singer1.getName());
		    System.out.println("Singer's address          : "+singer1.getAddress());
		    System.out.println("Date of birth             : "+singer1.getDob());
		    System.out.println("Number of albums published: "+singer1.getNumberOfAlbums());
	    }    

	}

}
