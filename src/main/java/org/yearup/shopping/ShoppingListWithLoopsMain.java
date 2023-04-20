package org.yearup.shopping;

import java.util.Scanner;
public class ShoppingListWithLoopsMain {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        while (true) {
            // Invite the user to buy something
            boolean done = false;
            Item selectedItem;
            do {
                System.out.println("Welcome these are the items we have: ");
                // Show the user a list of items for sale
                // Only show the product names and IDs, not the prices
                Item[] itemsForSale = ItemsForSale.itemsForSale;
                for (Item i : itemsForSale) {
                    if (!i.isInStock()) continue;
                    System.out.println(i.getProductID() + " " + i.getDescription());
                }
                System.out.println("Choose one of the items (provide first 4 digits): ");
                // Read in the user's response
                String selectedProductId = consoleInput.nextLine();
                // Parse their choice and get that item from the list

                selectedItem = null;

                for (Item currentItemInListInTheLoop : itemsForSale) {
                    if (selectedProductId.equals(currentItemInListInTheLoop.getProductID())) {
                        selectedItem = currentItemInListInTheLoop;
                        done = true;
                        break;
                    }
                }
            } while (!done);
            System.out.println("The price of this item is: " + " $" + selectedItem.getPrice());
            System.out.println("Do you accept this price (yes/no)");
            String yesOrNO = consoleInput.nextLine();

            if (yesOrNO.equals("yes")) {
                System.out.println("The item is yours, enjoy ");
                break;
            } else if (yesOrNO.equals("no")) {
                System.out.println("Take a look at our others available items ");
            }

            // Tell the user they can have it for a price!
            // show them the price and ask them to accept it

            // Read their response
            //   if yes, tell them it's theirs
            //   if no, start over and show them the list again
        }
    }
}