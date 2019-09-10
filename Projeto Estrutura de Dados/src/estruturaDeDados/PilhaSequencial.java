package estruturaDeDados;

import java.util.Scanner;

import view.Menu;


public class PilhaSequencial {
	static String elementos[] = new String[100];
	static int topo = -1;
	static Menu menu = new Menu();
	
	public static boolean estaVazia() {
		return (topo==-1);
	}
	
	public static boolean estaCheia() {
		return (topo==elementos.length - 1);
	}


	public static void listar() {
		// TODO Auto-generated method stub
		System.out.println("\nElementos da pilha:");
		for (int i=0; i<=topo; i++) {
			System.out.println((i+1)+"º Elemento: "+elementos[i]);
		}
		menu.menuPilhaSequencial();
	}
	
	public static void inserir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento a ser adicionado: ");
		String valor = teclado.nextLine();
		
		if (estaCheia()) {
			System.out.println("Lista está cheia"); menu.menuPilhaSequencial();
		}
		else {
			topo++;
			elementos[topo] = valor;
			System.out.println("Adicionado com sucesso"); menu.menuPilhaSequencial();
		}
		
	}


	public static void remover() {
		if (estaVazia()) {
			System.out.println("A Pilha está vazia"); menu.menuPilhaSequencial();
		}
		else {
		String valor = elementos[topo];
		elementos[topo] = null;
		topo--;
		System.out.println("Elemento removido: " + valor); menu.menuPilhaSequencial();
		}
		
	}

}
