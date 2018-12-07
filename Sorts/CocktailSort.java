package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class CocktailSort extends AbstractSort {
	private int troca8;
	private int compara8;

	@Override
	public void sort(Integer[] v) {
		Integer i, 
				   inicio, 
				   fim, 
				   sw;
		
		inicio = 0;
		fim = v.length - 1;
		sw = 0;

		while (sw == 0 && inicio < fim) {
			sw = 1;
			for (i = inicio; i < fim; i++) {
				compara8++;
				if (v[i] > v[i + 1]) {
					troca8++;
					swap(v, i, i+1);
					sw = 0;
				}
			}
			fim = fim - 1;
			for (i = fim; i > inicio; i--) {
				compara8++;
				if (v[i] < v[i - 1]) {
					troca8++;
					swap(v, i, i-1);
					sw = 0;
				}
			}
			inicio = inicio + 1;
		}
	}

	public int getTroca() {
		return troca8;
	}

	public int getCompara() {
		return compara8;
	}
}
