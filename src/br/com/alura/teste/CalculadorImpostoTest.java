package br.com.alura.teste;

import br.com.alura.model.CalculadorImposto;
import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;
import br.com.alura.model.ContaSalario;
import br.com.alura.model.Endereco;

public class CalculadorImpostoTest {

	public static void main(String[] args) {

		Cliente c = new Cliente("Osaias", "32056910837", new Endereco("rua", 12, "",""));
		
		Conta cc = new ContaCorrente(001, 1558, c, 100);
		Conta cc1 = new ContaCorrente(003, 1458, c, 300);
		Conta cs = new ContaSalario(002, 1558, c, 10);
		Conta cp = new ContaPoupanca(003,1558, c, 1000);
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.pagar(cc);
		calc.pagar(cc1);
		calc.pagar(cs);
		//calc.pagar(cp);
		
		calc.exibirContas();
	}

}
