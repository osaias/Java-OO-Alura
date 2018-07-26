package br.com.alura.operacoes;

import br.com.alura.exceptions.DepositoException;
import br.com.alura.exceptions.SaqueException;
import br.com.alura.exceptions.TransferenciaException;
import br.com.alura.model.Conta;

public class Transferencia {

	private double transferencia;

	public void transferir(double valor, Conta origem, Conta destino) throws TransferenciaException {

		if (origem == null || destino == null) {
			throw new TransferenciaException("conta de origem ou conta de destino nula");
		}
		
		if (origem.getSaldo() < valor) {
			throw new TransferenciaException("Saldo Insuficiente na conta do origem");
		}

		try {
			origem.sacar(valor);
			destino.depositar(valor);
		} catch (SaqueException | DepositoException e) {
			System.out.println(e.getMessage() + ":");
			e.printStackTrace();
			
			if (e.getClass().equals(DepositoException.class)) {
				try {
					origem.depositar(valor);
				} catch (DepositoException e1) {
					e1 = new DepositoException("Erro no estorno na conta de origem");
					System.out.println(e1.getMessage() + ":");
					e1.printStackTrace();
				}
			}
			
		}
	}

	public double getTransferencia() {
		return transferencia;
	}
}
