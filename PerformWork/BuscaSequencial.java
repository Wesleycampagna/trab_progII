package PerformWork;

class BuscaSequencial {
	
	public boolean sequencial(Integer[] vTodo, Integer[] vCem) {
		boolean achou = true;		
		
		for (int i = 0; i < vCem.length && achou; i++) {			
			for (int j = 0; j < vTodo.length; j++) {
				if (vCem[i].equals(vTodo[j])) {									//se valorDe100 == valor de n entra na comparação
					achou = true;													//valor++;														
					//System.out.println("valor: " + valor);				a variavel valor era pra verificar se estava encontando os 100 valores dentro dos n procurados						
					j = vTodo.length - 1;						
					break;
				} else{					
					achou = false;					
				}
			}	
		}
		return achou;
	}
	/*
	 for (int i = 0; i < vCem.length; i++) {		
			int cont = 0;
			for (int j = 0; j < vTodo.length; j++) {
				if (vCem[i].equals(vTodo[j])) {									//se valorDe100 == valor de n entra na comparação
					//valor++;																					
					//System.out.println("valor: " + valor);				a variavel valor era pra verificar se estava encontando os 100 valores dentro dos n procurados						
					j = vTodo.length - 1;						
					break;
				} 	
				}
			}
		}	
	 */
}
