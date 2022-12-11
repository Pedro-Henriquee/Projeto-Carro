package exercicios;

public class PessoaJuridica extends Proprietario{
private String cnpj;
	
	public PessoaJuridica() {
		super();
		this.cnpj = "";
	}
	
	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public String toString() {
		return super.toString() + "\nCNPJ do Propriet�rio: " + getCnpj();
	}
}