package ExerciciosAula;

public class Construtor {

	public String nome;
	public boolean estado;
	

	public Construtor(String nome) {
		//super(); não precisa
		this.nome = nome; //
	}


	public Construtor(String nome, boolean estado) {
		this.nome = nome;
		this.estado = estado;
	}



	
	
}
