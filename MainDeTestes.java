package ztestes;

import java.util.Random;

import Sorts.BubbleSort;
import Sorts.BubbleSortMelhorado;
import Sorts.CocktailSort;
import Sorts.InsertionSort;
import Sorts.InsertionSortOtimizado;
import Sorts.MergeSort;
import Sorts.QuickSort;
import Sorts.SelectionSort;

public class Main {

	public static void print(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

	public static void printInt(Integer[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " - ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		/*
		 * buscabinaria bb = new buscabinaria();
		 */

		Random rand = new Random();
		Integer[] vetorInicial = new Integer[15];
		for (int j = 0; j < vetorInicial.length; j++) {
			int valor = rand.nextInt(30);
			vetorInicial[j] = Integer.valueOf(valor);
		}
		// printInt(vetorInicial);
		Integer vetor[] = new Integer[vetorInicial.length];
		Integer vetor1[] = new Integer[vetorInicial.length];
		Integer vetor2[] = new Integer[vetorInicial.length];
		Integer vetor3[] = new Integer[vetorInicial.length];
		Integer vetor4[] = new Integer[vetorInicial.length];
		Integer vetor5[] = new Integer[vetorInicial.length];
		Integer vetor6[] = new Integer[vetorInicial.length];
		Integer vetor7[] = new Integer[vetorInicial.length];
		for (int i = 0; i < vetorInicial.length; i++) {
			vetor[i] = vetorInicial[i];
			vetor1[i] = vetorInicial[i];
			vetor2[i] = vetorInicial[i];
			vetor3[i] = vetorInicial[i];
			vetor4[i] = vetorInicial[i];
			vetor5[i] = vetorInicial[i];
			vetor6[i] = vetorInicial[i];
			vetor7[i] = vetorInicial[i];

		}

		CocktailSort co = new CocktailSort();
		InsertionSortOtimizado insop = new InsertionSortOtimizado();
		BubbleSort bublenormal = new BubbleSort();
		BubbleSortMelhorado bmelh = new BubbleSortMelhorado();
		InsertionSort ins = new InsertionSort();
		MergeSort msor = new MergeSort();
		QuickSort qu = new QuickSort();
		SelectionSort sel = new SelectionSort();

		bublenormal.sort(vetor);
		// printInt(vetor);
		System.out.println("bubble || troca: " + bublenormal.getTroca() + " , comparações: " + bublenormal.getCompara());
		ins.sort(vetor2);
		//printInt(vetor2);
		System.out.println("insertion || troca: " + ins.getTroca() + " , comparações: " + ins.getCompara());		
		bmelh.sort(vetor4);
		//printInt(vetor4);
		System.out.println("bubleOp || troca: " + bmelh.getTroca() + " , comparações: " + bmelh.getCompara());
		co.sort(vetor7);
		//printInt(vetor7);
		System.out.println("cocktail || troca: " + co.getTroca() + " , comparações: " + co.getCompara());		
		qu.quickSort(vetor5, 0, vetor5.length - 1);
		//printInt(vetor5);
		System.out.println("quick || troca: " + qu.getTroca() + " , comparações: " + qu.getCompara());
		sel.sort(vetor6);
		//printInt(vetor6);
		System.out.println("selection || troca: " + sel.getTroca() + " , comparações: " + sel.getCompara());		
		insop.sort(vetor1);
		//printInt(vetor1);
		System.out.println("insertionOp || troca: " + insop.getTroca() + " , comparações: " + insop.getCompara());
		msor.sort(vetor3, 0, vetor.length - 1);
		//printInt(vetor3);
		System.out.println("merge || troca: " + msor.getCopia() + " , comparações: " + msor.getCompara());

		// ConstruirArquivo a = new ConstruirArquivo();
		// a.ConstruirArq(6);
		// Read b = new Read(6);
		// b.leArquivo();
		// printInt(b.getVetor());

		// Read millSelecionado = new Read(1000, true);
		// millSelecionado.leArquivo();
		// printInt(millSelecionado.getVetor());

		// bublenormal.sort(vetor);
		// printInt(vetor);
		// System.out.println(bb.busca(vetor, 5));

	}
}
