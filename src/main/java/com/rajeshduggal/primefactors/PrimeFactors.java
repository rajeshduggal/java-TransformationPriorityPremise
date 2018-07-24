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
			int divisor = 2;
			while (n > 1) {
				while (n % divisor == 0) {
					factors.add(divisor);
					n /= divisor;
				}
				divisor++;
			}
		}
		if (n > 1)
			factors.add(n);

		return factors;
	}
}