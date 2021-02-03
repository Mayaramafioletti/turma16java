package java5;



public class ProdutoEletronicoObjeto {
	public static void main(String[] args) {
		ProdutoEletronico info1 = new ProdutoEletronico(39.9,"teclado","preto   ");
		ProdutoEletronico info2 = new ProdutoEletronico(89.9,"teclado","colorido");
		ProdutoEletronico info3 = new ProdutoEletronico(24.9,"mouse","preto     ");
		ProdutoEletronico info4 = new ProdutoEletronico(44.9,"mouse","colorido  ");
		
		System.out.println("PRODUTO\t|COR\t\t|PREÇO");
		
		System.out.println(info1.nome+"\t|"+info1.cor+"\t|"+info1.valor);
		System.out.println(info2.nome+"\t|"+info2.cor+"\t|"+info2.valor);
		System.out.println(info3.nome+"\t|"+info3.cor+"\t|"+info3.valor);
		System.out.println(info4.nome+"\t|"+info4.cor+"\t|"+info4.valor);
		
	}
}
