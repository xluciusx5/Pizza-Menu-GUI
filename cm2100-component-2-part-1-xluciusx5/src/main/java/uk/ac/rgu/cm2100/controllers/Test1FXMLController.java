/*
* Test1FXMLController.java, edited/created by Lucian Petrus
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
import javafx.scene.control.Label;
import uk.ac.rgu.cm2100.MainApp;
import uk.ac.rgu.cm2100.model.managers.MenuManager;

/**
 * FXML Controller class
 *
 * @author Lucian
 */
public class Test1FXMLController extends Controller<MenuManager> implements Initializable 
{

    @FXML
    private Button btnClickMe1;
    
    @FXML
    private Button btnClickMe2;
    
    @FXML
    private Label lblMessage1;
    
    @FXML
    private Label lblMessage2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
    @FXML
    private void btnClickMe1Clicked()
    {
        try {
            MainApp.setRoot("order" , MainApp.orderManager);

        }
        catch (IOException E) {
            System.out.println("Error 404: Not Found");
        }
    }
    
    @FXML
    private void btnClickMe2Clicked()
    {
        try {
            MainApp.setRoot("menu" , MainApp.menu);

        }
        catch (IOException E) {
            System.out.println("Error 404: Not Found");
        }
    }

    @Override
    public void setModel(MenuManager model) 
    { 
        this.model=model;
    }
    
    
    
}
