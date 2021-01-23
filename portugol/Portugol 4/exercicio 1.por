programa{
	funcao inicio(){
		real valor[5], maiorValor=0.00

		para(inteiro i=0;i<5;i++){
			escreva("Digite a ", i+1, "º pontuação ")
			leia(valor[i])
			se(valor[i]>maiorValor){
				maiorValor=valor[i]
			}
		}
		limpa()
		para(inteiro i=0;i<5;i++){
			escreva("A ", i+1, "º pontuação vale ",valor[i],"\n")
		}
		escreva("A maior pontuação é ", maiorValor)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */