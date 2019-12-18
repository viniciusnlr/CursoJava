
public class ImprimirPessoa {

	Pessoa pessoa;
	
	public static void main(String[] args) {
	Pessoa Pessoa1 = new Pessoa();
	Pessoa Pessoa2 = new Pessoa();

	Pessoa1.setNome("Vinicius");	
	Pessoa1.setCPF("14240667607");
	Pessoa1.setIdade(20);
	
	Pessoa2.setNome("Vitoria");	
	Pessoa2.setCPF("14240667608");
	Pessoa2.setIdade(18);
	

	System.out.println("Dados pessoa 1: " + Pessoa1.getNome() + 
			" CPF: " + Pessoa1.getCPF() +
			" Idade: " + Pessoa1.getIdade() + "\n "
			 + "Dados pessoa 2: " + Pessoa2.getNome() + 
				" CPF: " + Pessoa2.getCPF() +
				" Idade: " + Pessoa2.getIdade());
	}
}

