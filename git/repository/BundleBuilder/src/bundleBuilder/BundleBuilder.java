package bundleBuilder;
import javafx.stage.*;

import java.awt.Insets;
import java.awt.Label;



import javafx.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;




public class BundleBuilder extends Application {

	public static void main(String[] args) {
		
		launch(args);
			
		
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Create phone objects
		
		Phone weekend = new Phone(5.00, "Weekend", "Phone", "Weekend only", 11.10);
		Phone evening = new Phone(7.50, "Evening", "Phone", "Evening and weekend", 11.10);
		Phone anytime = new Phone(12.5, "Anytime", "Phone", "Evening and weekend", 11.10);
		
		// Create broadband objects
		
		Broadband fast = new Broadband(20.00, "Fast", "Broadband", 50);
		Broadband faster = new Broadband(25.00, "Faster", "Broadband", 100);
		Broadband fastest = new Broadband(30.00, "Fastest", "Broadband", 200);
		
		// Create TV objects
		
		Television small = new Television(30.00, "Small", "Television", 200);
		Television medium = new Television(40.00, "Medium", "Television", 250);
		Television large = new Television(50.00, "Large", "Television", 300);
		
		// Create discount objects
		
		Discount newDiscount = new Discount(10,"New customer");
		Discount loyalDiscount = new Discount(20,"Loyal customer");
		Discount returningDiscount = new Discount(15,"New customer");
	     
	      
	      //Creating Buttons 
	    
	      Button button = new Button("Calculate price");  
	      Button button1 = new Button("Clear");
	      
	      button1.setMinWidth(130);
	      button.setMinWidth(130);
	      
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane  
	      gridPane.setMinSize(400, 200); 
	      
	        
	       
	      //Creating the combo boxes
	      ObservableList<String> phoneOptions =
	    		  FXCollections.observableArrayList(
	    				  weekend.getName(),
	    				  evening.getName(),
	    				  anytime.getName());
	      ComboBox phoneBox = new ComboBox(phoneOptions);
	      phoneBox.setMaxWidth(130);
	      
	      phoneBox.setValue("Phone");
	      
	      ObservableList<String>tvOptions =
	    		  FXCollections.observableArrayList(
	    				  small.getName(),
	    				  medium.getName(),
	    				  large.getName());
	      ComboBox tvBox = new ComboBox(tvOptions);
	      tvBox.setMaxWidth(130);
	      
	      tvBox.setValue("Television");
	      
	      ObservableList<String>bbOptions =
	    		  FXCollections.observableArrayList(
	    				  fast.getName(),
	    				  faster.getName(),
	    				  fastest.getName());
	      ComboBox bbBox = new ComboBox(bbOptions);
	      bbBox.setMaxWidth(130);
	      
	      bbBox.setValue("Broadband");
	      
	      ObservableList<String>discountOptions =
	    		  FXCollections.observableArrayList(
	    				  "New customer",
	    				  "Loyal customer",
	    				  "Returning customer");
	      ComboBox discountBox = new ComboBox(discountOptions);
	      discountBox.setMaxWidth(130);
	      
	      discountBox.setValue("Discount");
	      
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	     
	       
	      //Arranging all the nodes in the grid 
	      gridPane.add(phoneBox, 0, 0); 
	      gridPane.add(tvBox, 1, 0); 
	      gridPane.add(bbBox, 0, 1);       
	      gridPane.add(discountBox, 1, 1); 
	      gridPane.add(button1, 0, 2); 
	      gridPane.add(button, 1, 2);  
	      
	      //Creating a scene object 
	      Scene scene1 = new Scene(gridPane);  
	      
	      
	      //Setting title to the Stage 
	      primaryStage.setTitle("Bundle Builder"); 
	         
	      //Adding scene to the stage 
	      primaryStage.setScene(scene1); 
	         
	      //Displaying the contents of the stage 
	      primaryStage.show(); 
		
	      //Event to calculate price 
	      
	      button.setOnAction(new EventHandler() {
	    	    

				@Override
				public void handle(Event event) {
					// TODO Auto-generated method stub
			
					
					double phonePrice = 0;
					double tvPrice = 0;
					double bbPrice = 0;
					double discount = 0;
					
					//Calculate the price of the phone aspect 
					
					if (phoneBox.getValue().equals("Weekend")) {
						phonePrice = weekend.getPrice();
					}
					
					else if (phoneBox.getValue().equals("Evening")) {
						phonePrice = evening.getPrice();
					}
					else if (phoneBox.getValue().equals("Anytime")) {
						phonePrice = anytime.getPrice();
					}
					
					//Calculate the price of the broadband 
					
					if (bbBox.getValue().equals("Fast")) {
						bbPrice = fast.getPrice();
					}
					
					else if (bbBox.getValue().equals("Faster")) {
						bbPrice = faster.getPrice();
					}
					else if (bbBox.getValue().equals("Fastest")) {
						bbPrice = fastest.getPrice();
					}
					
					//Calculate the price of the TV
					
					if (tvBox.getValue().equals("Small")) {
						tvPrice = small.getPrice();
					}
					
					else if (tvBox.getValue().equals("Medium")) {
						tvPrice = medium.getPrice();
					}
					else if (tvBox.getValue().equals("Large")) {
						tvPrice = large.getPrice();
					}
					
					//Calculate the discount amount
					
					if (discountBox.getValue().equals("New customer")) {
						discount = newDiscount.getValue();
					}
					
					else if (discountBox.getValue().equals("Loyal customer")) {
						discount = loyalDiscount.getValue();
					}
					else if (discountBox.getValue().equals("Returning customer")) {
						discount = returningDiscount.getValue();
					}
					
					//Calculate the total price of the package
					
					double totalPrice = phonePrice + bbPrice + tvPrice - discount;
					
					
					// Display alert box with the total price and info
					
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Total price of package");
					alert.setHeaderText("This is the total monthly cost to the customer");
					alert.setContentText("Phone: " + phonePrice  + "\n" +
							"Broadband: " + bbPrice  + "\n" +
							"Television: " + tvPrice  + "\n" +
							
							"Discount: " + discount +  "\n" +
 							
							"Total price : " + totalPrice);

					alert.showAndWait();
				
					
				}
	    	});
		
	      button1.setOnAction(new EventHandler() {
	    	  
	    	  // Event to clear combo boxes
	    	    

				@Override
				public void handle(Event event) {
					// TODO Auto-generated method stub
			
					phoneBox.setValue("Phone");
					tvBox.setValue("Television");
					bbBox.setValue("Broadband");
					discountBox.setValue("Discount");
			
				
					
				}
	    	});	
		
		
		

		
	}

	
	
}
