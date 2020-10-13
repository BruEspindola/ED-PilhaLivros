package view;

import controller.Livro;
import controller.Pilha;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro("Livro 1", 2019, 29.99);
		Livro l2 = new Livro("Livro 2", 2017, 15.99);
		Livro l3 = new Livro("Livro 3", 2015, 27.99);
		Livro l4 = new Livro("Livro 4", 2014, 17.99);

		Pilha p = new Pilha();
		System.out.println(p.vazia());
		p.push(l1); // empilhar o livro 1
		p.push(l2); // empilhar o livro 2
		p.push(l3);
		p.push(l4);

		p.Qtd();
		
		System.out.println("===================");
		System.out.println("Topo: \n" + p.top());

		System.out.println("===================");
		System.out.println("Todos Elementos:");
		p.mostraLivros();

		System.out.println("===================");
		System.out.println("Removendo primeiro livro:");

	
		/*p.mostraLivros();

		System.out.println("===================");
		System.out.println("Topo: \n" + p.top());
		System.out.println(p.vazia());*/
	}
}
