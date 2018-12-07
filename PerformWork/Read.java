package PerformWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	private Integer [] vetor;
	private String nome;
	private int tam;
	
	public Read(int tam){
		vetor = new Integer[tam];
		this.nome = "arquivo-" + tam + ".txt";
		this.tam = tam;
	}
	
	public Read(int tam, boolean Partition){
		vetor = new Integer[100];
		this.nome = "arquivo-" + tam + "-100.txt";
		this.tam = 100;
	}
		 
	private int i;
	//private int j;

		public void leArquivo() {
			//System.out.println(nome);
			try {
				FileReader ler = new FileReader(nome);
				BufferedReader lerb = new BufferedReader(ler);
				String linha = lerb.readLine();				
				String [] v = linha.split(" ");
				for (i = 0; i < tam; i++) {
					vetor[i] = Integer.valueOf(v[i]);
					linha = lerb.readLine();					
				}
				lerb.close();

			} catch (IOException ex) {
				ex.getMessage();
			}			
		}

		public Integer[] getVetor() {
			return vetor;
		}
}
