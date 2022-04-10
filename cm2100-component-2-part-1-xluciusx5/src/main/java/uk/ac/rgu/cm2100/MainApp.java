/*
* MainApp.java, edited/created by Lucian Petrus
* Component 2 Part 1 - 07/01/2022
*/
package uk.ac.rgu.cm2100;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import uk.ac.rgu.cm2100.controllers.Controller;
import uk.ac.rgu.cm2100.controllers.MenuController;
import uk.ac.rgu.cm2100.model.Crust;
import uk.ac.rgu.cm2100.model.Drink;
import uk.ac.rgu.cm2100.model.IMenuItem;
import uk.ac.rgu.cm2100.model.managers.MenuManager;
import uk.ac.rgu.cm2100.model.Model;
import uk.ac.rgu.cm2100.model.Order;
import uk.ac.rgu.cm2100.model.Pizza;
import uk.ac.rgu.cm2100.model.PizzaTopping;
import uk.ac.rgu.cm2100.model.Side;
import uk.ac.rgu.cm2100.model.managers.OrderManager;

/**
 * JavaFX MainApp
 */
public class MainApp extends Application 
{

    /* These static models can be used across different views while persisting data */
    public static final MenuManager menu = new MenuManager();
    public static final OrderManager orderManager = new OrderManager();

    /* The scene that is currently displayed */
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
      //menu items
        Pizza existingPizzaP= new Pizza("Pizza Quattro Stagioni", Crust.THICK);
        PizzaTopping existingPizzaToppingP= new PizzaTopping("Pineapple", (int) 2.5);
        menu.addItem(existingPizzaP);
        Pizza existingPizzaP1= new Pizza("Pizza Quattro Formagi", Crust.THIN);
        PizzaTopping existingPizzaToppingP1= new PizzaTopping("Mushroom", (int) 1.5);
        menu.addItem(existingPizzaP1);
        Pizza existingPizzaP2= new Pizza("Pizza Margherita", Crust.STUFFED);
        PizzaTopping existingPizzaToppingP2= new PizzaTopping("Corn", 2);
        menu.addItem(existingPizzaP2);
        Pizza existingPizzaP3= new Pizza("Pizza Venezia", Crust.THICK);
        PizzaTopping existingPizzaToppingP3= new PizzaTopping("Cheddar", (int) 1.5);
        menu.addItem(existingPizzaP3);
        Pizza existingPizzaP4= new Pizza("Pizza Pollo", Crust.THICK);
        PizzaTopping existingPizzaToppingP4= new PizzaTopping("Herbs", (int) 1.5);
        menu.addItem(existingPizzaP4);
       
        Drink existingDrinkP = new Drink("Coca Cola" , 7);
        menu.addItem(existingDrinkP);
        Drink existingDrinkP1 = new Drink("Fanta" , 7);
        menu.addItem(existingDrinkP1);
        Drink existingDrinkP2 = new Drink("Sprite" , 7);
        menu.addItem(existingDrinkP2);
        Drink existingDrinkP3 = new Drink("Tap Water" , 7);
        menu.addItem(existingDrinkP3);
        Drink existingDrinkP4 = new Drink("Sparkling Water" , 7);
        menu.addItem(existingDrinkP4);
        Drink existingDrinkP5 = new Drink("Guinness" , 7);
        menu.addItem(existingDrinkP5);
        Drink existingDrinkP6 = new Drink("Red Wine" , 7);
        menu.addItem(existingDrinkP6);
        Drink existingDrinkP7 = new Drink("White Wine" , 7);
        menu.addItem(existingDrinkP7);
        
        Side existingSideP= new Side("Chips", (int) 7.99);
        menu.addItem(existingSideP);
        Side existingSideP1= new Side("Croissant", (int) 4.99);
        menu.addItem(existingSideP1);
        Side existingSideP2= new Side("Fries", (int) 6.5);
        menu.addItem(existingSideP2);
        Side existingSideP3= new Side("Rice", (int) 5.5);
        menu.addItem(existingSideP3);
        Side existingSideP4= new Side("Cheese Sticks", (int) 4.8);
        menu.addItem(existingSideP4);
        Side existingSideP5= new Side("Crispy Strips", (int) 12.5);
        menu.addItem(existingSideP5);
        Side existingSideP6= new Side("Fillet Bites", (int) 9.5);
        menu.addItem(existingSideP6);
        
        //add menu items     
        PizzaTopping existingPizzaToppingZ= new PizzaTopping("Pineapple", (int) 1.5);
        PizzaTopping existingPizzaToppingZ1= new PizzaTopping("Dill", (int) 1.5);
        PizzaTopping existingPizzaToppingZ2= new PizzaTopping("Bell Peppers", (int) 3);
        PizzaTopping existingPizzaToppingZ3= new PizzaTopping("Fresh Herbs", 2);
        PizzaTopping existingPizzaToppingZ4= new PizzaTopping("Olives", 3);
        PizzaTopping existingPizzaToppingZ5= new PizzaTopping("Onions", 4);
        PizzaTopping existingPizzaToppingZ6= new PizzaTopping("Bacon Strips", 4);
               
        //toppings
        menu.addTopping(existingPizzaToppingP);
        menu.addTopping(existingPizzaToppingP2);
        menu.addTopping(existingPizzaToppingP3);
        menu.addTopping(existingPizzaToppingP4);
        menu.addTopping(existingPizzaToppingZ1);
        menu.addTopping(existingPizzaToppingZ2);
        menu.addTopping(existingPizzaToppingZ3);
        menu.addTopping(existingPizzaToppingZ4);
        menu.addTopping(existingPizzaToppingZ5);
        menu.addTopping(existingPizzaToppingZ6);
                
        //order items
        Order existingOrder= new Order();
        Order existingOrder2= new Order();
        Order existingOrder3= new Order();
        Order existingOrder4= new Order();
        
        Pizza existingPizza= new Pizza("Pizza Quattro Stagioni", Crust.THICK);
        PizzaTopping existingPizzaTopping= new PizzaTopping("Pineapple", (int) 1.5);
        Drink existingDrink = new Drink("Red Wine" , 7);
        Side existingSide= new Side("Caesar Salad", (int) 10.5);  
        existingPizza.addToppings(existingPizzaTopping);
        existingOrder.addItem(existingPizza);
        existingOrder.addItem(existingDrink);
        existingOrder.addItem(existingSide);
                
        Pizza existingPizza2= new Pizza("Pizza Quattro Formagi", Crust.STUFFED);
        PizzaTopping existingPizzaTopping2= new PizzaTopping("Corn", (int) 3.5);
        Drink existingDrink2 = new Drink("Sprite" , 3);
        Side existingSide2= new Side("Chips", (int) 8);       
        existingPizza2.addToppings(existingPizzaTopping2);
        existingOrder2.addItem(existingPizza2);
        existingOrder2.addItem(existingDrink2);
        existingOrder2.addItem(existingSide2);
               
        Pizza existingPizza3= new Pizza("Pizza Margherita", Crust.THIN);
        PizzaTopping existingPizzaTopping3= new PizzaTopping("Extra Mozzarella", (int) 5.5);
        Drink existingDrink3 = new Drink("Sparkling Water" , (int) 2.5);
        Side existingSide3= new Side("Cheese Sticks (No Garlic)", (int) 8); 
        existingPizza.addToppings(existingPizzaTopping3);
        existingOrder3.addItem(existingPizza3);
        existingOrder3.addItem(existingDrink3);
        existingOrder3.addItem(existingSide3);
               
        Pizza existingPizza4= new Pizza("Pizza Venezia", Crust.THICK);
        PizzaTopping existingPizzaTopping4= new PizzaTopping("Chicken", (int) 8.5);
        Drink existingDrink4 = new Drink("Coca Cola" , (int) 2.5);
        Side existingSide4= new Side("French Fries with Grated Cheese", (int) 9.5);       
        existingPizza.addToppings(existingPizzaTopping4);
        existingOrder4.addItem(existingPizza4);
        existingOrder4.addItem(existingDrink4);
        existingOrder4.addItem(existingSide4);
        
        
        orderManager.addOrder(existingOrder);
        orderManager.addOrder(existingOrder2);
        orderManager.addOrder(existingOrder3);
        orderManager.addOrder(existingOrder4);
              
        scene = new Scene(loadFXML("test1", menu), 640, 480);
        scene.getStylesheets().add("styles/default.css"); //loads a default stylesheet - helps fix some character encoding issues on some platforms...

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Sets the root of the scene using the given fxml file and model
     *
     * @param fxml
     * @param model
     * @throws IOException
     */
    public static void setRoot(String fxml, Model model) throws IOException 
    {
        
        /* quick hack to strip the .fxml extension if provided by mistake */
        if(fxml.endsWith(".fxml"))
        {
            fxml = fxml.split(".")[0];
        }
  
        scene.setRoot(loadFXML(fxml, model));
    }

    /**
     * Loads the given fxml file and sets the given model in the controller
     *
     * @param fxml
     * @param model
     * @return
     * @throws IOException
     */
    private static Parent loadFXML(String fxml, Model model) throws IOException 
    {

        /* Create the FXMLLoader and load the given fxml file */
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));

        /* Load the fxml into a parent */
        Parent parent = fxmlLoader.load();

        /* Get the controller and set the model */
        Controller controller = fxmlLoader.getController();
        controller.setModel(model);

        /* Return the parent */
        return parent;
    }

    public static void main(String[] args) 
    {
        launch();
    }

}
