package br.com.alura.teste;

import br.com.alura.exceptions.TransferenciaException;
import br.com.alura.model.Cliente;
import br.com.alura.model.Conta;
import br.com.alura.model.ContaCorrente;
import br.com.alura.model.ContaPoupanca;
import br.com.alura.model.Endereco;

public class TransferenciaTest {

	public static void main(String[] args) {

		Cliente osaias = new Cliente("Osaias", "32056910837", new Endereco("rua", 12, "",""));
		Cliente renata = new Cliente("Renata", "32055479837", new Endereco("rua", 12, "",""));
		Conta cc = null;
		Conta cp = null; 

		Throwable msg = null;
		try {
			cc = new ContaCorrente(010, 1558, osaias, 100);
			cp = new ContaPoupanca(001, 1558, renata, 1000);
			cc.transferir(10, cp);
			
			System.out.println("DE:");
			System.out.println("-------------------------------------");
			System.out.println(cc);
			System.out.println();
			System.out.println("PARA:");
			System.out.println("-------------------------------------");
			System.out.println(cp);
		} catch (Exception e) {
			System.out.println(e.getMessage() + ":");
			e.printStackTrace();
			msg = e.getCause();
		} finally {

			if (msg != null)
			System.err.println(msg);

		}
	}

}
