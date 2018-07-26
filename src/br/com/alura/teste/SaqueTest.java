package br.com.alura.teste;

import br.com.alura.exceptions.SaqueException;
import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.Endereco;

public class SaqueTest {

	public static void main(String[] args) {

		Cliente c = new Cliente("Osaias", "32056910837", new Endereco("rua", 12, "",""));

		Conta cc = new ContaCorrente(001, 1558, c, 100);

		try {
			cc.sacar(200);
		} catch (SaqueException e) {
			
			System.out.println(e.getMessage() + ":" );
			e.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());
	}

}
