package java6;

public class PessoaSuperClasse {
	private String nome;
	private String endereco;
	private String telefone;
	public char sexo;
	//CONSTRUTOR PADR�O
	public PessoaSuperClasse() {
		super();
	}
	//getters and setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public PessoaSuperClasse(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	//MAIS DOIS CONSTRUTORES
	
	
	
}
/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos
 *  seletores (getters) e modificadores (setters), e ainda o construtor padr�o e 
 *  pelo menos mais duas op��es de construtores conforme sua percep��o. 
 *  Atributos: String nome; String endere�o; String telefone; 
 */