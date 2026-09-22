import java.util.Scanner;

public class ShipCostCalculator {
    void main()
    {
        Scanner in = new Scanner(System.in);

        double shipCosts = 0;
        double itemPrice = 0;
        double totalCost = 0;
        String trash = "";

        // Get the item price from the user

        IO.print("Enter your item price: ");

        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble(); // Read the value
            in.nextLine(); // Clear the newline from the key buffer
        }
        else
        {
            trash = in.nextLine();
            IO.println("You must enter a valid number not " + trash);
            IO.println("Rerun the program and try again!");
            System.exit(0);
        }

        // We got correct input so now use it

        if(itemPrice >= 100)
        {
            shipCosts = 0;
            totalCost = itemPrice;
        }
        else
        {
            shipCosts = itemPrice * .02;
            totalCost = itemPrice + shipCosts;
        }

        // Display results
        IO.println("The shipping costs are " + shipCosts);
        IO.println("The total cost is " + totalCost);
    }
}
