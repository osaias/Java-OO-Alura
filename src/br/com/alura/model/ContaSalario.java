package br.com.alura.model;

public class ContaSalario extends Conta implements Tributavel{

	private double limite;

	public ContaSalario(int numero, int agencia, Cliente titular, double saldo) {
		super(numero, agencia, titular, saldo);

		this.limite = 50.0;
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public double getImposto() {

		if (this.getSaldo() > 0) {
			return this.getSaldo() * 0.02;

		}

		return 0.0;
	}


}
