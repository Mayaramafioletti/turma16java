package ChocoByte;

import java.util.Scanner;

public class MainChoco {
	 public static int validacaoOpcaoSN(){

	        Scanner scan = new Scanner(System.in);
	        int result;

	        try {
	            System.out.print("\nResposta: ");
	            result = scan.nextInt();

	            if(result!= 1 && result!= 2 ){

	                System.out.print("Operação Inválida, digite [1]-[SIM] / [2]-[NÃO].: ");
	            }

	        }catch(java.util.InputMismatchException erro) {
	            System.out.print("Ação inválida. Digite um numero Inteiro dentre as opções:  ");
	            System.out.print("[1]-[SIM] / [2]-[NÃO].");
	            result = 0;
	        }

	        return result;
	    }
	    public static int validacaoSexo(){

	        Scanner scan2 = new Scanner(System.in);
	        int result;

	        try {
	            System.out.print("\nResposta: ");
	            result = scan2.nextInt();

	            if(result!= 1 && result!= 2 && result!= 3){

	                System.out.print("Operação Inválida, digite [1]-Masculino / [2]-Feminino / [3]-Outro.: ");
	            }

	        }catch(java.util.InputMismatchException erro) {
	            System.out.print("Ação inválida. Digite um numero Inteiro dentre as opções:  ");
	            System.out.print("[1]-Masculino / [2]-Feminino / [3]-Outro.");
	            result = 0;
	        }

	        return result;
	    }
	    public static int validaNumero(){

	        Scanner scan3 = new Scanner(System.in);
	        int result;

	        try {

	            result = scan3.nextInt();


	        }catch(java.util.InputMismatchException erro) {


	            result = 0;
	        }

	        return result;
	    }
	    public static int validacaoPagamento(){

	        Scanner scan = new Scanner(System.in);
	        int result;

	        try {
	            System.out.print("\nResposta: ");
	            result = scan.nextInt();

	            if(result!= 1 && result!= 2 && result!= 3 && result!= 4 ){

	                System.out.print("Operação Inválida, digite [1] ao [4] .: ");
	            }

	        }catch(java.util.InputMismatchException erro) {
	            System.out.print("Ação inválida. Digite um numero Inteiro dentre as opções: 1 ao 4  ");
	            System.out.print("1 ao 4");
	            result = 0;
	        }

	        return result;
	    }


	    public static void main(String[] args) {
	        String i = "%", nome;
	        int codigo, quantidade, opcao = 0, sexo;
	        Scanner ler = new Scanner(System.in);
	        Carrinho carrinho = new Carrinho();
	        Produto novo = new Produto();


	        novo.inicio();

	        do {

	            System.out.print("Digite seu nome: ");
	            nome = ler.nextLine();


	            Cliente novoCliente = new Cliente(nome);

	            carrinho.getCarrinho().clear();
	            carrinho.setValorTotal(0);
	            for (Produto key : Produto.getListaProdutos().values()) {
	                key.setCompras(0);
	            }

	            System.out.print("Qual seu sexo?");
	            System.out.println("\nDigite 1 - Masculino");
	            System.out.println("Digite 2 - Feminino");
	            System.out.println("Digite 3 - Outros");
	            do{
	                sexo = validacaoSexo();
	            }while(sexo != 1 && sexo != 2 && sexo != 3);


	            novoCliente.sexo(sexo);


	            do {


	                System.out.printf("\nBem vindo %s %s ao ChocoByte", novoCliente.getSexo(), novoCliente.getNome());
	                System.out.print("\n--------------------------------");
	                do {
	                    System.out.println("\nCod\tProduto\t\tValor\tEstoque");


	                    for (Produto key : Produto.getListaProdutos().values()) {
	                        System.out.println(key.getCod() + "\t" + key.getNome() + "\t" + key.getValor() + "\t" + key.getEstoque());
	                    }

	                    System.out.print("\nInsira o Codigo do produto que deseja comprar:");
	                    codigo = validaNumero();

	                    if(Produto.getListaProdutos().containsKey(codigo) != true) {
	                        System.out.println("Codigo invalido");
	                    }

	                }while(Produto.getListaProdutos().containsKey(codigo) != true);



	                do {
	                    do {
	                        System.out.print("\nDigite a quantidade que deseja comprar:");
	                        quantidade = ler.nextInt();
	                        if (quantidade == 0){
	                            System.out.println("Quandidade invalida. Digite quantidade acima de Zero");

	                        }

	                    }while(quantidade == 0);


	                    if (quantidade <= Produto.getListaProdutos().get(codigo).getEstoque()) {

	                        System.out.printf(
	                                "\nVoce selecionou %d %s. Deseja adiconar ao Carrinho?\nDigite 1 - SIM\nDigite 2 - NÃO:",
	                                quantidade, Produto.getListaProdutos().get(codigo).getNome());
	                        do {
	                            opcao = validacaoOpcaoSN();

	                        }while(opcao!=1 && opcao!= 2);


	                        if (opcao == 1) {

	                            carrinho.adicionarCarrinho(quantidade, codigo);
	                            break;

	                        } else {

	                            break;
	                        }

	                    } else {

	                        System.out.print("\nQuantidade insufieciente no estoque");
	                        System.out.printf("\nQuandidade disponivel: %d", Produto.getListaProdutos().get(codigo).getEstoque());

	                    }

	                } while (quantidade > novo.getEstoque());

	                System.out.print("\nDigite 1 - Comprar mais produtos");
	                System.out.print("\nDigite 2 - Finalizar Comprar");
	                do{
	                    opcao = validacaoOpcaoSN();

	                }while (opcao != 1 && opcao != 2 );



	            } while (opcao == 1);
	            System.out.println("---------------------------------CARRINHO DE COMPRAS---------------------------------");

	            System.out.println("-------------------------------------------------------------------------------------");

	            System.out.println("\nCod\tProduto\t\tValor\tUnidades");


	            for (Produto key : carrinho.getCarrinho().values()) {
	                System.out.println(key.getCod() + "\t" + key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
	            }

	            System.out.printf("\nO valor total da sua compra é R$%.2f", carrinho.getValorTotal());
	            System.out.println("\n-------------------------------------------------------------------------------------");


	            System.out.println("\nFormas  de Pagamento");
	            System.out.printf("Digite 1 - A VISTA    - 10%s DESCONTO     - \tR$ %.2f\n", i, carrinho.carrinhoAvissta());
	            System.out.printf("Digite 2 - CREDITO 1X - SEM DESCONTO     - \tR$ %.2f\n", carrinho.getValorTotal());
	            System.out.printf("Digite 3 - CREDITO 2X - 10%s JUROS        - \tR$ %.2f\n", i, (carrinho.getValorTotal() * 1.1));
	            System.out.printf("Digite 4 - CREDITO 3X - 15%s JUROS        - \tR$ %.2f\n", i, (carrinho.getValorTotal() * 1.15));
	            System.out.print("\nSelecione uma Opção de Pagamento [1-4]: ");
	            do {
	                opcao = validacaoPagamento();

	            }while (opcao!= 1 && opcao!= 2 && opcao!= 3 && opcao!= 4);


	            if (opcao == 1) {
	                System.out.println("                           CUPOM FISCAL   ");
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
	                System.out.println("Produto\t\tValor\tUnidades");
	                for (Produto key : carrinho.getCarrinho().values()) {
	                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
	                }
	                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
	                System.out.printf("Valor a Vista  \t\tR$%.2f\n", carrinho.carrinhoAvissta());
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("09/02/2021"); //data
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.printf("\nConsumidor %s", novoCliente.getNome() + "\n");
	                System.out.println("-------------------------------------------------------------------------------------");

	            }

	            if (opcao == 2) {
	                System.out.println("                           CUPOM FISCAL   ");
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
	                System.out.println("Produto\t\tValor\tUnidades");
	                for (Produto key : carrinho.getCarrinho().values()) {
	                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
	                }
	                System.out.printf("Valor 1/1 \t\tR$%.2f\n", carrinho.getValorTotal());
	                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("09/02/2021"); //data
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.printf("\nConsumidor %s", novoCliente.getNome() + "\n");
	                System.out.println("\n-------------------------------------------------------------------------------------");

	            }
	            if (opcao == 3) {
	                System.out.println("                           CUPOM FISCAL   ");
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
	                System.out.println("Produto\t\tValor\tUnidades");
	                for (Produto key : carrinho.getCarrinho().values()) {
	                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
	                }
	                System.out.printf("Valor Pago 1/2 \t\tR$%.2f\n", carrinho.carrinho2x());
	                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("09/02/2021"); //data
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.printf("\nConsumidor %s:", novoCliente.getNome() + "\n");
	                System.out.println("\n-------------------------------------------------------------------------------------");

	            }
	            if (opcao == 4) {
	                System.out.println("                           CUPOM FISCAL   ");
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("ChocoByte LTDA \n\nRua dos desolados Generation \nCNPJ:53.724.027/0001-93\n");
	                System.out.println("Produto\t\tValor\tUnidades");
	                for (Produto key : carrinho.getCarrinho().values()) {
	                    System.out.println(key.getNome() + "\t" + key.getValor() + "\t" + key.getCompras());
	                }
	                System.out.printf("Valor Pago 1/3 \t\tR$%.2f\n", carrinho.carrinho3x());
	                System.out.printf("Valor Imposto \t\tR$%.2f\n", carrinho.imposto());
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.println("09/02/2021"); //data
	                System.out.println("-------------------------------------------------------------------------------------");
	                System.out.printf("Consumidor %s", novoCliente.getNome() + "\n");
	                System.out.println("-------------------------------------------------------------------------------------");

	            }


	            System.out.print("Novo Cliente [1-SIM / 2-SAIR]: ");
	            do {

	                opcao = validacaoOpcaoSN();

	            }while(opcao != 1 && opcao != 2);



	            int contador = 0;
	            for (Produto key : Produto.getListaProdutos().values()) {

	                if (key.getEstoque() == 0) {
	                    contador++;


	                }

	            }
	            if (contador == 10) {
	                novo.repoeEstoque();
	                System.out.println("Estoque renovado");
	            }

	        } while (opcao == 1);


	        System.out.println("Fim do Programa");


	    }
}
