package midTermTest;


/*This class makes use of both the interfaces: Onion and Coke
also makes use of the abstract class Business */

public class GroceryBusiness extends Business implements Onion,Coke{

		//Instance variable
	   private double groceryIncome;
	  
	  
	   //Two argument constructor which calls Business class constructor
	   public GroceryBusiness(int nEmp, double gIncome) 
	   {
	       //Calls Business class constructor with super() function
	       super(nEmp);
	       this.groceryIncome = gIncome;
	   }

	   //Concrete method yearEstablished()
	   void yearEstablished(int year) 
	   {
	       System.out.println("You established your business in year: "+year);
	   }
	   
	   //Coke interface abstract method cokePrice() implementation
	   @Override
	   public void cokePrice(double cPrice) {
	       System.out.println("The price per bottle of Coke is: "+cPrice);
	   }

	   //Onion interface abstract method onionPrice() implementation
	   @Override
	   public void onionPrice(double oPrice) {
	       System.out.println("The onion price per kilo is: "+oPrice);
	   }

	   //Business abstract class abstract method numEmployee() implementation- Override
	   @Override
	   public int numEmployee() {
	       return this.numEmp;
	   }

	   //Getter method for private instance variable - groceryIncome
	   public double getGroceryIncome() 
	   {
	       return groceryIncome;
	   }

	   //Setter method for private instance variable - groceryIncome
	   public void setGroceryIncome(double groceryIncome) 
	   {
	       this.groceryIncome = groceryIncome;
	   }

	   // toString() method overriding with new string output
	   @Override
	   public String toString() {
		   return "Number of Employees in Your Business: "+numEmployee() +
				   "\ngroceryIncome: "+(int)groceryIncome;
	   }
	  
	
	
}
