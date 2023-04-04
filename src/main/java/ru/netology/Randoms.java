package ru.netology;

public class Randoms implements Iterable<Integer> {

	private int min;
	private int max;

	public Randoms(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public RandomsIterator iterator() {
		return new RandomsIterator(min, max);
	}
}
