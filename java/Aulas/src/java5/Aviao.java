package java5;

public class Aviao {
	public double comprimento, largura, altura;
	public char voar;
	String mensagem ;
	
	public String fly() {
		
		if(voar=='S') {
			mensagem = "O avi�o est� no ar!";
		}
		else if(voar=='N'){
			mensagem = "O avi�o est� na pista";
		}
		return mensagem;
	}

	public Aviao(double comprimento, double largura, double altura) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}


	


}



/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto avi�o, defina as instancias deste objeto e 
 * apresente as informa��es deste objeto no console.
 */

