package Fevereiro3;

public class PrincialFabrica {
	public static void main(String[] args) /*throws InterruptedException*/ {
		
		Fabrica fab1 = new Fabrica("ChocoMay", "rua1", 1000);
		Fabrica fab2 = new Fabrica("MayShoes","rua2", 2000);
		
		System.out.println("NOME\t\tENDERE�O\tFUNCION�RIOS");
		System.out.println(fab1.getNome()+"\t"+fab1.getEndere�o()+"\t\t"+fab1.getQuantidadeDeFuncin�rios());
		System.out.println(fab2.getNome()+"\t"+fab2.getEndere�o()+"\t\t"+fab2.getQuantidadeDeFuncin�rios());
		
		fab1.setEndere�o("rua 12");
		fab2.setEndere�o("rua 51");
		//Thread.sleep(1500);
		System.out.println("\nEndere�os alterados");
		System.out.println("\nNOME\t\tENDERE�O\tFUNCION�RIOS");
		System.out.println(fab1.getNome()+"\t"+fab1.getEndere�o()+"\t\t"+fab1.getQuantidadeDeFuncin�rios());
		System.out.println(fab2.getNome()+"\t"+fab2.getEndere�o()+"\t\t"+fab2.getQuantidadeDeFuncin�rios());
		
	}
	
	
}
