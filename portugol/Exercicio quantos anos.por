programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter sexo
		inteiro ano, ano2, idade
		
		escreva ("Informe seu nome e sobrenome: ")
		leia(nome)
		escreva("Escolha a opção M ou F para definir seu sexo: ")
		leia(sexo)
		escreva("Informe o seu ano de nascimento: ")
		leia(ano)
		escreva("Informe o ano em que estamos: ")
		leia(ano2)

		idade = ano2-ano

		escreva ("Bom dia " + nome + " sua idade é "+idade+" anos")
		//pedi ao usuario nome, sexo (M/F), ano de nascimento (aaaa)
		//escreva a idade aproximada da pessoa
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */