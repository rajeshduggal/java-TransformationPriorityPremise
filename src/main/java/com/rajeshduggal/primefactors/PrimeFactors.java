package com.rajeshduggal.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Hullo!");
	}

	public static List<Integer> of(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();

		for (int divisor = 2; n > 1; divisor++) {
			for (; n % divisor == 0; n /= divisor) {
				factors.add(divisor);
			}
		}
		return factors;
	}
}