package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;


class PriceGTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish one, Dish two) {

		return Double.valueOf(two.getPrice()).compareTo(one.getPrice());
	}

}
