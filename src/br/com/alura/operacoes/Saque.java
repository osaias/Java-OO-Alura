package br.com.alura.operacoes;

import br.com.alura.exceptions.SaqueException;
import br.com.alura.model.Conta;

public class Saque {
	
	private Conta conta;
	private double saque;
	private boolean status;
	
	public Saque(Conta conta) {
		this.conta = conta;
	}

	
	public Conta getConta() {
		return conta;
	}


	public double getSaque() {
		return saque;
	}


	public boolean isStatus() {
		return status;
	}


	public double sacar(double valor) throws SaqueException {

		if (this.getConta().getSaldo() < valor) {
			throw new SaqueException("Saldo Insuficiente");
		}

		this.saque = valor;
		return this.getConta().getSaldo() - this.getSaque();
	}
}
