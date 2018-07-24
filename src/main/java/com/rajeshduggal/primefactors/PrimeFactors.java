package com.rajeshduggal.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Hullo!");
	}

	public static List<Integer> of(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		if (n > 1) {
			if (n % 2 == 0) {
				factors.add(2);
				n /= 2;
			}
		}
		if (n > 1)
			factors.add(n);

		return factors;
	}
}