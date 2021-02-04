package BANK16;

public class ContaPoupança extends Conta {
	private int diaAniversario;
	//CONSTRUTOR
	public ContaPoupança(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}
	//GETTERS E SETTERS 
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario (int dia) {
		double correcao = super.getSaldo()*0.0005;
		if(dia == diaAniversario) {
			super.creditar(correcao);
		}
	}

}
