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
		System.out.printf("Bom dia! \nInforme o nome do %d� habitante: ", x+1);
		nome = ler.next();
		System.out.print("Digite o numero de filhos deste habitante: ");
		filhos = ler.nextInt();
		System.out.print("Digite o sal�rio deste habitante: ");
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
	System.out.println("A m�dia de sal�rio � "+totalSalario/HABITANTES);
	System.out.println("A m�dia de filhos � "+totalFilhos/HABITANTES);
	System.out.println("O maior sal�rio � "+maiorSalario);
	System.out.println("A porcentagem de pessoas com o sal�rio acima de R$100.00 �  "+(salario100/HABITANTES)*100+"%");
}
}
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados
 *  sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.
*/