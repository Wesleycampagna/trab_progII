package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class InsertionSort extends AbstractSort {
	private int compara3 = 0;
	private int troca3 = 0;

	public void sort(Integer v[]) {
		for (int i = 1; i < v.length; i++) {
			int j = i;			
			while (j > 0 && v[j] < v[j - 1]) {				
				swap(v,j - 1, j);
				j--;
				troca3++;
				compara3++;
			}
			compara3++;					//ele compara uma ultima vez que não é feita a troca por n ser menor
		}
	}

	public int getCompara() {
		return compara3;
	}
	
	public int getTroca() {
		return troca3;
	}
}
