package br.com.alura.teste;

import br.com.alura.exceptions.TransferenciaException;
import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;
import br.com.alura.model.Endereco;

public class TransferenciaTest {

	public static void main(String[] args) {

		Cliente c = new Cliente("Osaias", "32056910837", new Endereco("rua", 12, "",""));
		Conta cc = null;
		Conta cp = null; 

		Throwable msg = null;
		try {
			cc = new ContaCorrente(010, 1558, c, 100);
			cp = new ContaPoupanca(001, 1558, c, 1000);
			cc.transferir(10, cp);
			
			System.out.println(cc.toString());
			System.out.println(cp.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage() + ":");
			e.printStackTrace();
			msg = e.getCause();
		} finally {

			System.err.println(msg);

		}
	}

}
