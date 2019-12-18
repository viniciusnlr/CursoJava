
public class Corrida {

	public static void main(String[] args) {

		CarroCorrida carroEquipeVelocidade = new CarroCorrida(1, 100.0);
		CarroCorrida carroEquipeTrapaceiros = new CarroCorrida(2, 100.0);

		Piloto pilotoEquipeVelocidade = new Piloto();
		Piloto pilotoEquipeTrapaceiros = new Piloto();

		pilotoEquipeVelocidade.setNome("Vinicius");
		pilotoEquipeVelocidade.setIdade(20);
		pilotoEquipeVelocidade.setHabilidade(100);

		pilotoEquipeTrapaceiros.setNome("Lula");
		pilotoEquipeTrapaceiros.setIdade(50);
		pilotoEquipeTrapaceiros.setHabilidade(50);

		carroEquipeVelocidade.setPiloto(pilotoEquipeVelocidade);
		carroEquipeTrapaceiros.setPiloto(pilotoEquipeTrapaceiros);
		

		carroEquipeVelocidade.setNumeroIdentifcacao(1);
		carroEquipeTrapaceiros.setNumeroIdentifcacao(2);

		carroEquipeVelocidade.ligar();
		carroEquipeTrapaceiros.ligar();

		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();

		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();

		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();

	}

}
