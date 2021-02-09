package ChocoByte;
import java.util.Map;
import java.util.TreeMap;

public class Carrinho extends Produto {
	 private double valorTotal;
	    private static Map<Integer, Produto> carrinho = new TreeMap<Integer, Produto>();


	    public Carrinho() {

	    }


	    public Carrinho(String nome, double valor, int estoque, int cod) {
	        super(nome, valor, estoque, cod);
	    }


	    public void adicionarCarrinho(int quantidade, int codigo) {

	        if (this.carrinho.containsKey(codigo)) {

	            int estoque = Produto.getListaProdutos().get(codigo).getEstoque();
	            int resultado = estoque - quantidade;
	            Produto.getListaProdutos().get(codigo).setEstoque(resultado);

	        }

	        this.carrinho.put(codigo, Produto.getListaProdutos().get(codigo));  // Copiando para Carrinho
	        this.carrinho.get(codigo).setCompras(this.carrinho.get(codigo).getCompras() + quantidade); // Setando Compras
	        this.valorTotal += Produto.getListaProdutos().get(codigo).getValor() * quantidade;
	        int estoque = Produto.getListaProdutos().get(codigo).getEstoque();
	        int resultado = estoque - quantidade;
	        Produto.getListaProdutos().get(codigo).setEstoque(resultado);


	    }


	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }

	    public Map<Integer, Produto> getCarrinho() {
	        return carrinho;
	    }

	    public void setCarrinho(Map<Integer, Produto> carrinho) {
	        this.carrinho = carrinho;
	    }


	    public double carrinhoAvissta() {
	        return this.valorTotal * 0.9;
	    }

	    public double carrinho2x() {
	        return (this.valorTotal * 1.1) / 2;
	    }

	    public double carrinho3x() {
	        return (this.valorTotal * 1.15) / 3;
	    }

	    public double imposto() {
	        return this.valorTotal * 0.1;
	    }
}
