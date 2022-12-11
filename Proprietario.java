package exercicios;

public class Proprietario {
	private String nome;
	private String telefone;
	
	public Proprietario() {
		this.nome = "";
		this.telefone = "";
	}
	
	public Proprietario(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String toString() {
		return "\nNome do Propriet�rio: " + getNome() +
		"\nTelefone do Propriet�rio: " + getTelefone();
	}

}
