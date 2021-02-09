package ExerciciosAula;
import java.util.Scanner;

public class Lacos {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String nome;
	double salario=0.0, totalSalario=0.0, maiorSalario=0.0, salario100=0.0;
	int filhos=0, totalFilhos=0;
	final int HABITANTES = 5;
	
	for(int x=0; x<HABITANTES; x++) {
		System.out.printf("Bom dia! \nInforme o nome do %dº habitante: ", x+1);
		nome = ler.next();
		System.out.print("Digite o numero de filhos deste habitante: ");
		filhos = ler.nextInt();
		System.out.print("Digite o salário deste habitante: ");
		salario = ler.nextDouble();
		
		totalSalario += salario; 
		totalFilhos += filhos;
		if (salario > maiorSalario)
		{
			maiorSalario = salario;
		}
		if (salario <= 100)
		{
			salario100++; 
			
		}
	}
	System.out.println("A média de salário é "+totalSalario/HABITANTES);
	System.out.println("A média de filhos é "+totalFilhos/HABITANTES);
	System.out.println("O maior salário é "+maiorSalario);
	System.out.println("A porcentagem de pessoas com o salário acima de R$100.00 é  "+(salario100/HABITANTES)*100+"%");
}
}
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados
 *  sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
*/