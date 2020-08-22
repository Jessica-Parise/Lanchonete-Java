package lanches;

public abstract class Massa extends Lanche {
	final int tempoPreparo = 30;
	private String molho;

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getMolho() {
		return molho;
	}

	@Override
	public double tempoDeEntrega(double distancia) {
		return super.tempoDeEntrega(distancia) + tempoPreparo;
	}

	@Override
	public String toString() {
		return "Massa\n\nTempo de Preparo: " + tempoPreparo + " minutos \nMolho:" + molho + "\n\n";
	}
}