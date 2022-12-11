package exercicios;

public class Carro {
	
	private String modelo;
	private String placa;
	private String valor;
	private String hora;
	private String horaD;
	private String dia;
	private String diaD;
	private Proprietario oProprietario = new Proprietario();
	
	public Carro() {
		this.modelo = "";
		this.placa = "";
		this.valor = "";
		this.dia = "";
		this.diaD = "";
		this.hora = "";
		this.horaD = "";
	}
	
	public Carro(String modelo, String placa, String valor, String hora, String horaD, String dia, String diaD, PessoaFisica aPessoaFisica) {
		this.modelo = modelo;
		this.placa = placa;
		this.valor = valor;
		this.hora = hora;
		this.horaD = hora;
		this.dia = dia;
		this.diaD = diaD;
		this.oProprietario = new PessoaFisica();
		this.oProprietario = aPessoaFisica;
	}
	
	public Carro(String modelo, String placa, String valor,  String hora, String horaD, String dia, String diaD, PessoaJuridica aPessoaJuridica) {
		this.modelo = modelo;
		this.placa = placa;
		this.valor = valor;
		this.hora = hora;
		this.horaD = hora;
		this.dia = dia;
		this.diaD = diaD;
		this.oProprietario = new PessoaJuridica();
		this.oProprietario = aPessoaJuridica;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setValor (String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	public void setHora (String hora) {
		this.hora = hora;
	}
	
	public String getHora() {
		return this.hora;
	}
	
	public void setHoraD (String horaD) {
		this.horaD = horaD;
	}
	
	public String getHoraD() {
		return this.horaD;
	}
	
	public void setDia (String dia) {
		this.dia = dia;
	}
	
	public String getDia() {
		return this.dia;
	}
	
	public void setDiaD (String diaD) {
		this.diaD = diaD;
	}
	
	public String getDiaD() {
		return this.diaD;
	}
	
	public void setProprietario (Proprietario oProprietario) {
		this.oProprietario = oProprietario;
	}
	
	public Proprietario getProprietario() {
		return this.oProprietario;
	}
	
	public String toString() {
		return "Modelo do ve�culo: " + getModelo() +
				"\nPlaca do ve�culo: " + getPlaca() +
				"\nValor do ve�culo: " + getValor() +
				"\nHora de Loca��o: " + getHora() +
				"\nHora de Devolu��o: " + getHoraD() +
				"\nDia de Loca��o: " + getDia() +
				"\nDia de Devolu��o: " + getDiaD() +
				oProprietario.toString();
	}
}
