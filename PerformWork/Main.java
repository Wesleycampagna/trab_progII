package PerformWork;

public class Main {
	public static void main(String[] args) {
		
//===========================================
		//Construir arquivos
//===========================================
		
		ConstruirArquivo arq = new ConstruirArquivo();
		/*arq.ConstruirArq(1000);
		arq.ConstruirArq(5000);
		arq.ConstruirArq(10000);
		arq.ConstruirArq(20000);
		arq.ConstruirArq(50000);
		arq.ConstruirArq(100000);*/
			
//============================================
		//comparar tempo
//============================================
		TestCases vetor = new TestCases();
		System.out	.println("\n**********************   VETOR MIL ************************");
		Read mil = new Read(1000);
		mil.leArquivo();
		Read millSelecionado = new Read(1000, true);
		millSelecionado.leArquivo();
		vetor.calcula(mil.getVetor(), millSelecionado.getVetor());
		
		System.out	.println("\n**********************   VETOR 5MIL ***********************");
		Read cincoMil = new Read(5000);
		cincoMil.leArquivo();
		Read cincoMilSelecionado = new Read(5000, true);
		cincoMilSelecionado.leArquivo();
		vetor.calcula(cincoMil.getVetor(), cincoMilSelecionado.getVetor());
		
		System.out	.println("\n**********************   VETOR 10MIL **********************");
		Read dezMil = new Read(10000);
		dezMil.leArquivo();
		Read dezMilSelecionado = new Read(10000, true);
		dezMilSelecionado.leArquivo();
		vetor.calcula(dezMil.getVetor(), dezMilSelecionado.getVetor());
		
		System.out	.println("\n**********************   VETOR 20MIL **********************");
		Read vinteMil = new Read(20000);
		vinteMil.leArquivo();
		Read vinteMilSelecionado = new Read(20000, true);
		vinteMilSelecionado.leArquivo();
		vetor.calcula(vinteMil.getVetor(), vinteMilSelecionado.getVetor());
		System.out	.println("\n**********************   VETOR 50MIL **********************");
		Read ciquentaMil = new Read(1000);
		ciquentaMil.leArquivo();
		Read ciquentaMilSelecionado = new Read(1000, true);
		ciquentaMilSelecionado.leArquivo();
		vetor.calcula(ciquentaMil.getVetor(), ciquentaMilSelecionado.getVetor());
		System.out	.println("\n**********************   VETOR 100MIL **********************");
		Read cemMil = new Read(1000);
		cemMil.leArquivo();
		Read cemMilSelecionado = new Read(1000, true);
		cemMilSelecionado.leArquivo();
		vetor.calcula(cemMil.getVetor(), cemMilSelecionado.getVetor());
	}
}
