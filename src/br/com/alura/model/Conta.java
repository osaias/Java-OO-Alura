package br.com.alura.model;

import br.com.alura.exceptions.DepositoException;
import br.com.alura.exceptions.SaqueException;
import br.com.alura.exceptions.TransferenciaException;
import br.com.alura.operacoes.Deposito;
import br.com.alura.operacoes.Saque;
import br.com.alura.operacoes.Transferencia;

public abstract class Conta {

	private int numero;
	private int agencia;
	private Cliente titular;
	private double saldo;
		
	public Conta(int numero, int agencia, Cliente titular, double saldo) {
		super();
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
        
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

	public void sacar(double valor) throws SaqueException {
		//delegou a lógica de saque
		this.saldo = new Saque(this).sacar(valor);
	}
	
	public void transferir(double valor, Conta conta) throws TransferenciaException{
		//delegou a lógica de transferir
		new Transferencia().transferir(valor, this, conta);
	}
	
	public void depositar(double valor) throws DepositoException {
		//delegou a lógica deposito
		this.saldo = new Deposito().depositar(valor, this);
	}
	
	
}
