package br.com.alura.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalculadorImposto {

	private double valorImpostos;
	List<Conta> contas = new ArrayList<>();

	/*
	 * Neste método, para atualizar o saldo de cada conta sem o imposto. 
	 * Usa-se o conceito de HERANÇA( reutilização de código e polimorfismo),
	 * pois não precisa implementar o método pagar() em cada conta
	 */
	public void pagar(Conta conta) {
		try {
		 Tributavel c = (Tributavel) conta;
		 double valor = this.somar(c);
		 
		 conta.sacar(valor);
		 
		 this.contas.add(conta);
		 
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/*
	 * Neste caso, utiliza-se o conceito de INTERFACE(polimorfismo).
	 * O calculo do imposto fica na responsabilidade de cada conta,
	 * portanto não há reutilização de código. 
	 */
	private double somar(Tributavel conta) {
		this.valorImpostos += conta.getImposto();
		return conta.getImposto();
	}
	
	public double getValorImpostos() {
		return valorImpostos;
	}
	
	public void exibirContas() {
		
		
		
		contas.sort(new numeroContaComparator());
		
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	private class numeroContaComparator implements Comparator<Conta> {

		@Override
		public int compare(Conta c1, Conta c2) {

			if (c1.getNumero() < c2.getNumero()) {
				return -1;
			}
			
			if (c1.getNumero() > c2.getNumero()) {
				return 1;
			}
			
			return 0;
		}
		
	}
}
