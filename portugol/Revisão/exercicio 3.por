programa{
	
	funcao inicio(){
		
		inteiro numero =0
		inteiro contador1 =0, contador2 = 0, contador3=0, contador4=0

		faca{
		escreva("Informe uma numero: ")
		leia(numero)
			se(numero>=0 e numero<=25){
				contador1++
			}
			senao se(numero>=26 e numero<=50){
				contador2++
			}
			senao se(numero>=51 e numero<=75){
				contador3++
			}
			senao se(numero>=76 e numero <=100){
				contador4++
			}
		}enquanto(numero>0)
		escreva("A quantidade de números entre 0-25 é ",contador1)
		escreva("\nA quantidade de números entre 26-50 é ",contador2)
		escreva("\nA quantidade de números entre 51-75 é ",contador3)
		escreva("\nA quantidade de números entre 76-100 é ",contador4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */