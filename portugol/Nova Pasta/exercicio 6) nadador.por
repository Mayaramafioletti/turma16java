programa{
	funcao inicio(){
		inteiro idade

		escreva("Informe sua idade: ")
		leia(idade)

		se (idade>=5 e idade<=7){
			escreva("Você está na categoria Infantil A")
		}
		senao se(idade>=8 e idade<=11){
			escreva("Você está na categoria Infantil B")
		}
		senao se(idade>=12 e idade<=13){
			escreva("Você está na categoria Infantil C")
		}
		senao se(idade>=14 e idade<=17){
			escreva("Você está na categoria Infantil D")
		}
		senao se(idade>=18){
			escreva("Você está na categoria Adulto")
		}
		senao {
			escreva("Desculpe, mas ou foi informada a idade errada '"+idade+"' ou não está dentro da idade mínima de 5 anos")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */