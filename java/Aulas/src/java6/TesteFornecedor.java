package java6;

public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor info = new Fornecedor("José", "rua 1", "(11)912345678", 1000, 500.50);
		System.out.printf("Olá %s, você está na %s e seu telefone é %s",info.getNome(),info.getEndereco(),info.getTelefone());
		info.obterSaldo();
		System.out.printf("\nVocê uma dívida de %.2f e podemos oferecer um crédito de o máximo %.2f",info.getValorDivida(),info.obterSaldo());
		
	}
}


/*crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos
 * implementados na classe Fornecedor e os herdados da classe Pessoa.*/