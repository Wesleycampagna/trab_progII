package Sorts;

public class MergeSort{
	private int copia6 = 0;
	private int compara6 = 0;

	public int getCopia() {
		return copia6;
	}

	public int getCompara() {
		return compara6;
	}

	public void sort(Integer[] v, Integer i, Integer j) {
		int middle = 0;
		if (i < j) {
			middle = (i + j) / 2;
			sort(v, i, middle);
			sort(v, middle + 1, j);
		}
		merge(v, i, middle, j);
	}

	private void merge(Integer[] v, Integer start, Integer middle, Integer end) {
		int i, j, k;
		int[] b = new int[v.length];
		for (i = start; i <= end; i++) {			
			b[i] = v[i];
		}
		i = start;
		j = middle + 1;
		k = start;

		while (i <= middle && j <= end) {
			compara6++;
			if (b[i] <= b[j]) 
				v[k++] = b[i++];				
			 else {
				v[k++] = b[j++];
			}
			copia6++;
		}

		while (i <= middle) {
			v[k++] = b[i++];
			copia6++;			
		}
	}
}
