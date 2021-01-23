programa
{
	
	funcao inicio()
	{
		cadeia agenda[24][31] //0-23  0-30
		cadeia nome
		inteiro dia=0, hora=0
		caracter opcao='1'
		
		 faca{
		//aqui vai ter inicio o loop
		escreva ("Digite seu nome ")
		leia (nome)
		enquanto(opcao =='1'){
		escreva("escolha um dia para cadastro [1/31]: ")
		leia(dia)
		se (dia<=0 ou dia>31){ //enquanto
			escreva("\nData informada incorreta, escolha umadata entre 1 e 31")
			leia(dia)//saida do loop
		}
		dia-= 1 //pois no vetor será um numero a menos, evita estouro da matriz
		escreva("Selecione a hora do evente[0-23]: ")
		leia(hora)
		se(hora<0 ou hora>23){
			escreva("\nHora informada incorreta, escolha entre 0 e 23h: ")
			leia(hora)
		}
		escreva("\nInforme a tarefa neta data e hora ")
		leia(agenda[hora][dia])
		escreva("Deseja continuar 1-sim ou 2-nao ")
		leia(opcao)
		/*se (opcao=='2'`){ igual ao que foi colocado para o loop
			pare
		}*/
		 }
		 }enquanto (opcao=='1')

		 para(inteiro coluna=0;coluna<31;coluna++){
		 	para(inteiro linha=0; linha<24;linha++){
		 		
		 		se(agenda [linha][coluna] != ""){
		 		escreva("Dia ", coluna+1)
		 		escreva("\nAs ",linha, " horas: ", agenda[linha][coluna],"\n")
		 	}
		 }
		 }
		 escreva("\n")
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */