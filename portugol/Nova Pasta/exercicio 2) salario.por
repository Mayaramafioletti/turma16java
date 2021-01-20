programa{
	
	funcao inicio(){
		inteiro numeroHoras, excesso
		real salario, salarioE
		caracter codigo

		escreva("Informe o codigo do trabalhador ")
		leia(codigo)
		escreva("Quantas horas você trabalhou?\n")
		leia(numeroHoras)

		excesso = numeroHoras-50

		se(excesso>0){
			salario = 10.00*50 + 20.00*excesso
			salarioE= 20.00*excesso
			escreva("Seu salário total é de R$"+salario+" sendo R$"+salarioE+" seu excedente")
		}
		senao{
			salario = 10.00*numeroHoras
			escreva("Seu salário total é de R$"+salario+" sendo R$0.00 seu excedente")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */