programa{
	
	funcao inicio(){

		real vetor[5], numero = 0.0
		inteiro codigo, i  

		para(i=0; i<5; i++){
			escreva("Informe um número? ")
			leia(vetor[i])
		}
		escreva("Informe um código 0,1 ou 2 ")
		leia(codigo)
		
		se(codigo == 1){
			escreva("Esse código irá te mostrar o vetor da forma direta \n")
			para( i=0; i<5; i++){
			escreva(vetor[i],"  ")
			}
		}
		senao se(codigo == 2){
			escreva("Esse código irá te mostrar o vetor da forma inversa\n")
			para(i=4; i>=0; i--){
				escreva(vetor[i],"  ")
			}
		}
		senao se (codigo == 0){ 
		}
		senao{
			escreva("Código invalido!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */