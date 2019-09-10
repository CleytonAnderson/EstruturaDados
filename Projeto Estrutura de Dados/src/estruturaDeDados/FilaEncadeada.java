package estruturaDeDados;

import java.util.Scanner;

import view.Menu;

public class FilaEncadeada {
	static Elemento inicio;
	static Elemento fim;
	static int tamanho = 0;
	static Menu menu = new Menu();

	public static boolean estaVazia() {
		return (tamanho == 0);
	}

	public static void inserir() {
		
		Elemento novo = new Elemento();
		System.out.println("Nome do elemento a ser inserido.");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();

		novo.dado = nome;

		if (estaVazia()) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanho++;
		System.out.println("-- Nome inserido na fila --");
		menu.menuFilaEncadeada();
	}

	public static void listar() {
		Elemento auxiliar = inicio;

		if (estaVazia()) {
			System.out.println("-- A fila esta vazia --");
			menu.menuFilaEncadeada();
		}

		System.out.println("\n -- Inicio da Fila --");
		for (int i = 0; i < tamanho; i++) {
			System.out.println((i + 1) + "ª posição: " + auxiliar.dado);
			auxiliar = auxiliar.proximo;
		}
		System.out.println("-- Fim da fila --\n");
		menu.menuFilaEncadeada();
	}

	public static void remover() {

		if (estaVazia()) {
			System.out.println("-- A fila esta vazia --");
			menu.menuFilaEncadeada();
		}

		String valor = inicio.dado;

		if (tamanho == 1) {
			inicio = null;
			fim = null;
			tamanho = 0;
		} else {
			inicio = inicio.proximo;
			tamanho--;
		}
		System.out.println("-- " + valor + " saiu da fila --");
		menu.menuFilaEncadeada();
	}

	public static void esvaziar() {
		tamanho = 0;
		inicio = null;
		fim = null;
	}

}
