package java5;

public class Aviao {
	public double comprimento, largura, altura;
	public char voar;
	String mensagem ;
	
	public String fly() {
		
		if(voar=='S') {
			mensagem = "O avião está no ar!";
		}
		else if(voar=='N'){
			mensagem = "O avião está na pista";
		}
		return mensagem;
	}

	public Aviao(double comprimento, double largura, double altura) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}


	


}



/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.
 */

