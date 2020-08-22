package lanches;

public class Bolo extends Lanche {
	public final int tempoPreparo = 10;
	private String massa;
	private String recheio;
	private String cobertura;
	private double distancia;

	public Bolo(String massa, String recheio, String cobertura, double preco, double distancia) {
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
		super.setPreco(preco);
		this.distancia = distancia;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public double tempoDeEntrega(double distancia) {
		return super.tempoDeEntrega(distancia) + tempoPreparo;
	}

	@Override
	public String toString() {
		return "Dados do Pedido\n\nTempo de preparo: " + tempoPreparo + " minutos\nMassa: " + massa + "\nRecheio: "
				+ recheio + "\nCobertura:" + cobertura + "\nTempo de entrega: " + tempoDeEntrega(distancia)
				+ " minutos\nPreço: " + super.getPreco();
	}
}