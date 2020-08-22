package lanches;

import java.util.List;

public class Sanduiche extends Lanche {
	final int tempoPreparo = 15;
	private List<String> ingredientes;
	private double distancia;
	
	public Sanduiche(List<String> ingredientes, double preco, double distancia) {
		this.ingredientes = ingredientes;
		super.setPreco(preco);
		this.distancia = distancia;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public double tempoDeEntrega(double distancia) {
		return super.tempoDeEntrega(distancia) + tempoPreparo;
	}
	
	@Override
	public String toString() {
		return "Dados do pedido\n\nTempo de Preparo: " + tempoPreparo + " minutos\n\nIngredientes adicionais = " + ingredientes 
				+"\n\nTempo de Entrega: " + super.tempoDeEntrega(distancia) + " minutos\nPreço: " + super.getPreco();
	}
}