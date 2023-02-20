package gokulrajVenugopal_COMP228Lab2_Exercise1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Test 
	{
		//Array of questions
		ArrayList<Question> qusList;
		
	  	//Count of correct answers
		int noOfCorrectAnswers;
		
	  	//Count of Incorrect Answers
		int noOfIncorrectAnswers;
		
	  	//Index value of the current question
		int currentQuestion;

		public Test() 
		{
			//Initializing values
			noOfCorrectAnswers   = 0;
			noOfIncorrectAnswers = 0;
			currentQuestion      = 0;
			
			//Array list of questions
			qusList = new ArrayList<>();
			
			//Five questions about first three lectures of this course.
			qusList.add(new Question("Methods of the same name can be declared in the same class,What property is this? "+ " ", 
					new String[]{"Inheritance", "Polymorphism", "Method Overloading", "Encapsulation"}, 2));
			qusList.add(new Question("What Modifer is accessible only to methods of the class which they are declared? " + " ",
					new String[]{"Private", "Public", "Static", "Protected"}, 0));
			qusList.add(new Question("Class variables must be declared as _______. "+ " ",
					new String[]{"Const", "Var", "Final", "static"}, 3));
			qusList.add(new Question("Which is not a concept of Object Oriented Programming?"  + " ",
					new String[]{"Polymorphism", "Abstraction", "Aggregation", "Inheritence"}, 2));
			qusList.add(new Question("Constructors should have the same name as the________?." + " ",
					new String[]{"Object", "Class", "Method", "Function"}, 1));
		}
    
     	//Method to simulate the questions
		public Question simulateQuestion()
		{
			return qusList.get(currentQuestion++);
		}

	   	//Method to check the answers
	   public boolean checkAnswer(Question qus, int ans)
	   	{
		   //If answer is correct
		   if (qus.getCorrect() == ans)
		   {
			   noOfCorrectAnswers++;
			   //Return true
			   return true;
		   }  
		   
		   //If answer is incorrect
		   else 
		   {
			   noOfIncorrectAnswers++;
			   return false;
		   }
	   	}
	   
	   	//Method to display a random message for the user 
	   	public String generateMessage(Question qus, boolean good) 
	   	{
	   		//Random Object to displaying random message from users
	   		Random randomMessage = new Random();
	    
	   		//String variable used to store the Message from users
	   		String str = "";
	    
	   		//For right answer
	   		if (good)
	   		{
	   			//Range 0-3
	   			switch (randomMessage.nextInt(4))
	   			{
	   				case 0:
	   					str = "Excellent!";
	   					break;
	   				case 1:
	   					str = "Good!";
	   					break;
	   				case 2:
	   					str = "Keep up the good work!";
	   					break;
	   				case 3:
	   					str = "Nice work!";
	   					break;
	   			}
	      
	   			//Return the string
	   			return str;
	   		} 
	      
	   		// For Incorrect answers
	   		else
	   		{
	   			// Range 0 - 3
	   			switch (randomMessage.nextInt(4))
	   			{
	   				case 0:
	   					str = "No. Please try again";
	   					break;
	   				case 1:
	   					str = "Wrong. Try once more";
	   					break;
	   				case 2:
	   					str = "Don't give up!";
	   					break;
	   				case 3:
	   					str = "No. Keep trying...";
	   					break;
	   			}
	      
	   			//Return string with  message and correct Answer
	   			return str + "\nThe Correct Answer is: " + qus.getCorrectOption();
	   		}
	   	}

	   	public void inputAnswer() 
	   	{
	   		do 
	   		{
	   			//Current question
	   			Question currentqus = simulateQuestion();
	      
	   			//DialogBox with the current Question and it's Options 
	   			String answer = JOptionPane.showInputDialog(currentqus.getQuestions());
	      
	   			//Exception Handling
	   			try 
	   			{  
	   				int ans = Integer.parseInt(answer);
	   				
	   				//Checking whether the answer belongs to the range,0-4
	   				if (ans >= 1 && ans <= 4) 
	   				{
	   					boolean good = checkAnswer(currentqus, (ans - 1));
	   					JOptionPane.showMessageDialog(null, generateMessage(currentqus, good));
	   				} 
	   				else 
	   				{
	   					//Decrease the current answers
	   					currentQuestion--;
	   					
	   					//Show the output dialog with error
	   					JOptionPane.showMessageDialog(null, "Invalid answer. \nPlease enter 1, 2, 3, or 4");
	   				}

	   			} 
	   			
	   			//If we can't parse the answer to integer
	   			catch (NumberFormatException e) 
	   			{
	   				//Decrease the current answers
	   				currentQuestion--;
	   				
	   				//Show the output dialog with error
	   				JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value");
	   			}
	   			
	   			//While currentAnswer < number of questions
	   		} while (currentQuestion < qusList.size());

	   		//Calculate the percentage of Correct Answers
	   		double perc = (double) noOfCorrectAnswers  / qusList.size() * 100;
	   		
	   		//Show the output dialog with the results
	   		JOptionPane.showMessageDialog(null, "Correct Answers: " + noOfCorrectAnswers 
	   				+ "\nIncorrect Answers: " + noOfIncorrectAnswers +
	   				"\nPercentage of Correct Answers: " + perc + "%");

	   	}
	   	
	   	public class Question 
	   		{
	   			//String variable for question and it's options.
	   			String question;
	   			String options[];
	   			int correct;
	   			public Question(String question, String[] options, int correct) 
	   			{
	   				this.question = question;
	   				this.options = options;
	   				this.correct = correct;
	   			}
	   			public int getCorrect()
	   			{
	   				return correct;
	   			} 
	   			public String getCorrectOption()
	   			{
	   				return options[correct];
	   			}
				  public String getQuestions() 
				  {
				    String str = question + "\n";
				    str += "1. " + options[0] + "\n";
				    str += "2. " + options[1] + "\n";
				    str += "3. " + options[2] + "\n";
				    str += "4. " + options[3] + "\n";
	              return str;
				  }
			}
	   	
	   	public static void main(String[] args)
		{
	   		//Object for test class and calling method inputAnswer
		    Test obj = new Test();
		    obj.inputAnswer();
		}
	}
