package java7;

public class Animal {
	private String nome;
	private int idade;
	private String emiteSom;
	private String movimento;
	//ENCAPSULAMENTO
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	//CONSTRUTOR
	
	public Animal(String nome, int idade, String emiteSom, String movimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.movimento = movimento;
	}
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}	
	
	public String  movimento() {
		return "Corre";	
	}
}
