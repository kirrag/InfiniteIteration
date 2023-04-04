package ru.netology;

import java.util.Iterator;
import java.util.Random;

class RandomsIterator implements Iterator<Integer> {

	private int min = 0;
	private int max = 0;

	private static int getRandInt(int min, int max) {
		int diff = max - min;
		Random rnd = new Random();
		return rnd.nextInt(diff + 1) + min;
	}

	public RandomsIterator(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		return getRandInt(min, max);
	}
}
