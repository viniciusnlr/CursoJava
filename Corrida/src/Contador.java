
public class Contador {
	
	int valorInicial;
	int valorAtual;
	
	void incrementar(int valorInicial) {
		valorAtual = valorInicial++;
	}
	
	void decrementar(int valorAtual) {
		valorAtual = valorAtual--;
		System.out.println(valorAtual);
	}		
	
}
