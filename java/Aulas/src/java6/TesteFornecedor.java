package java6;

public class TesteFornecedor {
	public static void main(String[] args) {
		Fornecedor info = new Fornecedor("Jos�", "rua 1", "(11)912345678", 1000, 500.50);
		System.out.printf("Ol� %s, voc� est� na %s e seu telefone � %s",info.getNome(),info.getEndereco(),info.getTelefone());
		info.obterSaldo();
		System.out.printf("\nVoc� uma d�vida de %.2f e podemos oferecer um cr�dito de o m�ximo %.2f",info.getValorDivida(),info.obterSaldo());
		
	}
}


/*crie um programa de teste adequado que lhe permita verificar o funcionamento dos m�todos
 * implementados na classe Fornecedor e os herdados da classe Pessoa.*/