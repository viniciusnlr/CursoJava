package br.com.ultracar;

import java.util.Scanner;

public class diaSemana {
	
	public static Scanner scan = new Scanner(System.in);

	
	public static void main (String[] args){
	
		System.out.println("Escreva o dia da semana: ");	
				
		int diaSemana = scan.nextInt();
			
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
