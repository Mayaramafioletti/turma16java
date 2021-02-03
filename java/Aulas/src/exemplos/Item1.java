package exemplos;

import entidades.ConstrutorItem1;

public class Item1 {
	public static void main(String[] args) {
	
		ConstrutorItem1 item3 = new ConstrutorItem1("Caneta");
		ConstrutorItem1 item2 = new ConstrutorItem1(1,"Caneta");
		ConstrutorItem1 item1 = new ConstrutorItem1(0.5,1,"Caneta");
		
		System.out.println("NOME\tCODIGO\tVALOR");
		System.out.print(item1.nome+"\t"+item1.codigo+"\t"+item1.valor);
	}
}
