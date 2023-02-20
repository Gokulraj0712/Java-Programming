package gokulrajVenugopal_COMP228Lab2_Exercise3;

public class Overload 
	{
		//Overloaded Class
    	//Method addition with 2 integer values
    	static int addition(int n1, int n2)
    	{
    		int n3 = n1 + n2;
    		return n3;
    	}
    	
    	//Method addition with 2 float values
    	static double addition(double n1, double n2)
    	{
    		double n3 = n1 + n2;
    		return n3;
    	}
    	
    	//Method addition with 3 integer values
    	static int addition(int n1, int n2, int n3)
    	{
    		int n4 = n1 + n2 + n3;
    		return n4;
    	}

    	//Main function
    	public static void main(String[] args)
    	{

    		System.out.println("Method 1-Adding two Integers:");
    		System.out.println("______________________________");
    		System.out.println("Sum of two integers: "+addition(4,5));

    		System.out.println("\nMethod 2-Adding two float variables:");
    		System.out.println("_____________________________________");
    		System.out.println("Sum of two float variables: "+ addition(4.3,6.7));

    		System.out.println("\nMethod 3-Adding three integers:");
    		System.out.println("________________________________");
    		System.out.println("Sum of three integer variable: "+ addition(1,2,3));
    	}
	}

