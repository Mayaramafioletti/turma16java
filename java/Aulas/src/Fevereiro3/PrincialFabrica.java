package Fevereiro3;

public class PrincialFabrica {
	public static void main(String[] args) /*throws InterruptedException*/ {
		
		Fabrica fab1 = new Fabrica("ChocoMay", "rua1", 1000);
		Fabrica fab2 = new Fabrica("MayShoes","rua2", 2000);
		
		System.out.println("NOME\t\tENDEREÇO\tFUNCIONÁRIOS");
		System.out.println(fab1.getNome()+"\t"+fab1.getEndereço()+"\t\t"+fab1.getQuantidadeDeFuncinários());
		System.out.println(fab2.getNome()+"\t"+fab2.getEndereço()+"\t\t"+fab2.getQuantidadeDeFuncinários());
		
		fab1.setEndereço("rua 12");
		fab2.setEndereço("rua 51");
		//Thread.sleep(1500);
		System.out.println("\nEndereços alterados");
		System.out.println("\nNOME\t\tENDEREÇO\tFUNCIONÁRIOS");
		System.out.println(fab1.getNome()+"\t"+fab1.getEndereço()+"\t\t"+fab1.getQuantidadeDeFuncinários());
		System.out.println(fab2.getNome()+"\t"+fab2.getEndereço()+"\t\t"+fab2.getQuantidadeDeFuncinários());
		
	}
	
	
}
