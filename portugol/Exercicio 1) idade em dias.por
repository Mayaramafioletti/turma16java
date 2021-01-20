programa{
	funcao inicio(){
		inteiro a,m,d,resultado1,resultado2,resultado
		

		escreva ("Informe sua idade no formato anos,meses e dias \nAno:")
		leia (a)
		escreva ("Meses: ")
		leia (m)
		escreva ("Dias: ")
		leia (d)
				
		resultado1 = a*365
		resultado2 = m*30
		resultado = resultado1 + resultado2 + d

		escreva ("Sua idade em dias é: " + resultado)
		
	}
}

