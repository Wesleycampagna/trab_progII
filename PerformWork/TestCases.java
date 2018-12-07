package PerformWork;

import Sorts.BubbleSort;
import Sorts.BubbleSortMelhorado;
import Sorts.CocktailSort;
import Sorts.InsertionSort;
import Sorts.InsertionSortOtimizado;
import Sorts.MergeSort;
import Sorts.QuickSort;
import Sorts.SelectionSort;

public class TestCases {

	// ===========================================
	// instancias
	// ===========================================
	BubbleSort bubblenormal = new BubbleSort();
	BubbleSortMelhorado bubbleOptimizado = new BubbleSortMelhorado();
	InsertionSort insert = new InsertionSort();
	InsertionSortOtimizado insertOp = new InsertionSortOtimizado();
	SelectionSort select = new SelectionSort();
	MergeSort merge = new MergeSort();
	QuickSort quick = new QuickSort();
	CocktailSort cock = new CocktailSort();

	BuscaSequencial bs = new BuscaSequencial();
	buscabinaria bb = new buscabinaria();
	// =================variaveis ==================
	Long begining;
	Long end;
	Long difference;
	// ===========================================

	public void calcula(Integer vTodo[], Integer vCem[]) { // o numero do ultimo parametro serve pra verificação. Ele seleciona qual ordenação chamar.
		CalcularTempo(vTodo, vCem, "BubbleSort", 1);
		CalcularTempo(vTodo, vCem, "BubbleSortOtimizado", 2);
		CalcularTempo(vTodo, vCem, "InsertionSort", 3);
		CalcularTempo(vTodo, vCem, "InsertionSortOtimizado", 4);
		CalcularTempo(vTodo, vCem, "SelectionSort", 5);
		CalcularTempo(vTodo, vCem, "MergeSort", 6);
		CalcularTempo(vTodo, vCem, "QuickSort", 7);
		CalcularTempo(vTodo, vCem, "CocktailSort", 8);
	}

	private void CalcularTempo(Integer vTodo[], Integer vCem[], String sortName, int caso) {
		int troca = 0;
		int compara = 0;
		System.out.println("\n\t\t\t\t===" + sortName + "===\n");
		Integer[] vAux = new Integer[vTodo.length];
		for (int i = 0; i < vTodo.length; i++) {
			vAux[i] = vTodo[i];
		}
		System.out.println("-------------------Busca Sequencial ----------------------");
		begining = System.nanoTime();
		bs.sequencial(vTodo, vCem);
		end = System.nanoTime();
		difference = end - begining;
		System.out.println("Tempo total da Busca Sequencial: " + difference);
		System.out.println("-------------------ordenação + busca binaria----------------");
		begining = System.nanoTime();
		if (caso == 1) {
			bubblenormal.sort(vAux);
			troca = bubblenormal.getTroca();
			compara = bubblenormal.getCompara();
		}
		if (caso == 2) {
			bubbleOptimizado.sort(vAux);
			troca = bubbleOptimizado.getTroca();
			compara = bubbleOptimizado.getCompara();
		}
		if (caso == 3) {
			insert.sort(vAux);
			troca = insert.getTroca();
			compara = insert.getCompara();
		}
		if (caso == 4) {
			insertOp.sort(vAux);
			troca = insertOp.getTroca();
			compara = insertOp.getCompara();
		}
		if (caso == 5) {
			select.sort(vAux);
			troca = select.getTroca();
			compara = select.getCompara();
		}
		if (caso == 6) {
			merge.sort(vAux, 0, vAux.length - 1);
			troca = merge.getCopia();
			compara = merge.getCompara();
		}
		if (caso == 7) {
			quick.quickSort(vAux, 0, vAux.length - 1);
			troca = quick.getTroca();
			compara = quick.getCompara();
		}
		if (caso == 8) {
			cock.sort(vAux);
			troca = cock.getTroca();
			compara = cock.getCompara();
		}
		for (int i = 0; i < vCem.length; i++) {
			bb.busca(vAux, vCem[i]);
		}
		end = System.nanoTime();
		difference = end - begining;
		System.out.println("Tempo total ordenar e fazer busca Binaria: " + difference + "\nTrocas: " + troca + "\nComparações: " + compara);
	}
}
