package estruturaDeDados;

import java.util.Scanner;
import view.Menu;

public class PilhaEncadeada {
	static Elemento topo;
	static int quantidade = 0;
	static Menu menu = new Menu();
	
	public static boolean estaVazia() {
		return (topo==null);
	}

	public static void inserir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento a ser adicionado: ");
		String novodado = teclado.nextLine();
		Elemento novo = new Elemento();
		novo.dado = novodado;
		novo.proximo = topo;
		topo = novo;
		quantidade++;
		System.out.println("Elemento Adicionado!");
		menu.menuPilhaEncadeada();
	}

	public static void remover() {
		// TODO Auto-generated method stub
		if (estaVazia()) {
			System.out.println("Pilha está vazia");		
		} else {
			String retorno = topo.dado;
			topo = topo.proximo;
			quantidade--;
			System.out.println("Elemento removido: " + retorno);
			menu.menuPilhaEncadeada();
		}		
	}

	public static void listar() {
		// TODO Auto-generated method stub
		Elemento auxiliar = topo;
		System.out.println("\nExibindo elementos do topo até a base.");
		for (int i = 0; i<quantidade; i++) {
			System.out.println(auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
		menu.menuPilhaEncadeada();
	}

}
