package lanches;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Programa {

	static int opcao;

	public static void main(String[] args) {

		boolean contador = false;

		do {
			boolean aux = false;
			while (!aux) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "::::::::::::Sistema Delivery::::::::::::"
						+ "\n\nDigite o produto deseja pedir: " + "\n\n[1] Sanduiches \n[2] Massas \n[3] Bolos\n\n"));

				switch (opcao) {
				case 1:
					menuSanduiche();
					break;
				case 2:
					menuMassa();
					break;
				case 3:
					menuBolo();
					break;

				default:
					System.exit(0);
				}

				int confirmar = JOptionPane.showConfirmDialog(null, "Fazer outro pedido?", "",
						JOptionPane.YES_NO_OPTION);

				if (confirmar == JOptionPane.YES_OPTION) {
					aux = false;
				} else {
					aux = true;
				}
			}
		} while (contador);
	}

	public static void menuSanduiche() {
		int distancia;
		List<String> ingredientes = new ArrayList<>();
		menuPrincipal(ingredientes);
		distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a distancia? "));

		Sanduiche sanduiche = new Sanduiche(ingredientes, 10.50, distancia);
		System.out.println(sanduiche.toString());
	}

	public static void menuMassa() {
		int opcao = 0;
		String molho;
		int distancia;

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Qual massa deseja? \n[1] - Pizza\n[2] - Macarrao\n[3] - Lasanha"));

			if (opcao < 1 || opcao > 3)
				System.out.println("\nOpção Inválida, tente novamente");
		} while (opcao < 1 || opcao > 3);

		molho = JOptionPane.showInputDialog(null, "Qual molho deseja: ");

		switch (opcao) {

		case 1:
			List<String> ingredientePizza = new ArrayList<>();
			menuPrincipal(ingredientePizza);
			distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a distancia? "));
			Pizza pizza = new Pizza(molho, 27, ingredientePizza, distancia);
			System.out.println(pizza.toString());
			break;

		case 2:
			List<String> ingredienteMacarrao = new ArrayList<>();
			menuPrincipal(ingredienteMacarrao);
			distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a distancia? "));
			Macarrao macarrao = new Macarrao(molho, 20.50, ingredienteMacarrao, distancia);
			System.out.println(macarrao.toString());
			break;

		case 3:
			List<String> ingredienteLasanha = new ArrayList<>();
			menuPrincipal(ingredienteLasanha);
			distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a distancia? "));
			Lasanha lasanha = new Lasanha(molho, 30, ingredienteLasanha, distancia);
			System.out.println(lasanha.toString());
			break;
		}
	}

	public static void menuBolo() {
		int distancia;

		String massaBolo = JOptionPane.showInputDialog(null, "Escolha a massa do bolo: ");

		String recheio = JOptionPane.showInputDialog(null, "Escolha a recheio do bolo: ");

		String cobertura = JOptionPane.showInputDialog(null, "Escolha a cobertura do bolo: ");
		distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a distancia? "));

		Bolo bolo = new Bolo(massaBolo, recheio, cobertura, 35, distancia);
		System.out.println(bolo.toString());

	}

	public static void menuPrincipal(List<String> lista) {
		int item; // item do menu
		do {
			item = Integer.parseInt(JOptionPane.showInputDialog(null,
					"******** MENU DE OPÇÕES ********\n" + "* 1 - Adicionar ingrediente à sacola*\n"
							+ "* 2 - Remover ingrediente da sacola *\n" + "* 3 - Verificar ingrediente na sacola* \n"
							+ "* 4 - Quantidade de ingredientes na sacola*\n" + "* 5 - Ver todos os ingredientes*\n"
							+ "* 6 - Finalizar compra *\n" + "***************************************\n"
							+ "Digite sua opção: \n",
					"CARRINHO DE COMPRAS", JOptionPane.INFORMATION_MESSAGE));

			switch (item) {
			case 1: { // adicionar ingrediente
				// int i = 0;
				String cod = "";

				for (int i = 0; i < 10; i++) {
					cod = JOptionPane.showInputDialog(null,
							"Escolha o " + (i + 1) + "º ingrediente: \n\nDigite 0 para finalizar a escolha");
					if (!cod.equals("0")) {
						lista.add(cod);
					} else {
						break;
					}
				}
			}
				break;

			case 2: { // remover ingrediente
				String indesejado = JOptionPane.showInputDialog(null, "Qual ingrediente deseja remover?");
				if (lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "A sacola está vazia!");
				} else if (lista.contains(indesejado)) {
					lista.remove(indesejado);
					JOptionPane.showMessageDialog(null, "Ingrediente removido: " + indesejado);
				} else {
					JOptionPane.showMessageDialog(null, "Ingrediente não encontrado");
				}
			}
				break;

			case 3: { // verificar se existe o ingrediente

				String i = JOptionPane.showInputDialog(null, "Qual ingrediente quer verificar?");

				if (lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Sacola vazia");
				}
				if (lista.contains(i)) {
					JOptionPane.showMessageDialog(null, "O ingrediente: ( " + i + " ) encontra-se em sua sacola!");
				} else {
					JOptionPane.showMessageDialog(null, "Ingrediente não encontrado");
				}

			}
				break;

			case 4: { // total de ingrediente
				if (lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Sacola vazia");
				} else {
					JOptionPane.showMessageDialog(null, "Quantidade de ingredientes: " + lista.size());
				}
			}
				break;

			case 5: { // ver ingredientes
				JOptionPane.showMessageDialog(null, "Ingredientes da sacola: \n" + lista.toString());

			}
				break;

			default: { // sair do programa
				if (item != 6) {
					JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente!");
				} else {
					if (item == 6) {
						JOptionPane.showMessageDialog(null, "Finalizando compra!");
					}
				}
			}
				break;
			}
		} while (item != 6);// condicao do programa
	}

}