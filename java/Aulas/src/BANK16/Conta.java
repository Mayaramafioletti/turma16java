package BANK16;

public class Conta {
	private String numero; //numero da conta
	private String cpf; //cpf do usuário
	private double saldo; //saldo do usuário, não pode modificar, não tem set
	//CONSTRUTOR- valores obrigatórios, não tem construtor padrão(vazio)
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
