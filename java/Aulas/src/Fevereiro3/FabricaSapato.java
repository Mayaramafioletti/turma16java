package Fevereiro3;

public class FabricaSapato extends Fabrica{
	
	private String prenssaSola;
	private String grampeador;
	
	public String getPrenssaSola() {
		return prenssaSola;
	}

	public void setPrenssaSola(String prenssaSola) {
		this.prenssaSola = prenssaSola;
	}

	public String getGrampeador() {
		return grampeador;
	}

	public void setGrampeador(String grampeador) {
		this.grampeador = grampeador;
	}

	
	
	
	public FabricaSapato(String nome, String endereço, int quantidadeDeFuncinários) {
		super(nome, endereço, quantidadeDeFuncinários);
	}
	
	public void ligarPrenssa() {
		System.out.println("Prenssa ligada!");
	}
	
	public void desligarPrenssa() {
		System.out.println("Prenssa desligada");
	}
}
