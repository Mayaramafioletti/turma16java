package Fevereiro3;

public class Fabrica {
	
	private String nome;
	private String endere�o;
	private int quantidadeDeFuncin�rios;
	
	public Fabrica(String nome, String endere�o, int quantidadeDeFuncin�rios) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.quantidadeDeFuncin�rios = quantidadeDeFuncin�rios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getQuantidadeDeFuncin�rios() {
		return quantidadeDeFuncin�rios;
	}

	public void setQuantidadeDeFuncin�rios(int quantidadeDeFuncin�rios) {
		this.quantidadeDeFuncin�rios = quantidadeDeFuncin�rios;
	}
	
	
}
