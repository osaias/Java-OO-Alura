package br.com.alura.operacoes;

import br.com.alura.exceptions.DepositoException;
import br.com.alura.model.Conta;

public class Deposito {

	private double deposito;
	
	public double depositar(double valor, Conta conta) throws DepositoException {

		if (conta.equals(null)) {
			throw new DepositoException("Conta Inexistente");
		}
		this.deposito = valor;
		return conta.getSaldo() + valor;
	}
	
	public double getDeposito() {
		return deposito;
	}
}
