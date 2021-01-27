programa {
	
	funcao inicio() {
		inteiro pagamento
		real preco, total
		
		escreva("Informe o valor na etiqueta do profduto: ")
		leia(preco)
		escreva("Escolha a forma de pagamento: ")
		escreva("\n1- À vista com dinheiro ou cheque")
		escreva("\n2- À vista com cartão")
		escreva("\n3- Em 2 vezes sem juros")
		escreva("\n4- Em 3 vezes com 10% de juros\n")
		leia(pagamento)

		se(pagamento == 1){
			total = preco*0.8
			escreva("Com essa forma de pagamento você teve 20% de desconto, então pagará R$", total,"\nObrigada. Volte sempre!")
		}
		senao se (pagamento == 2){
			total = preco*0.85
			escreva("Com essa forma de pagamento você teve 15% de desconto, então pagará R$", total,"\nObrigada. Volte sempre!")
		}
		senao se (pagamento == 3){
			escreva("Com essa forma de pagamento você não teve desconto, então pagará R$", preco,"\nObrigada. Volte sempre!")
		}
		senao se (pagamento == 4){
			total = preco*1.1
			escreva("Com essa forma de pagamento você teve 10% de juros, então pagará R$", total,"\nObrigada. Volte sempre!")
		}
		senao{
			escreva("Opção invalida")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1022; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */