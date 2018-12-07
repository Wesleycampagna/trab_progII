package PerformWork;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class ConstruirArquivo100 {
	
	private Integer [] SelecionaValores(Integer v100[], Integer v2[]){
		Random rand = new Random();		
		boolean possible = true;
		int cont = 0;
		
		while(cont < v100.length){
			int save = rand.nextInt(v2.length);
			for (int j = 0; j < v100.length; j++) {				
				if (v100[j] == v2[save])																						
					possible = false;							
			}
			if (possible == true){
				v100[cont] = v2[save];	
				cont++;
			}
			possible = true;
		}
		return v100;
	}
	
	public void ConstruirArquivode100(int tamanho, Integer v[]) {
		String nome100 = "arquivo-" + tamanho + "-100.txt";
		Integer vetor100 [] = new Integer[100];	
		
		SelecionaValores(vetor100, v);
		
		FileWriter insertion = null;
	//--------------------------abrir FileWriter-----------------------------------------------------------------------------------
		try {
			insertion = new FileWriter(nome100,  true);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	//-------------------------- escrever no arquivo ------------------------------------------------------------------------------
		
		PrintWriter penNumber = new PrintWriter(insertion);
		Scanner input = new Scanner(System.in);	
		for (int i = 0; i < vetor100.length; i++) {
			penNumber.printf("%s ", vetor100[i]);
		}	
		
//----------------------------- fechar FileWriter -------------------------------------------------------------------------------
		try {
			insertion.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		input.close();
	}	
}
