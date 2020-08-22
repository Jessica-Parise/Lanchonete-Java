package lanches;

import java.util.List;

public class Macarrao extends Massa {
	
	private List<String> ingredientes;
	private int distancia;
	
	public Macarrao(String molho, double preco, List<String> ingredientes, int distancia) {
		super.setMolho(molho);
		super.setPreco(preco);
		this.ingredientes = ingredientes;
		this.distancia = distancia;
	}
	
	@Override
	public String toString() {
		return "Dados do pedido - Macarrão\n\n" + super.toString() + "Ingredientes adicionais = " + ingredientes 
				+"\n\nTempo de Entrega: " + super.tempoDeEntrega(distancia) + " minutos\nPreco: " + super.getPreco();
	}
}