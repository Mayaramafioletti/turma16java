programa{
	inclua biblioteca Util
	funcao inicio(){
		cadeia produtos[] = {"Cofrinho","Chaveiro","Caneta   ","Capinha   ","Cestinha","Abajour   ","Quadro   ","Cabide   ","Lápis   ","Borracha"}
		cadeia codigos[] = {"M1","M2","M3","M4","M5","M6","M7","M8","M9","M10"}, codigo
		inteiro estoque[] = {10,10,10,10,10,10,10,10,10,10}, quantidade, i
		real precos[] = {9.9, 0.8, 0.5, 8.9, 14.9, 18.9, 7.9, 4.9, 0.5, 0.5}
		

		escreva("Bem vinde a MENTIRA.\nA loja de R$1.99! Onde nenhum produto custa R$1.99\n")
		Util.aguarde(1000)
		limpa()
		
		escreva("CÓDIGO\tPRODUTOS\tESTOQUE\tVALOR POR UNID")
		para(i=0; i<10; i++){
			escreva("\n")
			escreva(codigos[i]+"\t"+produtos[i]+"\t"+estoque[i]+"\t"+precos[i])
		}
		escreva("\nEscolha um produto digitando seu código: ")
		leia(codigo)
		escreva("Seu produto é "+produtos[i+1])
		
		escreva("Qual a quantidade?")
		leia(quantidade)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 830; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */