package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class SelectionSort extends AbstractSort {
	private int compara5 = 0;
	private int troca5 = 0;

	public void sort(Integer [] v) {
		Integer i, j, min;
		for (i = 0; i < v.length - 1; i++) {
			min = i;
			for (j = i + 1; j < v.length; j++) {
				compara5++;
				if (v[j] < v[min])
					min = j;
			}
			swap(v, i, min);
			troca5++;
		}
	}

	public int getCompara() {
		return compara5;
	}

	public int getTroca() {
		return troca5;
	}
}
