package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dish;


class CaloriesGTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish one, Dish two) {

		return Double.valueOf(two.getCalories()).compareTo(one.getCalories());
	}

}
