package com.bawarchi.model;

import java.util.Objects;

public class Dish implements Comparable<Dish>{
	private int id;
	private String name;
	private double calories;
	private double price;
	
	public Dish(int id, String name,double calories, double price) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static Dish getDish(int id) {
      
        return null;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.price, this.calories);
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o.getClass() != Dish.class) {
			return false;
		}
		Dish other = (Dish) o;
		return Objects.equals(this.id, other.id);
	}
	
	
	@Override
	public String toString() {
		return "Dish Id: "+ id +", name: "+ name + ", Price: " + price + ", Calories: " + calories +"\n"; 
	}
	

	@Override
	public int compareTo(Dish o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
