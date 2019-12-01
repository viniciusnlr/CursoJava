package br.com.ultracar;

public class Array {
	
	public static void main(String[] args) {

	boolean[] faltas = new boolean[4];
	
	faltas[0] = false;
	faltas[1] = false;
	faltas[2] = true;
	faltas[3] = true;
	
	boolean faltou = true;
	//igual a estrutura do for
	for(boolean falta: faltas) {
		faltou = faltou && falta;
		// faltou recebe faltou e compara com cada um dos elementos do array
	}
     System.out.println(faltou);
	}
	
}
