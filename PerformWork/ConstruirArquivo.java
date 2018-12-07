package PerformWork;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
class ConstruirArquivo {
	
	//=========================================================================================================================
	private Integer [] PreencheVetor(Integer v[], int MAX){
		Random rand = new Random();
		int cont = 0;
		boolean verifica = false;
//-------------------------------------- randoniza um valor---------------------------------------------------------------------
		while (cont < v.length) {
			Integer valor = rand.nextInt(MAX);
			int i = 0;
			if (v[0] == null)
				verifica = false;			
			else{																
//------------------------------------verifica se ja é existente dentro dos que ja foram preenchidos --------------------------------------
				while(v[i] != null){
					if (v[i] == valor){
						verifica = true;
					}
					i++;					
				}
			}
//----------------------------------se mantiver em false apos o while não existe o valor então se adiciona-----------------------------------
			if (verifica == false){
				v[cont] = valor;
				cont++;
			}
			verifica = false;		
			}
		return v;
	}
	

	public void ConstruirArq(int tamanho ){	
		//======================================================================================================================		
		Integer vetor [] = new Integer [tamanho];		
		PreencheVetor(vetor, 999999);	
		
		String nome = "arquivo-" + tamanho + ".txt";
		FileWriter insertion = null;
	//--------------------------abrir FileWriter-----------------------------------------------------------------------------------
		try {
			insertion = new FileWriter(nome,  true);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	//-------------------------- escrever no arquivo ------------------------------------------------------------------------------
		
		PrintWriter penNumber = new PrintWriter(insertion);
		Scanner input = new Scanner(System.in);	
		for (int i = 0; i < vetor.length; i++) {
			penNumber.printf("%s ", vetor[i]);
		}	
		
		if (tamanho > 100){
			ConstruirArquivo100 ent = new ConstruirArquivo100(); // chama preechimento de 100;
			ent.ConstruirArquivode100(tamanho, vetor);
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
