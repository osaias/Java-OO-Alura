package br.com.alura.teste;

import br.com.alura.model.CalculadorImposto;
import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaSalario;
import br.com.alura.model.Endereco;

public class CalculadorImpostoTest {

	public static void main(String[] args) {

		Cliente c = new Cliente("Osaias", "32056910837", new Endereco("rua", 12, "",""));
		
		Conta cc = new ContaCorrente(001, 1558, c, 100);
		Conta cs = new ContaSalario(002, 1558, c, 10);
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.pagar(cc);

	}

}
