package br.com.ultracar;

public class diaSemanaFor {

	
	public static void main (String[] args){
				
		int diaSemana;
		
		for(diaSemana = 1; diaSemana < 8;diaSemana++) {
			if (diaSemana == 1) {
				System.out.println("O dia " + diaSemana + " da semana � Domingo");
			}
			else if (diaSemana == 2){
				System.out.println("O dia " + diaSemana + " da semana � Segunda-feira");
			}
			else if (diaSemana == 3){
			System.out.println("O dia " + diaSemana + " da semana � Ter�a-feira");
			}
			else if (diaSemana == 4){
				System.out.println("O dia " + diaSemana + " da semana � Quarta-feira");
			}
			else if (diaSemana == 5){
				System.out.println("O dia " + diaSemana + " da semana � Quinta-feira");
			}
			else if (diaSemana == 6){
				System.out.println("O dia " + diaSemana + " da semana � Sexta-feira");
			}
			else if (diaSemana == 7){
				System.out.println("O dia " + diaSemana + " da semana � Sabado");
			}
			else{
				System.out.println("Dia da semana inexistente");
			}
		}
		
		
		
	}

}
