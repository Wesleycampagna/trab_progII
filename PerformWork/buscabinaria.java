package PerformWork;

public class buscabinaria {
	public Integer busca(Integer[] array, Integer chave) {
		return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
	}

	private Integer buscaBinariaRecursiva(Integer[] array, Integer menor, Integer maior, Integer chave) {
		Integer media = (maior + menor) / 2;
		Integer valorMeio = array[media];

		if (menor.compareTo(maior) == 1)
			return -1;
		else if (valorMeio.equals(chave))
			return media;
		else if (valorMeio.compareTo(chave) == -1)
			return buscaBinariaRecursiva(array, media + 1, maior, chave);
		else
			return buscaBinariaRecursiva(array, menor, media - 1, chave);
	}
}
