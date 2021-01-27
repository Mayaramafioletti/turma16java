programa{
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
		real peso, altura, IMC 
		
		escreva("Informe sua altura: ")
		leia(altura)
		escreva("Informe seu peso: ")
		leia(peso)

		IMC = peso/mat.potencia(altura,2.0)
		escreva(IMC,"\n")
		
		se(IMC<18.5){
			escreva("Você está abaixo do peso")
		}
		senao se(IMC>18.5 e IMC<25){
			escreva("Seu peso está normal")
		}
		senao se(IMC>25 e IMC<30){
			escreva("Você está acima do peso")
		}
		senao se(IMC>30){
			escreva("Você está obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */