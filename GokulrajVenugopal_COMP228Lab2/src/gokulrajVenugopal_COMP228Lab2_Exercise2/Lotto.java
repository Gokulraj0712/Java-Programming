package gokulrajVenugopal_COMP228Lab2_Exercise2;

import javax.swing.JOptionPane;

public class Lotto 
	{
		private int[] array;
		
		//Constructor Lotto
		public Lotto()
		{
			array = new int[3];
		       
			//Loop to add 3 integer values to the array
			for (int index = 0; index <3 ; index++) 
			{
				int number = (int) (Math.random() * (9 - 1)+ 1);
				array[index] = number;
			}
		}
		
		//Method for returning the array
		public int[] getArray()
		{
			return array;
		}
		
		//Main Method
		public  static  void main(String[] args)
		  {
			 Lotto test = new Lotto();
			 int[] arr = test.getArray();
			 int sum =0;
			 
			 //Loop used to add the values of the array
			 for (int index = 0; index <arr.length ; index++) 
			 {
				 sum = sum+arr[index];
			 }
			 
		     int numb =0;
			 boolean win = false;

			 for (int index = 0; index <5 ; index++) 
			 {
				 numb = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
				 
				 //Loop used to Enter a number and check the limit of entered number
				 while (numb < 3 || numb > 27)
				 	{
					 	JOptionPane.showMessageDialog(null, "Please enter a digit  between 3 - 27");
					 	numb = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
				 	}
				 
				 //Checking entered number equal to sum of array values and display messages accordingly
				 if (numb == sum)
				 	{
					 	JOptionPane.showMessageDialog(null,"You have win the game.");
					 	win = true;
					 	break;
				 	}
				 else
			  		{
					 	JOptionPane.showMessageDialog(null, "Please try again.");
			  		}
			  }
			 
			 //Displaying the message after 5 chances
			  if(!win)
			    {
			      JOptionPane.showMessageDialog(null,"You have lose all chances to win the game.");
			    }
		  	}
	}
	

