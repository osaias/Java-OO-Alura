package br.com.alura.model;

public abstract class Conta {

	private int numero;
	private int agencia;
	private Cliente titular;
	private double saldo;
		
	public Conta(int numero, int agencia, Cliente titular, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	
		protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	protected void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacar(double valor) {
		
		if (this.saldo < valor) {
			return false;
		}
		
		this.saldo -= valor;
		
		return true;
	}
	
	public boolean transferir(double valor, Conta conta) {
		
		if (this.sacar(valor)) {
			conta.depositar(valor);
			return true;
		}
		
		return false;
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	
}
