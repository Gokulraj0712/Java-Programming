package midTermTest;


//Abstract class named Businsess.
public abstract class Business {

	   //Instance variable
	   int numEmp;
	  
	   //One argument constructor
	   public Business(int nEmp) 
	   {
	       this.numEmp = nEmp;
	   }
	  
	   //Abstract method: numEmployee(). This method does not take any arguments.
	   public abstract int numEmployee();

	   //toString() method
	   @Override
	   public String toString() {
	       return "Number of Employees in Your Business:" + numEmp;
	   }
}
