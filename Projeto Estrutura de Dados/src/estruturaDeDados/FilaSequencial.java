package estruturaDeDados;

import view.Menu;

import java.util.Scanner;

public class FilaSequencial {
	static String filaSequencial[] = new String[100];
	static int tamanho = -1;
	static Menu menu = new Menu();
	
	static public boolean estaVazia() {
		return (tamanho == -1);
	}
	
	static public boolean estaCheia() {
		return (tamanho == filaSequencial.length-1);
	}
	
	static public void inserir() {
		if (estaCheia() ) {
			System.out.println("A fila está cheia.");			
		}		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do elemento a ser inserido.");
		String valor = entrada.nextLine();
		tamanho ++;
		filaSequencial [tamanho] = valor;
		System.out.println("Elemento inserido com sucesso!");
		menu.menuFilaSequencial();
	}
	
	static public void listar() {
		if(estaVazia()) {
			System.out.println("A fila está vazia!");
		}
		System.out.println("\n Inicio da fila ");
		for (int i=0; i<=tamanho; i++) {
			System.out.println((i+1) + "ª Posição: " + filaSequencial[i]);
		
		}
		System.out.println(" Fim da fila \n");
		menu.menuFilaSequencial();
	}	
	
	static public void remover() {
		if (estaVazia()) {
			System.out.println("A Pilha está vazia"); 
			menu.menuFilaSequencial();
		}
		else {
		String valor = filaSequencial[tamanho];
		filaSequencial[tamanho] = null;
		tamanho--;
		System.out.println("Elemento removido: " + valor); 
		menu.menuFilaSequencial();
		}
	}
}