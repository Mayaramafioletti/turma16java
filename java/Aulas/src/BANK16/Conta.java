package BANK16;

public class Conta {
	private String numero; //numero da conta
	private String cpf; //cpf do usu�rio
	private double saldo; //saldo do usu�rio, n�o pode modificar, n�o tem set
	//CONSTRUTOR- valores obrigat�rios, n�o tem construtor padr�o(vazio)
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	//GETTERS E SETTERS
	public double getSaldo() {
		return saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//dois metodos void -debtar(), +creditar()
	public void debitar(double valor) {
		if(valor<=saldo) {
		saldo -= valor;
		}
		else {
			saldo = 0;
		}
	}
	public void creditar(double valor) {
		saldo += valor;
	}

}
