package java3;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		final int PESSOAS=10;
		int x=0, idade=0, sexo=0, opcao=0, contadorPessoaCalma=0, contadorMulherNervosa=0, contadorHomemAgressivo=0, contadorOutroCalmo=0, contadorNervosa40=0, contadorCalmo18=0;
		Scanner ler = new Scanner(System.in);
		
		while(x<=PESSOAS ) {
			x++;
			System.out.print("Qual é sua idade? ");
			idade = ler.nextInt();
			System.out.print("Informe o genêro que você se identifica 1-feminino, 2-masculino, 3-outros? ");
			sexo = ler.nextInt();
			System.out.print("Escolha a opção que você mais se identifica: 1 - você é calmo, 2 - nervosa, 3-agressivo ");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				contadorPessoaCalma++;
			}
			if(opcao==2 && sexo==1) {
				contadorMulherNervosa++;
			}
			if(opcao==3 && sexo==2) {
				contadorHomemAgressivo++;
			}
			if(opcao==1 && sexo==3){
				contadorOutroCalmo++;
			}
			if(opcao==2 && idade>40) {
				contadorNervosa40++;
			}
			if(opcao==1 && idade<18) {
				contadorCalmo18++;
			}
		}
		System.out.printf("%d pessoas calmas \n%d mulheres nervosas\n%d homens agressivos\n%d outros calmos\n%d pessoas nervosas acima de 40 anos\n%d pessoas calmas com menos de 18 anos ",contadorPessoaCalma, contadorMulherNervosa, contadorHomemAgressivo, contadorOutroCalmo, contadorNervosa40, contadorCalmo18);
	}
}


/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma
 *  região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino /
 *   3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era 
 *   agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
 *    (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/
