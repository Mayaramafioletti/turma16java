package ChocoByte;

public class Cliente {
	  private String nome;
	    private String sexo;

	    public Cliente(String nome) {
	        this.nome = nome;
	    }

	    public void sexo(int opcao) {
	        if (opcao == 1) {
	            this.sexo = "Sr";
	        }
	        if (opcao == 2) {
	            this.sexo = "Sra";
	        }
	        if (opcao == 3) {
	            this.sexo = "Srx";
	        }
	    }


	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }
}
