package MesAno;

import java.util.Scanner;

public class mesAno {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Insira o número referente ao mês do ano: ");
		
		int mesAno = scan.nextInt();
		
		if(mesAno == 1){
			System.out.println("O mês de número " + mesAno + " é Janeiro");
		}
		else if(mesAno == 2){
			System.out.println("O mês de número " + mesAno + " é Fevereiro");
		}
		else if(mesAno == 3){
			System.out.println("O mês de número " + mesAno + " é Março");
		}
		else if(mesAno == 4){
			System.out.println("O mês de número " + mesAno + " é Abril");
		}
		else if(mesAno == 5){
			System.out.println("O mês de número " + mesAno + " é Maio");
		}
		else if(mesAno == 6){
			System.out.println("O mês de número " + mesAno + " é Junho");
		}
		else if(mesAno == 7){
			System.out.println("O mês de número " + mesAno + " é Julho");
		}
		else if(mesAno == 8){
			System.out.println("O mês de número " + mesAno + " é Agosto");
		}
		else if(mesAno == 9){
			System.out.println("O mês de número " + mesAno + " é Setembro");
		}
		else if(mesAno == 10){
			System.out.println("O mês de número " + mesAno + " é Outubro");
		}
		else if(mesAno == 11){
			System.out.println("O mês de número " + mesAno + " é Novembro");
		}
		else if(mesAno == 12){
			System.out.println("O mês de número " + mesAno + " é Dezembro");
		}else {
			System.out.println("Mês inexistente");
		}
		
	}

}
