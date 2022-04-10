/*
* OrderController.java, edited/created by Lucian Petrus
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import uk.ac.rgu.cm2100.MainApp;
import uk.ac.rgu.cm2100.model.Order;
import uk.ac.rgu.cm2100.model.managers.OrderManager;

/**
 * FXML Controller class
 *
 * @author Lucian
 */
public class OrderController extends Controller <OrderManager>  implements Initializable 
{

    @FXML
    private Button btnClickMeBack;
    
    @FXML
    private Label lblDescription;
    
    @FXML
    private ListView lstExistingOrders;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @Override
    public void setModel(OrderManager model)
    {
        this.model= model;   
         List<Order> order = this.model.getOrders();
           lstExistingOrders.setItems(FXCollections.observableArrayList(order));
        
         //To change body of generated methods, choose Tools | Templates.
    }
    
    @FXML
    private void lstOrderDescription()
    {
        Order selected = (Order) this.lstExistingOrders.getSelectionModel().getSelectedItem();
        this.lblDescription.setText(selected.toString());
    }
            
    @FXML
    private void ClickOrderCreation() throws IOException
    {
         MainApp.setRoot("OrderCreation", MainApp.menu);
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
