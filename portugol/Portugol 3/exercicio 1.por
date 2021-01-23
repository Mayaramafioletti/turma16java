programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real salario = 0.00, mediaSalario=0.00, mediaFilho=0.00, maiorSalario=0.00, porcentagemSalario=0.00,contador=0.0, totalSalario=0.00
		inteiro filho = 0, totalFilho=0 
		const inteiro habitantes = 5

		para(inteiro giro=1; giro<=habitantes;giro++){
			escreva(giro,"º habitante")
			escreva("\nInforme seu salário: ")
			leia(salario)
			escreva("Informe quantos filhos: ")
			leia(filho)

			totalSalario = totalSalario + salario //totalizador   totalSalario+=salario
			totalFilho = totalFilho + filho //totalizador

			se(salario>maiorSalario){
				maiorSalario = salario
			}
			se(salario<=100){
				contador++ //contador +=1 ou contador = contador + 1
				porcentagemSalario=((contador/habitantes)*100)
			}
		}
		limpa()
		
		mediaFilho = totalFilho/habitantes
		mediaSalario = totalSalario/habitantes

		escreva("A média de filhos dos habitantes é: ",mediaFilho)
		escreva("\nA média de salário dos habitantes é: R$",mat.arredondar(mediaSalario, 2))
		escreva("\nEntre todos os salários o maior é: R$",maiorSalario)
		escreva("\n",porcentagemSalario,"% dos habitantes têm o salário abaixo de R$100.00")
		escreva("\nObrigada pela atenção!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */