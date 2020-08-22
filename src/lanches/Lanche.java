package lanches;

public abstract class Lanche {
private double preco;
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double tempoDeEntrega(double distancia) {
		return distancia * 10;
	}
}
