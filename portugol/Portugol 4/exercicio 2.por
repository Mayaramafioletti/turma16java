programa{
	
	inclua biblioteca Util
	
	funcao inicio(){
		const inteiro TAMANHO = 10    //colocar o tamanho do vetor como constante
		inteiro valor[TAMANHO], maiorValor=0, contador=0		
		real media = 0.0, total=0.0
		
		
		para(inteiro i=0;i<TAMANHO;i++){
			
			valor[i]=Util.sorteia(1, 6)
			/*escreva("Informe o valor mostrado no dado no ", i+1,"º lançamento: ")
			leia(valor[i])*/

			total = total + valor[i] //totalizador total +=valor[i]	
			media = total/TAMANHO
				se(valor[i]>=maiorValor){
					se(maiorValor == valor[i]){
						contador++
					}
					senao{
						contador =1 //reinicialização. O senao existe pois se o numero maior aparecer por ultimo eele precisa recomeçar
					}
					maiorValor=valor[i]
				}
			}
		para(inteiro i=0;i<TAMANHO;i++){
			escreva("O ",i+1, "º lançamento apareceu ", valor[i], "\n") 
			}
		escreva("A média é ",media, "\n")
		escreva("O maior valor é ",maiorValor," e ele aparece ", contador," veze(s)")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */