package exercicios;

public class PessoaFisica extends Proprietario {
	private String cpf;
	
	public PessoaFisica() {
		super();
		this.cpf = "";
	}
	
	public PessoaFisica(String nome, String telefone, String cpf) {
		super(nome, telefone);
		this.cpf = cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String toString() {
		return super.toString() + "\nCPF do Propriet�rio: " + getCpf();
	}
	
	

}
