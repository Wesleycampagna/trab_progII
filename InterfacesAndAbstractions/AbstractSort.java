package InterfacesAndAbstractions;

public abstract class AbstractSort implements InterfaceSort{

	@Override
	public abstract void sort(Integer [] v) ;

	@Override
	public void swap(Integer[] v, Integer p, Integer p2) {		
			int aux;
			aux = v[p];
			v[p] = v[p2];
			v[p2] = aux;
	}
}

