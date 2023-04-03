package ru.netology;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

	protected Random random;

	List<Integer> list = new ArrayList<>();

	for (Integer item : list) {
		System.out.println(item);
	}

	public Randoms(int min, int max) {
		while(true) {
			list.add(getRandInt(min, max));
		}
	}


	public int getRandInt(int l, int r) {
		int diff = r - l;
		Random rnd = new Random();
		return rnd.nextInt(diff + 1) + l;
	}

}
