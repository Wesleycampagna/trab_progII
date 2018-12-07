package Sorts;

import InterfacesAndAbstractions.AbstractSort;

public class InsertionSortOtimizado extends AbstractSort {
	private int compara4;
	private int troca4;
	
	private Integer binSearch ( Integer[] x, Integer n, Integer val){  
		Integer 	lo = 0, 
					hi = n-1;

	      while (lo < hi) {
	    	 Integer mid = (lo + hi) / 2;
	         if (val > x[mid]){  
	            lo = mid + 1;
	            compara4++;
	         }else
	            hi = mid;
	      } // end while	      
	      if ( hi < (n-1) || val <= x[hi]){ 
	    	compara4++;
	         return hi;                        	 // Within the array
	      }
	      else
	         return n;                          // Belongs at the VERY end
	   } // end binSearch()
	
	public void sort ( Integer[] x) {  
		Integer  lim,    // start of unsorted region
					hole;   // insertion point in sorted region

	      for ( lim = 1 ; lim < x.length ; lim++ ){  
	    	  	Integer save = x[lim];
	    	  	
	         hole = binSearch ( x, lim, save );
	         System.arraycopy(x, hole, x, hole+1, lim-hole);
	         troca4++;	        
	         x[hole] = save;
	      } // end for
	   }

	public int getCompara() {
		return compara4;
	}

	public int getTroca() {
		return troca4;
	}
}
