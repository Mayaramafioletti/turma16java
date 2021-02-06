package java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
	public static void main(String[] args) {
		Collection<String> estoque = new ArrayList<>();

		estoque.add("Caneta");
		estoque.add("Borracha");
		estoque.add("Caderno");
		estoque.add("Post it");
		estoque.add("Lápis");

		System.out.println("ESTOQUE\n " + estoque);

		estoque.remove("Caderno");
		System.out.println("ESTOQUE\n " + estoque);
		
		Collection<String> estoque2 = Arrays.asList("Lapiseira", "Estojo");
		estoque.addAll(estoque2);
		
		System.out.println("ESTOQUE ");
		for (String i:estoque)
		{
			System.out.println(i);
		}
	}

	
	
}


/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java
para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
