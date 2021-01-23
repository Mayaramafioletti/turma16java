programa{
	funcao inicio(){
		cadeia nomeAluno[4]
		inteiro notaAluno[4]/*={10,8,10,9}
		nomeAluno[0]="Candido"
		nomeAluno[1]="Athos"
		nomeAluno[2]="Andressa"
		nomeAluno[3]="Gisele"*/
		 
		para(inteiro x=0;x<4;x++){
		escreva("Qual é seu nome? ")
			leia(nomeAluno[x])
			escreva("Qual é sua nota? ")
			leia(notaAluno[x])
		 }
		 limpa()
		 
		para(inteiro x=0;x<4;x++){
		escreva("\nO nome do aluno é ", nomeAluno[x], " e sua nota é ",notaAluno[x])
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */