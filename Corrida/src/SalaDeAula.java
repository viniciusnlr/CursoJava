import java.util.Scanner;

public class SalaDeAula {

	Aluno aluno;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		String Aluno[] = new String[10];
		String auxiliar;
		
		for (int x = 0; x <= 10; x++) {
			System.out.println("Escreva o nome do aluno: ");
			auxiliar = scan.nextLine();
			
			if(x == 10) {
				System.out.println("Não é possível adicionar mais alunos.");
			}else {
				Aluno[x] = auxiliar;
			}
			
		}

	}

}
