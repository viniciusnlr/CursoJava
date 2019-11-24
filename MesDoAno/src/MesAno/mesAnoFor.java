package MesAno;

public class mesAnoFor {

	public static void main(String[] args) {
		
		int mesAno;
		
		for(mesAno = 1;mesAno < 14;mesAno++) {		
			if(mesAno == 1) {
				System.out.println("O mês de número: " + mesAno + "é o mês de Janeiro");
			}
			else if (mesAno == 2) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Fevereiro");
			}
			else if (mesAno == 3) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Março");
			}
			else if (mesAno == 4) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Abril");
			}
			else if (mesAno == 5) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Maio");
			}
			else if (mesAno == 6) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Junho");
			}
			else if (mesAno == 7) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Julho");
			}
			else if (mesAno == 8) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Agosto");
			}
			else if (mesAno == 9) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Setembro");
			}
			else if (mesAno == 10) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Outubro");
			}
			else if (mesAno == 11) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Novembro");
			}
			else if (mesAno == 12) {
				System.out.println("O mês de número: " + mesAno + " é o mês de Dezembro");
			}else {
				System.out.println("Mês inexistente.");
			}
		}
	}

}