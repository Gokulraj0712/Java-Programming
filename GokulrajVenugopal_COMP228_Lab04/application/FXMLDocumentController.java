package application;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FXMLDocumentController implements Initializable  {
	  
	@FXML public GridPane studentInfoPane;
	@FXML public TextField nameField;
	@FXML public TextField addressField;
	@FXML public TextField cityField;
	@FXML public TextField provinceField;
	@FXML public TextField postalCodeField;
	@FXML public TextField phoneNumberField;
	@FXML public TextField emailField;
	  
	@FXML public CheckBox checkBoxStudent;
	@FXML public CheckBox checkBoxVolunteer;
	  
	@FXML public RadioButton radioComputer;
	@FXML public RadioButton radioBusiness;
	  
	@FXML public ComboBox<String> comboCourse;
	@FXML public ListView<String> listCourses;
	  
	@FXML public Button displayButton;
	@FXML public TextArea resultTextArea;
	  
	ObservableList<String> computerScienceCourses = 
			FXCollections.observableArrayList("Python","C#", "Java" );
	  
	ObservableList<String> businessCourses = 
			FXCollections.observableArrayList
	("Business Communication", "Accountancy",   "Finance for Business");
	 
	public void initialize(URL url, ResourceBundle rb) 
	{
		try
		{
			if(radioComputer.isSelected() == true)
			{
				populateComputerCourses();
			}
			else if(radioBusiness.isSelected() == true)
			{
				populateBusinessCourses();
			}
		
			comboCourse.setOnAction((e) -> 
			{
				if(!listCourses.getItems().contains(comboCourse.getSelectionModel().getSelectedItem())
					&&!(comboCourse.getSelectionModel().getSelectedItem()==null)) 
				{
					listCourses.getItems().add(comboCourse.getSelectionModel().getSelectedItem());
				}
			});  
		}
		catch (NullPointerException e ) 
		{
			System.out.print("NullPointerException caught");
		}
	}
	  
	@FXML public void populateComputerCourses()
	{
		comboCourse.getItems().removeAll();
		comboCourse.setItems(computerScienceCourses);
	}
	  
	@FXML public void populateBusinessCourses()
	{
		comboCourse.getItems().removeAll();
		comboCourse.setItems(businessCourses);
	}
	  //getting student details
	@FXML public void displayAction()
	{
		String name = nameField.getText().trim();
		String address = addressField.getText().trim();
		String city = cityField.getText().trim();
		String province = provinceField.getText().trim();
		String postalCode = postalCodeField.getText().trim();
		String phoneNumber = phoneNumberField.getText().trim();
		String email = emailField.getText().trim();
		String studentInfo="";
		try 
		{
	        if(
	                name == null || name.isEmpty() ||
	                        address == null || address.isEmpty() ||
	                        city == null || city.isEmpty() ||
	                        province == null || province.isEmpty() ||
	                        postalCode == null || postalCode.isEmpty() ||
	                        phoneNumber == null || phoneNumber.isEmpty() ||
	                        email == null || email.isEmpty()
	                        || (radioBusiness.isSelected()==false && radioComputer.isSelected()==false)
	                        ||listCourses.getItems().isEmpty()
	          )
	        {
	        	JOptionPane.showMessageDialog(null, "It is necessary to fill all the fields. ");
	        }
	        else
	        {
	        	studentInfo=
	                    "Name: " + name + "\n" +
	                            "Address: " + address + "\n" +
	                            "Province: " + province + "\n" +
	                            "City: " + city + "\n" +
	                            "Postal Code: " + postalCode + "\n" +
	                            "Phone Number: " + phoneNumber + "\n" +
	                            "Email: " + email + "\n";
      	
	        	//Display student information
	        	String otherActivities = "";
      	  
	        	if(checkBoxStudent.isSelected() && checkBoxVolunteer.isSelected()==false)
	        		otherActivities = "Student Council";
	        	else if(checkBoxVolunteer.isSelected() && checkBoxStudent.isSelected()==false)
	        		otherActivities = "Volunteeer Work";
	        	else if(checkBoxStudent.isSelected() && checkBoxVolunteer.isSelected())
	        		{
	        			otherActivities = "Student Council and Volunteeer Work";
	        		}
	        	else 
	        		{
	        			otherActivities= "No Other Activities";
	        		}
	        	String courses ="";
      	  
	        	for(String s:listCourses.getItems())
	        	{
	        		courses += s + "\n";
	        	}
      	  
	        	resultTextArea.setText("Student Details: \n" +studentInfo + "\nCourses: \n" + courses + 
      			"\nOther Activities: " + otherActivities);
	        }
	
		}
		catch (Exception e) 
			{
				
			}
	}
}
	
