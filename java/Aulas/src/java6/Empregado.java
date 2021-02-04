package java6;

public class Empregado extends PessoaSuperClasse{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	//CONSTRUTOR
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	//SETORES E MODIFICADORES
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public void calcularSalario(double salario) {
		char c='%';
		salario = (salarioBase - (salarioBase*(imposto/100)));
		System.out.printf("O imposto foi %.0f%c e com isso seu salario é %.2f", imposto,c, salario);
	}
}


/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância
 *  da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, 
 *  os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem 
 *  retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e 
 *  um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. 
 */