/*
* AddItemToMenuController.java, edited/created by Lucian Petrus
* Component 2 Part 1 - 07/01/2022
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uk.ac.rgu.cm2100.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import uk.ac.rgu.cm2100.MainApp;
import uk.ac.rgu.cm2100.model.Pizza;
import uk.ac.rgu.cm2100.model.managers.MenuManager;

/**
 * FXML Controller class
 *
 * @author Lucian
 */
public class AddItemToMenuController extends Controller <MenuManager> implements Initializable 
{    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnClickMeBack;
    
    @FXML
    private ListView<String> listOfNames;
    
    @FXML
    private ListView<String> listOfNames1;
    
    @FXML
    private Button btnClickShowToppings;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
    @Override
    public void setModel(MenuManager model) 
    {
       this.model= model;
    }
     
   @FXML
   private void fillListView()
   {
       listOfNames.getItems().add("Herbs");
        listOfNames.getItems().add("Corn");
        listOfNames.getItems().add("Mushrooms");
        listOfNames.getItems().add("Peppers");
        listOfNames.getItems().add("Tomato Slices");
        listOfNames.getItems().add("Cheese");
        listOfNames.getItems().add("Olives");
        listOfNames.getItems().add("House Mix");
        listOfNames.getItems().add("Strips of Bacon");
        listOfNames.getItems().add("Pieces of Chicken");
        listOfNames.getItems().add("Other...");
        listOfNames.getItems().add("THIN");
        listOfNames.getItems().add("STUFFED");
        listOfNames.getItems().add("THICK");
        listOfNames.getItems().add("AMERICAN");
        listOfNames.getItems().add("DEEP-DISH");
        listOfNames.getItems().add("CHEESEY-BITES");
   }
   
    @FXML
    private TextField name;
    
    @FXML
    void addName()
    {
        listOfNames.getItems().add(name.getText());  
    }
    
    @FXML
    private void btnClickMeBackClicked()
    {
        try 
        {
            MainApp.setRoot("test1", MainApp.menu);
        }
        catch (IOException E) 
        {
            System.out.println("Error 404: Not Found");
        }
    }
    
    @FXML
    private void btnClickShowToppingsClicked()
    {
        try 
        {
            MainApp.setRoot("ShowToppings", MainApp.menu);
        }
        catch (IOException E) 
        {
            System.out.println("Error 404: Not Found");
        }
    }
}
