package MesAno;

import java.util.Scanner;

public class mesAno {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Insira o n�mero referente ao m�s do ano: ");
		
		int mesAno = scan.nextInt();
		
		if(mesAno == 1){
			System.out.println("O m�s de n�mero " + mesAno + " � Janeiro");
		}
		else if(mesAno == 2){
			System.out.println("O m�s de n�mero " + mesAno + " � Fevereiro");
		}
		else if(mesAno == 3){
			System.out.println("O m�s de n�mero " + mesAno + " � Mar�o");
		}
		else if(mesAno == 4){
			System.out.println("O m�s de n�mero " + mesAno + " � Abril");
		}
		else if(mesAno == 5){
			System.out.println("O m�s de n�mero " + mesAno + " � Maio");
		}
		else if(mesAno == 6){
			System.out.println("O m�s de n�mero " + mesAno + " � Junho");
		}
		else if(mesAno == 7){
			System.out.println("O m�s de n�mero " + mesAno + " � Julho");
		}
		else if(mesAno == 8){
			System.out.println("O m�s de n�mero " + mesAno + " � Agosto");
		}
		else if(mesAno == 9){
			System.out.println("O m�s de n�mero " + mesAno + " � Setembro");
		}
		else if(mesAno == 10){
			System.out.println("O m�s de n�mero " + mesAno + " � Outubro");
		}
		else if(mesAno == 11){
			System.out.println("O m�s de n�mero " + mesAno + " � Novembro");
		}
		else if(mesAno == 12){
			System.out.println("O m�s de n�mero " + mesAno + " � Dezembro");
		}else {
			System.out.println("M�s inexistente");
		}
		
	}

}
