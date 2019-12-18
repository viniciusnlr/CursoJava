
public class Motor {

	/* ex 2 */
	
	private int potencia;
	public int getPotencia() {
		return potencia;
	}

	public int getPotenciaMax() {
		return potenciaMax;
	}

	private int potenciaMax = 100;

	public Motor(int potencia) {
		this.potencia = potencia;

		if (potencia > potenciaMax) {
			potencia = potenciaMax;
		} else if (potencia < 1) {
			potencia = 1;
		}
	}

}
