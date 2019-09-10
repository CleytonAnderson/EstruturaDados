package view;

import java.util.Scanner;

import estruturaDeDados.Arvore;
import estruturaDeDados.FilaEncadeada;
import estruturaDeDados.FilaSequencial;
import estruturaDeDados.ListaEncadeada;
import estruturaDeDados.ListaSequencial;
import estruturaDeDados.PilhaEncadeada;
import estruturaDeDados.PilhaSequencial;

public class Menu {

	public static void iniciar() {

		System.out.println("Projeto Final do Piscininha - Escolha uma opção: \n ");
		System.out.println("1 - Lista Sequencial");
		System.out.println("2 - Lista Encadeada");
		System.out.println("3 - Pilha Sequencial");
		System.out.println("4 - Pilha Encadeada");
		System.out.println("5 - Fila Sequencial");
		System.out.println("6 - Fila Encadeada");
		System.out.println("7 - Arvore de Busca Binaria");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			menuListaSequencial();
			break;
		case 2:
			menuListaEncadeada();
			break;
		case 3:
			menuPilhaSequencial();
			break;
		case 4:
			menuPilhaEncadeada();
			break;

		case 5:
			menuFilaSequencial();
			break;
		case 6:
			menuFilaEncadeada();
			break;

		case 7:
			menuArvoreBinaria();
			break;
		default:
			System.out.println("Escolha inválida");
			iniciar();
			break;
		}
	}

	

	public static void menuPilhaEncadeada() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			PilhaEncadeada.inserir();
			break;
		case 2:
			PilhaEncadeada.remover();
			break;
		case 3:
			PilhaEncadeada.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuPilhaEncadeada();
			break;
		}
	}

	public static void menuPilhaSequencial() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			PilhaSequencial.inserir();
			break;
		case 2:
			PilhaSequencial.remover();
			break;
		case 3:
			PilhaSequencial.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuPilhaSequencial();
			break;
		}
	}

	public static void menuListaEncadeada() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			menuListaEncadeadaInserir();
			break;
		case 2:
			ListaEncadeada.remover();
			break;
		case 3:
			ListaEncadeada.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuListaEncadeada();
			break;
		}
	}

	public static void menuListaEncadeadaInserir() {

		System.out.println("1 - Inserir no início");
		System.out.println("2 - Inserir no fim");
		System.out.println("3 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			ListaEncadeada.inserirNoInicio();
			break;
		case 2:
			ListaEncadeada.inserirNoFim();
			break;
		case 3:
			iniciar();
			System.out.println("Voltando.");
			menuListaEncadeada();
			break;
		default:
			System.out.println("Escolha inválida");
			menuListaEncadeadaInserir();
			break;
		}
	}

	public static void menuListaSequencial() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			ListaSequencial.inserir();
			break;
		case 2:
			ListaSequencial.remover();
			break;
		case 3:
			ListaSequencial.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuListaSequencial();
			break;
		}
	}

	public static void menuFilaSequencial() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			FilaSequencial.inserir();
			break;
		case 2:
			FilaSequencial.remover();
			break;
		case 3:
			FilaSequencial.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuFilaSequencial();
			break;

		}
	}

	public static void menuFilaEncadeada() {

		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			FilaEncadeada.inserir();
			break;
		case 2:
			FilaEncadeada.remover();
			break;
		case 3:
			FilaEncadeada.listar();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuFilaEncadeada();
			break;
		}
	}
	
	private static void menuArvoreBinaria() {
		
		System.out.println("1 - Inserir");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Voltar");

		Scanner teclado = new Scanner(System.in);
		int escolha = teclado.nextInt();
		switch (escolha) {
		case 1:
			Arvore.inserir();
			break;
		case 2:
			Arvore.remover();
			break;
		case 3:
			Arvore.imprime();
			break;
		case 4:
			iniciar();
			System.out.println("Voltando.");
			iniciar();
			break;
		default:
			System.out.println("Escolha inválida");
			menuArvoreBinaria();
			break;
	}
	}
}
