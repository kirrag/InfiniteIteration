package ru.netology;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

	//public static int getRandInt(int l, int r) {
	//	int diff = r - l;
	//	Random rnd = new Random();
	//	return rnd.nextInt(diff + 1) + l;
	//}

	//protected Random random = new Random();


	protected Random random = new Random();
	List<Integer> randoms = new ArrayList<>();

	public Randoms(int min, int max) {
		randoms.add(random);
	}


	}


}
