package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;


class CaloriesLTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish one, Dish two) {

		return Double.valueOf(one.getCalories()).compareTo(two.getCalories());
	}

}
