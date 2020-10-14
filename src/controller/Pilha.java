package controller;

public class Pilha {

	private Livro topo, anterior;
	private int tamanho;

	public void push(Livro livro) { // empilhar
		if (anterior == null) {
			anterior = livro;
		} else {
			topo = livro;
			topo.setAnterior(anterior);
			anterior = topo;
		}

		tamanho++;
	}

	public void Qtd() { // Mostra a quatidade de itens na pilha 
		System.out.println("Contem " + tamanho + " livros na pilha");
	}

	public void pop() { // tira o ultimo inserido
		topo = topo.getAnterior();
		anterior = topo;
	}

	public boolean vazia() { // verifica se esta vazia
		if (anterior == null) {
			return true;
		}
		return false;
	}

	public Livro top() { // mostro o livro do topo
		return topo;
	}

	public void mostraLivros() { // Mostra pilha
		Livro aux = topo;

		while (aux != null) {
			System.out.println(aux.toString());
			aux = aux.getAnterior();
		}
	}

	public Livro desempilha(int i) { //desempilha itens
		Livro AUX = null;
		if (vazia()) {
			System.out.println("ERRO! Lista v�zia");
		} else {
			AUX = topo;
			topo = topo.getAnterior();
			System.out.println("\n" + AUX);
			return AUX;
		}
		return AUX;
	}


	public Livro getTopo() {
		return topo;
	}

	public void setTopo(Livro AUX) {
		this.topo = AUX;
	}

	public void ReEmpilha(Livro livro) { // empilhar
		if (anterior == null) {
			anterior = livro;
		} else {
			topo = livro;
			setTopo(livro);
			anterior = topo;
		}
		tamanho++;
	}
}