/**
 * Program Description: To demonstrate the implementation of instance variables and methods of the class named Flower
 * Programmer: Syfqh
 * Date: 20 February 2024
 */

//import the respective package
import javax.swing.JOptionPane;

//Driver class
public class FlowerShop2
{
    //Driver method
    public static void main (String[] args)
    {
        //Declaration of an array 
        Flower2 [] flowerInv = new Flower2[10];
        
        //Declaration of all variables
        String name, color, str;
        double price;
        int quantity;
        
        for(int i = 0; i < 10; i++)
        {
            name = JOptionPane.showInputDialog("Enter the flower's name : " + (i + 1));
            color = JOptionPane.showInputDialog("Please enter the desired color of the flower");
            str = JOptionPane.showInputDialog("Enter the price of the flower :RM ");
            price =Double.parseDouble(str); //wrap from string to double
            str = JOptionPane.showInputDialog("Enter the desired quantity of the flower : ");
            quantity = Integer.parseInt(str); //wrap from string to integer
            
            //Instantiate each element of the array
            flowerInv[i] = new Flower2();
            
            //Call the mutator method
            flowerInv[i].setFlower(name, color, price, quantity);
            
            //Call the toString method
            System.out.println(flowerInv[i].toString());
        }//end of for
    }
}        
