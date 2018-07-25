package br.com.alura.model;

public class ContaCorrente extends Conta implements Tributavel{

	private double limite;

	public ContaCorrente(int numero, int agencia, Cliente titular, double saldo) {
		super(numero, agencia, titular, saldo);
		this.limite = 100.0;
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public double getImposto() {

		if (this.getSaldo() > 0) {
			return this.getSaldo() * 0.05;

		}

		return 0.0;
	}



}
