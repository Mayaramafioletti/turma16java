package ChocoByte;

import java.util.Map;
import java.util.TreeMap;

public class Produto {
	 private String nome;
	    private double valor;
	    private int estoque;
	    private int compras;
	    protected int cod;
	    private static Map<Integer, Produto> listaProdutos = new TreeMap<Integer, Produto>();



	    public static Map<Integer, Produto> getListaProdutos() {
	        return listaProdutos;
	    }

	    public Produto() {

	    }

	    public Produto(String nome, double valor, int estoque, int cod) {
	        this.nome = nome;
	        this.valor = valor;
	        this.estoque = estoque;
	        this.cod = cod;

	    }

	    public void repoeEstoque() {

	        inicio();

	    }

	    public void cadastrarProduto(String nome, double valor, int estoque, int cod) {

	        Produto.listaProdutos.put(cod, new Produto(nome, valor, estoque, cod));

	    }

	    public void inicio() {

	        cadastrarProduto("Ao leite   ", 14.90, 10, 1);
	        cadastrarProduto("Branco     ", 15.90, 10, 2);
	        cadastrarProduto("Airado     ", 15.90, 10, 3);
	        cadastrarProduto("Meio Amargo", 18.50, 10, 4);
	        cadastrarProduto("Amargo     ", 19.90, 10, 5);
	        cadastrarProduto("Avelã      ", 19.90, 10, 6);
	        cadastrarProduto("Trufado    ", 22.00, 10, 7);
	        cadastrarProduto("Sem lactose", 23.90, 10, 8);
	        cadastrarProduto("Chocowhey  ", 23.90, 10, 9);
	        cadastrarProduto("Vegan      ", 23.90, 10, 10);
	    }


	    @Override
	    public String toString() {
	        return "\t" + nome + "\t\t" + valor + "\t" + estoque + "\n";
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }

	    public int getEstoque() {
	        return estoque;
	    }

	    public void setEstoque(int estoque) {
	        this.estoque = estoque;
	    }

	    public int getCod() {
	        return cod;
	    }

	    public void setCod(int cod) {
	        this.cod = cod;
	    }

	    public int getCompras() {
	        return compras;
	    }

	    public void setCompras(int compras) {
	        this.compras = compras;
	    }
}
