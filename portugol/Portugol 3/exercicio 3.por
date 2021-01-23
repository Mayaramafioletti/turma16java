programa {
	funcao inicio (){
		real n=0.0, soma=0.0, media=0.0, contador=0.0
		
			escreva("Informe um número: ")
			leia(n)

		enquanto (n>0){
			se(n>=0){
			contador++
			soma = soma+n
			media =soma/contador*1.0

			escreva("Informe um número: ")
			leia(n)
			}
		}
		
		limpa()
		escreva ("A soma dos valores fornecidos é ",soma,"\nA média dos valores fornecidos é ",media,"\nVocê informou ",contador," números")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */