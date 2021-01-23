programa{
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		real base, altura, area

		escreva("Informe a medida da base e da altura do seu trinângulo ")
		leia(base,altura)

		se (base>0 e altura>0){
			area = (base*altura)/2.00
			escreva("A área do seu triângulo é: ",mat.arredondar(area,2))
		}
		senao{
			escreva ("Valores incorretos! Têm que ser maiores que 0")
		}

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */