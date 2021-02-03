package entidades;

public class ConstrutorItem1 {
	public double valor;
	public int codigo;
	public String nome;
	
	public ConstrutorItem1(String nome) {
		this.nome = nome;
	}

	public ConstrutorItem1(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public ConstrutorItem1(double valor, int codigo, String nome) {
		//valor = x;
		this.valor = valor;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
}
