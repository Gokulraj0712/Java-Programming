package application;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import application.Database;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	public TextField t_CityField;
	public Button display;
	TextArea  textArea;

	
	@Override
	public void start(Stage primaryStage) {			
			//Create Border Pane Layout
			primaryStage.setTitle("Student Info");
			BorderPane border = new BorderPane();
			border.setLeft(addGridPaneLeft());
			border.setRight(addGridPaneRight());
			textArea = new TextArea();
			border.setBottom(textArea);
		    Scene scene = new Scene(border, 800, 500);
		    
		    // Place the scene in the stage
		    primaryStage.setScene(scene); 
		    
		    //Display the stage
		    primaryStage.show();
			
		    
		    display.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent e)
				{
					String city_Name = t_CityField.getText();
					
				    Connection connection = null;
		            PreparedStatement statement = null;
					try
					{
						connection = Database.getDBConnection();
						connection.setAutoCommit(false);
						
						//Display Data					
		                String query = "SELECT * FROM STUDENT WHERE CITY='"+city_Name+"'";
						statement = connection.prepareStatement(query);
	                    ResultSet rs = statement.executeQuery();
	                    
						int i=0;
			
						while(rs.next())
						{
							if(i==0)
							{
								String head=String.format("%1$-15s %2$-15s %3$-15s %4$-30s %5$-10s %6$-15s %7$-15s",
										"Student Id","FirstName","LastName",
									"Address","City","Province","postalCode");
								textArea.appendText(head + "\n");
							}
							String Id = rs.getString("StudentId");
							String fName = rs.getString("FirstName");
							String lName = rs.getString("LastName");
							String address = rs.getString("Address");
							String city = rs.getString("City");
							String province = rs.getString("Province");
							String postalCode = rs.getString("PostalCode");
						
							String[] stateInfo = new String[]{
									Id,fName,lName,address,city,province,postalCode
							};
							
							    String s = String.format("%1$-15s %2$-15s %3$-15s %4$-15s %5$-12s %6$-15s %7$-15s",
							    		stateInfo[0],stateInfo[1],stateInfo[2],stateInfo[3],stateInfo[4],
							    				stateInfo[5],stateInfo[6]);
							    							    
							    textArea.appendText(s + "\n");
								i++;
						
						}
				
					}
					catch (SQLException e1) {
					e1.printStackTrace();
					}
				}
			});
		
	}
	

	
	public GridPane addGridPaneLeft()
	{
		GridPane pane = new GridPane();
	    pane.setAlignment(Pos.TOP_LEFT);
	    pane.setPadding(new Insets(20, 20, 20, 20));
	    pane.setHgap(10);
	    pane.setVgap(5);	
		 
	    //Adding fields into border Pane
	    pane.add(new Label("Select students by City: "), 0, 5);
	    return pane;
	}
	
	public GridPane addGridPaneRight()
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_RIGHT);
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.setHgap(10);
	    pane.setVgap(10);
	    
	    //Create buttons
	    display = new Button("Display");
	    display.setMaxSize(100, 800);
	    t_CityField = new TextField();
		pane.add(t_CityField, 0, 1);
		pane.add(display, 0, 3);
		return pane;	
	}
	
	public boolean isDbConnected(Connection con) {
	    try {
	        return con != null && !con.isClosed();
	    } catch (SQLException ignored) {}

	    return false;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}