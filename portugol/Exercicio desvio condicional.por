programa{
	
	funcao inicio(){

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

			se (sexo == 'M' ou sexo == 'm'){
				se(idade<18){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerado jovem")
				}
				senao se(idade<60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerado adulto")
				}
				senao se(idade>=60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerado idoso")
				}
			}
			senao se (sexo == 'F' ou sexo == 'f'){
				se(idade<18){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerada jovem")
				}
				senao se(idade<60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerada adulta")
				}
				senao se(idade>=60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é considerada idosa")
				}
			}
			senao {
				se(idade<18){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é consideradx jovem")
				}
				senao se(idade<60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é consideradx adultx")
				}
				senao se(idade>=60){
				escreva ("Bom dia " + nome + " sua idade é "+idade+" anos e você é consideradx idosx")
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 756; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */