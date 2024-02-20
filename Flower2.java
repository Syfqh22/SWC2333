/**
 * Program Description: To define the attributes and behaviours of the Flower class
 * Programmer: Syfqh
 * Date: 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

//Class Definition
public class Flower2
{
    //Declaration of the instance variables
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    //Constructor without param
    public Flower2()
    {
        name = null; //can also use name = ""; to indicate empty String
        color = null;
        price = 0.0;
        quantity = 0;
    }//end of constructor
    
    //Constructor with param
    public Flower2(String name, String color, double price, int quantity)
    {
        this.name = name; //left side always refer to instant variables
        this.color = color;
        this.price = price;
        this.quantity = quantity;//put this. if the name is the same
    }//end of constructor
    
    //Accessor/Retriever/Getter
    public String getName()
    {
        return name;
    }//end of accessor
    
    public String getColor()
    {
        return color;
    }//end of accessor
    
    public double getPrice()
    {
        return price;   
    }//end of accessor
    
    public int getQuantity()
    {
        return quantity;
    }
    
    //Mutator for all data members;
    public void setFlower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }//end of mutator
    
    //toString method
    public String toString()
    {
        return ("Flower's name = " + name +
                "\nThe color of the flower = " + color +
                "\nPrice = " + price +
                "\nQuantity of the flower = " + quantity);
    }//end of toString
}//end of class
