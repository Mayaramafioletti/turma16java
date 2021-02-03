package java5;

public class Cliente {
	public String nome;
	public int idade;
	public char genero;
	
	public String genero() {
		String mensagemGenero;
		
		if(genero == 'F') {
			mensagemGenero = "Sra.";
		}
		else if(genero == 'M') {
			mensagemGenero = "Sr.";
		}
		else {
			mensagemGenero =  "Sre.";
		}
		return mensagemGenero;
	}
	public String statusIdade()
	{
		String mensagemIdade;
		if (idade <18) 
		{
			mensagemIdade = "você tem menos que 18 anos.";
		} else
		{
			mensagemIdade = "você tem mais que 18 anos.";
		}
		return mensagemIdade;
	}
}


/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e
 *  apresente as informações deste objeto no console.*/
 