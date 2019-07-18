package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;


public class PublicComparators {
	public enum Comparator_Type {
		CaloriesLTComparator, CaloriesGTComparator, PriceLTComparator, PriceGTComparator

	}

	public static Comparator<Dish> getComparators(Comparator_Type comp_type) {

		switch (comp_type) {
		case CaloriesLTComparator:
			return new CaloriesLTComparator();
		case CaloriesGTComparator:
			return new CaloriesGTComparator();
		case PriceLTComparator:
			return new PriceLTComparator();
		case PriceGTComparator:
			return new PriceGTComparator();
		default:
			return new PriceLTComparator();
		}
	}


}
