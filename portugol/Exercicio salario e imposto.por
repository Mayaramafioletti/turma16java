programa {
	inclua biblioteca Matematica --> mat
	funcao inicio (){
		cadeia nome, sexo
		real salario, imposto, salarioFinal
		
		escreva("Informe seu nome: ")
		leia(nome)
		escreva("Escolha se gostaria de ser tratado como Sr ou Sra ")  //o genero feminino-F ou masculino-M ")
		leia(sexo)
		escreva("Informe seu salário: ")
		leia(salario)
		

		se( sexo == "Sr" ou sexo == "sr"){
			se(salario<=1100){
				escreva ("Parabéns Sr."+nome+", você foi isento de pagar impostos")
			}
			senao se (salario>1100 e salario<=3500){
				imposto = 0.09*salario
				salarioFinal = salario-imposto
				escreva("Sr."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>3500 e salario<=10000){
				imposto = 0.15*salario
				salarioFinal = salario-imposto
				escreva("Sr."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>10000){
				imposto = 0.27*salario
				salarioFinal = salario-imposto
				escreva("Sr."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
		}
		senao se( sexo == "Sra" ou sexo == "sra"){
			se(salario<=1100){
				escreva ("Parabéns Sra."+nome+", você foi isenta de pagar impostos")
			}
			senao se (salario>1100 e salario<=3500){
				imposto = 0.09*salario
				salarioFinal = salario-imposto
				escreva("Sra."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>3500 e salario<=10000){
				imposto = 0.15*salario
				salarioFinal = salario-imposto
				escreva("Sra."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>10000){
				imposto = 0.27*salario
				salarioFinal = salario-imposto
				escreva("Sra."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			
		}
		senao{
			se(salario<=1100){
				escreva ("Parabéns Srx."+nome+", você foi isentx de pagar impostos")
			}
			senao se (salario>1100 e salario<=3500){
				imposto = 0.09*salario
				salarioFinal = salario-imposto
				escreva("Srx."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>3500 e salario<=10000){
				imposto = 0.15*salario
				salarioFinal = salario-imposto
				escreva("Srx."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			senao se (salario>10000){
				imposto = 0.27*salario
				salarioFinal = salario-imposto
				escreva("Srx."+nome+", você pagará R$"+mat.arredondar(imposto,2)+" de imposto e seu salario ficará R$"+mat.arredondar(salarioFinal,2))
			}
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */