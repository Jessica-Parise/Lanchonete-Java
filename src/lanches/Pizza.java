package lanches;

import java.util.List;

public class Pizza extends Massa{
	
	private List<String> ingredientes;
	private int distancia;
	
	public Pizza(String molho, double preco, List<String> ingredientes, int distancia) {
		super.setMolho(molho);
		super.setPreco(preco);
		this.ingredientes = ingredientes;
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "Dados do pedido - Pizza\n\n" + super.toString() + "Ingredientes adicionais = " + ingredientes 
				+"\n\nTempo de Entrega: " + super.tempoDeEntrega(distancia) + " minutos\nPreco: " + super.getPreco();
	}
}