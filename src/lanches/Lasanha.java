package lanches;

import java.util.List;

public class Lasanha extends Massa{
	private List<String> ingredientes;
	private int distancia;
	
	public Lasanha(String molho, double preco, List<String> ingredientes, int distancia) {
		super.setMolho(molho);
		super.setPreco(preco);
		this.ingredientes = ingredientes;
		this.distancia = distancia;
	}
	
	@Override
	public String toString() {
		return "Dados do pedido - Lasanha\n\n" + super.toString() + "Ingredientes adicionais: " + ingredientes 
				+"\n\nTempo de Entrega: " + super.tempoDeEntrega(distancia) + " minutos\nPre�o: " + super.getPreco();
	}

}
