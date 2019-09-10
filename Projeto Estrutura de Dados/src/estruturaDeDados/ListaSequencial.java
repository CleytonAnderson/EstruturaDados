package estruturaDeDados;

import java.util.Scanner;

import view.Menu;

public class ListaSequencial {
	static Elemento[] contatos = new Elemento[100];
	static int tamanho = 0;
	static Menu menu = new Menu();
	
	public static boolean estaVazia() {
		return (tamanho==0);
	}

	public static boolean estaCheia() {
		return (tamanho==contatos.length);
	}
	public static int tamanhoLista()  {
		return tamanho;
	}

	public static Elemento buscar(int pos) {
		if ( (pos >= tamanho) || (pos < 0) ) {
			return null;
		}
		return contatos[pos];
	}


	public static void deslocarParaDireita(int pos) {
		for (int i = tamanho ; i > pos; i--)
			contatos[i] = contatos[i -1];
	}

	public static void inserir() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome do elemento a ser adicionado: ");
		String dado = teclado.nextLine();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual posição ele deverá ser adicionado: ");
		int pos = entrada.nextInt();
		Elemento novo = new Elemento();
		novo.dado = dado;
		
		if ( estaCheia() || (pos > tamanho) || (pos < 0) ) {
			System.out.println("Impossivel adicionar elemento!");
			menu.menuListaSequencial();
			} else {
				deslocarParaDireita(pos);
				contatos[pos] = novo;
				tamanho++;
				System.out.println("Elemento adicionado com sucesso");
				menu.menuListaSequencial();
			}
		
	}
	
	public static void deslocarParaEsquerda(int pos) {
		for (int i = pos; i < (tamanho - 1); i++)
			contatos[i] = contatos[i+1];
	}

	public static void remover () {
		System.out.println("Qual posição deverá ser removida: ");
		Scanner entrada = new Scanner(System.in);
		int pos = entrada.nextInt();
		if ( (pos >= tamanho) || (pos < 0) ) {
			System.out.println("Não existe item nessa posição!");
			menu.menuListaSequencial();
		} else {	
		deslocarParaEsquerda(pos);
		tamanho--;
		System.out.println("Item da posição " + pos + " removido com sucesso!");
		menu.menuListaSequencial();
		}
	}


	public static void listar() {
		for (int i=0; i<tamanho; i++) {
			System.out.println( i + " - Nome: " + contatos[i].dado);
		}
		menu.menuListaSequencial();		
	}

}
