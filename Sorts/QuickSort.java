package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class QuickSort extends AbstractSort{
	private int troca7 = 0;
	private int compara7 = 0;

	public void quickSort(Integer[] v, Integer init, Integer end) {
		Integer pivot;
		if (init < end) {
			pivot = partition(v, init, end);
			quickSort(v, init, pivot - 1);
			quickSort(v, pivot, end);
		}
	}

	private int partition(Integer[] v, Integer init, Integer end) {
		Integer i = init;
		Integer j = end;
		Integer pivot = v[(init + end) / 2];

		while (i <= j) {
			while (v[i] < pivot) {
				i++;
				compara7++;
			}
			while (v[j] > pivot) {
				j--;
				compara7++;
			}
			if (i <= j) {
				swap(v, i++, j--);
				troca7++;				
			}
		}
		return i;
	}

	public int getTroca() {
		return troca7;
	}

	public int getCompara() {
		return compara7;
	}

	@Override
	public void sort(Integer[] v) {
		// TODO Auto-generated method stub		
	}

}
