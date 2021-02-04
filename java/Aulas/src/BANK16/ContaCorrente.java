package BANK16;

public class ContaCorrente extends Conta {
	private int qtMesTalao;
	//CONSTRUTOR
	public ContaCorrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}
	//SETTERS E GETTERS
	public int getQtMesTalao() {
		return qtMesTalao;
	}
	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}
	
	public void emitirTalao(int qtde) {
		if(qtde<0 || qtde>4) {
			qtde = 0;
		}
		
	}
}
