package Fevereiro3;

public class Fabrica {
	
	private String nome;
	private String endereço;
	private int quantidadeDeFuncinários;
	
	public Fabrica(String nome, String endereço, int quantidadeDeFuncinários) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.quantidadeDeFuncinários = quantidadeDeFuncinários;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getQuantidadeDeFuncinários() {
		return quantidadeDeFuncinários;
	}

	public void setQuantidadeDeFuncinários(int quantidadeDeFuncinários) {
		this.quantidadeDeFuncinários = quantidadeDeFuncinários;
	}
	
	
}
