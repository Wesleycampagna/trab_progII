package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class BubbleSort extends AbstractSort{
	private int compara1;
	private int troca1;	
	
	@Override
	public void sort(Integer[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length-1; j++) {
				compara1++;
				if (v[j] > v[j+1]){					
					swap(v, j, j+1);
					troca1++;
				}
			}
		}
	}

	public int getCompara() {
		return compara1;
	}

	public int getTroca() {
		return troca1;
	}
}
