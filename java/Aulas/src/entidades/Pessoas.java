package entidades;

public class Pessoas {
	public String nome;
	public int anoNascimento;
	public char sexo;
	
	
	public int idade() {
		return 2021-anoNascimento; // se for void n�o precisa de return,	
	}
	
	public String genero() {
		String mensagemGenero;
		
		if(sexo == 'F') {
			mensagemGenero = "Sra.";
		}
		else if(sexo == 'M') {
			mensagemGenero = "Sr.";
		}
		else {
			mensagemGenero =  "Sre.";
		}
		return mensagemGenero;		
	}

	public String statusIdade()
	{
		int idade;
		String mensagemIdade;
		idade = 2021 - anoNascimento;
		if (idade <18) 
		{
			mensagemIdade = "� menor que 18 anos. Ent�o vai para o teens";
		} else
		{
			mensagemIdade = "� maior que 18 anos.";
		}
		return mensagemIdade;
	}
}
