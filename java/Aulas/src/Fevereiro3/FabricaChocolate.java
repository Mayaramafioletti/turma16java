package Fevereiro3;

public class FabricaChocolate extends Fabrica{
	
	private String freezer;
	private String misturador;
	private String materiaPrima;
	
	public FabricaChocolate(String nome, String endereço, int quantidadeDeFuncinários) {
		super(nome, endereço, quantidadeDeFuncinários);
	}
	
	public void ligaFreezer() {
		System.out.println("Ligar freezer!!");
	}
	
	public void desligarFreezer() {
		System.out.println("Desligar freezer!!");
	}

	public String getFreezer() {
		return freezer;
	}

	public void setFreezer(String freezer) {
		this.freezer = freezer;
	}

	public String getMisturador() {
		return misturador;
	}

	public void setMisturador(String misturador) {
		this.misturador = misturador;
	}

	public String getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	
	
}
