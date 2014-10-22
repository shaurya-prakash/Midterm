/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author Shaurya Prakash
 * @version Wednesday, October 22, 2014
 */
import java.util.Scanner;

public class PizzaPalace {
  public static void main(String[] args) {
    
    Scanner scnr = new Scanner(System.in);
    
    double pizzasToPurchase = 0.0;
    
    System.out.println("Enter the number of people to be fed");
    int numPeople = scnr.nextInt();
    System.out.println("Enter the number of slices allowed for each person");
    double slicesAllowed = scnr.nextDouble();
    System.out.println("Enter the number of slices in each whole pie");
    double pieSlices = scnr.nextDouble();
    pizzasToPurchase = Math.ceil((numPeople * slicesAllowed) / (pieSlices));
    System.out.println("Purchase " + pizzasToPurchase + " pizzas.");

	}

}
