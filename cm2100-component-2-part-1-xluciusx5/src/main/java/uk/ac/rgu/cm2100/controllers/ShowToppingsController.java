/*
* ShowToppingsController.java, edited/created by Lucian Petrus
* Component 2 Part 1 - 07/01/2022
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uk.ac.rgu.cm2100.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import uk.ac.rgu.cm2100.MainApp;
import uk.ac.rgu.cm2100.model.PizzaTopping;
import uk.ac.rgu.cm2100.model.managers.MenuManager;

/**
 * FXML Controller class
 *
 * @author Lucian
 */
public class ShowToppingsController extends Controller <MenuManager> implements Initializable 
{    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button btnClickMeBack;
    
    @FXML
    private Button btnClickAddTopping;
    
    @FXML
    private ListView lstShowToppings;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
    @Override
    public void setModel(MenuManager model)
    {
        this.model=model;
        List<PizzaTopping> existingPizzaToppingP= this.model.getToppings();
        lstShowToppings.setItems(FXCollections.observableArrayList(existingPizzaToppingP));    
    }
    
    @FXML
    private void btnClickAddToppingClicked()
    {
        try 
        {
            MainApp.setRoot("AddToppingsPage", MainApp.menu);
        }
        catch (IOException E) 
        {
            System.out.println("Error 404: Not Found");
        }
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
    
}
