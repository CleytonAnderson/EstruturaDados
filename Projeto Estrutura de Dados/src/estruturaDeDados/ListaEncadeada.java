package estruturaDeDados;

import java.util.Scanner;

import view.Menu;

public class ListaEncadeada {
	static Elemento primeiro = null;
	static Elemento ultimo = null;
	static int tamanho = 0;
	
	static Menu menu = new Menu();
	
	public static boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}


	public static void inserirNoInicio ( ) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento a ser adicionado no início: ");
		String dado = teclado.nextLine();
		
		Elemento novo = new Elemento();
		novo.dado = dado;
		
		if ( estaVazia() ) {
			primeiro = ultimo = novo;
		}
		else {
			novo.proximo = primeiro;
			primeiro = novo;
		}
		tamanho++;
		menu.menuListaEncadeada();
	}
	
	public static void inserirNoFim () {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento a ser adicionado no fim: ");
		String dado = teclado.nextLine();
		
		Elemento novo = new Elemento();
		novo.dado = dado;

		if ( estaVazia () ) {
			primeiro = ultimo = novo;
		}
		else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
		tamanho++;
		menu.menuListaEncadeada();
	}
	
	public static int tamanhoDaLista() {
		return tamanho;
	}

	public static void remover() {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento que vocÊ deseja remover: ");
		String dado = teclado.nextLine();
		
		Elemento novo = new Elemento();
		novo.dado = dado;
		
		if (tamanho == 0) {
			System.out.println("lista vazia");
			menu.menuListaEncadeada();
		}

		if (tamanho == 1) { 
			 if (primeiro.dado.equals(novo.dado) ) {
				 primeiro = ultimo = null;
				 tamanho--;
				 System.out.println("Elemento removido: " + novo.dado);
				 menu.menuListaEncadeada();
			 }
			 else {
				 System.out.println("O nome procurado não está na lista");
				 menu.menuListaEncadeada();
			 }
			
		}
		
		Elemento alunodafrente = primeiro;
		Elemento alunodetrás = null;;

		for (int i=0; i < tamanho; i++) {
			if (novo.dado.equals(alunodafrente.dado)) {
			
				if (i==0) {
					System.out.println("Elemento removido: " + novo.dado);
					primeiro = primeiro.proximo;
					tamanho--;
					menu.menuListaEncadeada();
				}
				else {
					alunodetrás.proximo = alunodafrente.proximo;
					System.out.println("Elemento removido: " + novo.dado);
					tamanho--;
					menu.menuListaEncadeada();
				}				
				
			} else {
				System.out.println("Procurando...");
				alunodetrás = alunodafrente;
				alunodafrente = alunodafrente.proximo;
			}
		}
		menu.menuListaEncadeada();
	}

	public static void listar() {
		// TODO Auto-generated method stub
		Elemento temp = primeiro;
		if ( estaVazia() == false ) {
			for (int i=0; i<tamanho; i++) {
				System.out.println(i + "| nome: "+temp.dado);
				temp = temp.proximo;
			}
		}
		System.out.println("\n");
		menu.menuListaEncadeada();
	}
	
}
