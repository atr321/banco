package model;

public class Conta {
	//atributos
	private int idConta;
	private int idCliente;
	private String numeroConta;
	private String agenciaConta;
	private String tipoConta;
	
	//metodo construtor
	public Conta(int idConta, int idCliente, String numeroConta, String agenciaConta, String tipoConta) {
		super();
		this.idConta = idConta;
		this.idCliente = idCliente;
		this.numeroConta = numeroConta;
		this.agenciaConta = agenciaConta;
		this.tipoConta = tipoConta;
	}
	
	//getters and setters
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgenciaConta() {
		return agenciaConta;
	}
	public void setAgenciaConta(String agenciaConta) {
		this.agenciaConta = agenciaConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

}
