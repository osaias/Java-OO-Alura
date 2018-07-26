package br.com.alura.model;

public class CalculadorImposto {

	private double valorImpostos;

	/*
	 * Neste m�todo, para atualizar o saldo de cada conta sem o imposto. 
	 * Usa-se o conceito de HERAN�A( reutiliza��o de c�digo e polimorfismo),
	 * pois n�o precisa implementar o m�todo pagar() em cada conta
	 */
	public void pagar(Conta conta) {
		try {
		 Tributavel c = (Tributavel) conta;
		 double valor = this.somar(c);
		 conta.sacar(valor);
		 
		}catch (Exception e) {

		}
	}
	
	/*
	 * Neste caso, utiliza-se o conceito de INTERFACE(polimorfismo).
	 * O calculo do imposto fica na responsabilidade de cada conta,
	 * portanto n�o h� reutiliza��o de c�digo. 
	 */
	public double somar(Tributavel conta) {
		this.valorImpostos += conta.getImposto();
		return conta.getImposto();
	}
	
	public double getValorImpostos() {
		return valorImpostos;
	}
}
