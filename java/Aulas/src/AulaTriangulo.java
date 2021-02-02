import java.util.Locale;
import java.util.Scanner;

public class AulaTriangulo {
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		Scanner ler = new Scanner(System.in);
		double base1, base2, base3, altura1, altura2, altura3, area1, area2, area3;
		
		System.out.println("Digite a base do primeiro triangulo: ");
		base1 = ler.nextDouble();
		System.out.println("Digite a altura do primeiro triangulo: ");
		altura1 = ler.nextDouble();
		System.out.println("Digite a base do segundo triangulo: ");
		base2 = ler.nextDouble();
		System.out.println("Digite a altura do segundo triangulo: ");
		altura2 = ler.nextDouble();
		System.out.println("Digite a base do terceiro triangulo: ");
		base3 = ler.nextDouble();
		System.out.println("Digite a altura do terceiro triangulo: ");
		altura3 = ler.nextDouble();
		area1 = ((base1 * altura1) / 2 );
		area2 = ((base2 * altura2) / 2 );
		area3 = ((base3 * altura3) / 2 );
		
		if(area1>=area2 && area2>=area3 && area2>=area3) {
			System.out.println("A ordem crescente dos triângulos é "+area1+area2+area3);
		}
		if(area2>=area1 && area2>=area3 && area1>=area3) {
			System.out.println("A ordem crescente dos triângulos é "+area2+area1+area3);
		}
		if(area3>=area2 && area3>=area1 && area2>=area1) {
			System.out.println("A ordem crescente dos triângulos é "+area3+area2+area1);
		}
		if(area2>=area2 && area2>=area3 && area3>=area1) {
			System.out.println("A ordem crescente dos triângulos é "+area2+area3+area1);
		}
	}

}

