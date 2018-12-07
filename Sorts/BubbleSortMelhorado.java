package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class BubbleSortMelhorado extends AbstractSort{
	private int troca2;
	private int compara2;
	boolean confirma = false;

	public void sort(Integer[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - 1 - i; j++) {
				compara2++;
				if (v[j] > v[j + 1]) {
					swap(v, j, j + 1);
					confirma = false;
					troca2++;
				}
			}
			if (confirma == true)
				break;
			confirma = false;
		}

	}

	public int getTroca() {
		return troca2;
	}
	
	public int getCompara() {
		return compara2;
	}
}
