package com.bawarchi.client;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.bawarchi.comparators.PublicComparators;
import com.bawarchi.model.Dish;

public class Restaurant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List <Dish> dishes = new ArrayList<>();
		List <Dish> order_items = new ArrayList<>();
		String name;
		double payment;
		double price = 0.0;
		
		Dish dish1 = new Dish(1, "Dosa", 300, 50.00);
		dishes.add(dish1);
		Dish dish2 = new Dish(2, "Idli-Vada", 200, 40.00);
		dishes.add(dish2);
		Dish dish3 = new Dish(3, "Pulav", 330, 80.00);
		dishes.add(dish3);
		Dish dish4 = new Dish(4, "Roti-Curry", 250, 100.00);
		dishes.add(dish4);
		Dish dish5 = new Dish(5, "Neer-Dosa", 100, 50.00);
		dishes.add(dish5);
		
		System.out.println(
				"=================Welcome=====================\n" + "Please choose from the below options\n");
		boolean loop_dishes = true;
		Dish dish = null;
		while(loop_dishes) {
			System.out.println(""
					+ "   1 => To sort the dishes in the increasing order of calories\r\n"
					+ "   2 => To sort the dishes in the decreasing order of calories\r\n"
					+ "   3 => To sort the dishes in the increasing order of price\r\n"
					+ "   4 => To sort the dishes in the decreasing order of price\r\n");
			System.out.println("===============================================\n");
			int sorting_type = scanner.nextInt();
			scanner.nextLine();
			switch(sorting_type) {
			case 1: {
				 Collections.sort(dishes,
				 PublicComparators.getComparators(PublicComparators.Comparator_Type.CaloriesLTComparator));
				 System.out.println("   =================Please select the Dish Id and hit enter===============================\r\n");
				 System.out.println(dishes);

			}
				break;
			case 2: {
			
				 Collections.sort(dishes,
				 PublicComparators.getComparators(PublicComparators.Comparator_Type.CaloriesGTComparator));
				 System.out.println("   =================Please select the Dish Id and hit enter===============================\r\n");
				 System.out.println(dishes);
			}
				break;
			case 3: {
				 Collections.sort(dishes,
				 PublicComparators.getComparators(PublicComparators.Comparator_Type.PriceLTComparator));
				 System.out.println("   =================Please select the Dish Id and hit enter===============================\r\n");
				 System.out.println(dishes);
			}
				break;
			case 4: {
				 Collections.sort(dishes,
				 PublicComparators.getComparators(PublicComparators.Comparator_Type.PriceGTComparator));
				 System.out.println("   =================Please select the Dish Id and hit enter===============================\r\n");
				 System.out.println(dishes);
			}
				break;
			default:
				System.out.println("Choose correct option from the list!\n");
				break;
			}


			int dishid = scanner.nextInt();
			scanner.nextLine();
			  Iterator<Dish> iterator = dishes.iterator();
		        while(iterator.hasNext()) {
		        	Dish dish_details = iterator.next();
		        	if(dish_details.getId() == dishid) {
		        		dish = dish_details;
		        	}
		        }
			System.out.println("\n    ==========You have selected "+dish.getName() + "=====================\r\n");
			
			System.out.println("Do you want to order more ?\n 1. YES 2. NO\n");
			int user_option = scanner.nextInt();
			scanner.nextLine();
			if(user_option == 1) {
				order_items.add(dish);
			}
			else
				loop_dishes = false;
			
		}
		
		
		System.out.println("Please Enter your name : \n");
		name = scanner.nextLine();
		Iterator<Dish> order_iterator = order_items.iterator();
        while(order_iterator.hasNext()) {
        	Dish order = order_iterator.next();
			System.out.println("    ========Your Order Summary================\r\n");
			System.out.println(order);
        	price += order.getPrice();
        }
		
		
		System.out.println(name+" Please pay the bill of Rs "+price+"\r\n");
		
		payment = scanner.nextDouble();
		scanner.nextLine();
		
		if(payment > price) {
			System.out.println("    ========Thanks for your order. Please collect the change = Rs "+ (payment - price) + "================\r\n");
		}
		else if(payment <price) {
			System.out.println("    ========Amount paid is less than Bill Amount ================\r\n");
		}
		if(payment == price) {
			System.out.println("    ========Thanks for your order.================\r\n");
		}
	
		scanner.close();
	}

}
