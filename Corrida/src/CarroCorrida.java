
public class CarroCorrida {

	private int numeroIdentificacao;
	private double velocidadeAtual = 0.0;
	private double velocidadeMaxima = 100.0;
	private Piloto piloto;
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getNumeroIdentifcacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentifcacao(int numeroIdentifcacao) {
		this.numeroIdentificacao = numeroIdentifcacao;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	void ligar() {
		System.out.println("Vruuuuuuuuuummmmmmmmm");
	}

	void desligar() {
		System.out.println("mmmmmmmmm........");
	}

	/* ex 3 */
	void acelerar() {

		velocidadeAtual += 10 + piloto.getHabilidade() * 0.1 + motor.getPotencia()*0.1;
		if (velocidadeAtual > velocidadeMaxima) {

			velocidadeAtual = velocidadeMaxima;

		}
	}

	void frear(int intensidadeFreada) {
		if (intensidadeFreada > 100) {

			intensidadeFreada = 100;
		} else if (intensidadeFreada < 0) {

			intensidadeFreada = 0;
		}

		velocidadeAtual -= intensidadeFreada * 0.25;

		if (velocidadeAtual < 0) {

			velocidadeAtual = 0.0;
		}

	}

	public CarroCorrida(int numeroIdentificacao, double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	/* ex 1 */
	public CarroCorrida(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
