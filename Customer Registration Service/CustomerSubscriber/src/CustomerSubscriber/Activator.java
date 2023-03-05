package restaurantmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("Eatable - An Online Food Ordering System");
		
		System.out.println("=======================================================");
		
		String line1 = "Customer ID";
		String line2 = " 001";
		String line3 = " 002";
		String line4 = " 003";
		String line5 = " 004";
		String line6 = " 005";
		System.out.format("%-10s %-20s %s   %n", line1, "Menu Item Name", "Price");
		System.out.println("-------------------------------------------------------");
		System.out.format("%-10s %-20s %s %n", line2, "Chinese Fish Soup", "Rs.1390.00");
		System.out.format("%-10s %-20s %s %n", line3, "Chicken Lasagna", "Rs.1200.00");
		System.out.format("%-10s %-20s %s %n", line4, "Pork Single Burger", "Rs.890.00");
		System.out.format("%-10s %-20s %s %n", line5, "Thai Chicken Fried Rice", "Rs.1200.00");
		System.out.format("%-10s %-20s %s %n", line6, "Masala Chicken Kottu", "Rs.1200.00");
		System.out.println("-------------------------------------------------------");

		Scanner object = new Scanner(System.in);

		int menuItemID;

		System.out.println("Enter the employee ID:");
		employeeID = object.nextInt();
		if (menuItemID == 001) {
			System.out.println("How many would you like to order from this Chinese Fish Soup?");
			int itemQuantity = object.nextInt();
			int price = 1390 * itemQuantity;
			System.out.println("Your total price is: Rs." + price + ".00");
		} else if (menuItemID == 002) {
			System.out.println("How many would you like to order from this Chicken Lasagna?");
			int itemQuantity = object.nextInt();
			int price = 1200 * itemQuantity;
			System.out.println("Your total price is: Rs." + price + ".00");
		} else if (menuItemID == 003) {
			System.out.println("How many would you like to order from this Pork Single Burger?");
			int itemQuantity = object.nextInt();
			int price = 890 * itemQuantity;
			System.out.println("Your total price is: Rs." + price + ".00");
		} else if (menuItemID == 004) {
			System.out.println("How many would you like to order from this Thai Chicken Fried Rice?");
			int itemQuantity = object.nextInt();
			int price = 1200 * itemQuantity;
			System.out.println("Your total price is: Rs." + price + ".00");
		} else if (menuItemID == 005) {
			System.out.println("How many would you like to order from this Masala Chicken Kottu?");
			int itemQuantity = object.nextInt();
			int price = 1200 * itemQuantity;
			System.out.println("Your total price is: Rs." + price + ".00");
		}
		while (true) {

			System.out.println("Do you need anything else?(Y/N)");
			String str = object.next();

			if (!str.equalsIgnoreCase("N")) {
				System.out.println("Enter the Menu Item ID:");
				employeeID = object.nextInt();
				if (menuItemID == 001) {
					System.out.println("How many would you like to order from this Chinese Fish Soup?");
					int itemQuantity = object.nextInt();
					int price = 1390 * itemQuantity;
					System.out.println("Your total price is: Rs." + price + ".00");
				} else if (menuItemID == 002) {
					System.out.println("How many would you like to order from this Chicken Lasagna?");
					int itemQuantity = object.nextInt();
					int price = 1200 * itemQuantity;
					System.out.println("Your total price is: Rs." + price + ".00");
				} else if (menuItemID == 003) {
					System.out.println("How many would you like to order from this Pork Single Burger?");
					int itemQuantity = object.nextInt();
					int price = 890 * itemQuantity;
					System.out.println("Your total price is: Rs." + price + ".00");
				} else if (menuItemID == 004) {
					System.out.println("How many would you like to order from this Thai Chicken Fried Rice?");
					int itemQuantity = object.nextInt();
					int price = 1200 * itemQuantity;
					System.out.println("Your total price is: Rs." + price + ".00");
				} else if (menuItemID == 005) {
					System.out.println("How many would you like to order from this Masala Chicken Kottu?");
					int itemQuantity = object.nextInt();
					int price = 1200 * itemQuantity;
					System.out.println("Your total price is: Rs." + price + ".00");
				}
			} else {
				System.out.println("Thanks for ordering with us!");
				break;
			}

		}

	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye!!!");
		context.ungetService(serviceReference);
	}

}
