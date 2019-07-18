package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;


class PriceLTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish one, Dish two) {

		return Double.valueOf(one.getPrice()).compareTo(two.getPrice());
	}

}
