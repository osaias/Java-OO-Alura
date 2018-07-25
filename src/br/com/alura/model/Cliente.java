package br.com.alura.model;

public class Cliente {

	private String nome;
	private long cpf;
	private long rg;
	private long cnpj;
	private Endereco endereco;
	
	
	
	public Cliente(String nome, String documento, Endereco endereco) {
		super();
		registrarDocumento(documento);
		this.nome = nome;
		this.endereco = endereco;
	}

	private void registrarDocumento(String documento) {
		
		if (documento.length() == 11) {
			this.cpf = Long.valueOf(documento);
			return;
		}
		
		if (documento.length() == 14) {
			this.cnpj = Long.valueOf(documento);
			return;
		}
		
		if (documento.length() == 9) {
			this.rg = Long.valueOf(documento);
			return;
		}
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public long getRg() {
		return rg;
	}
	
	public void setRg(long rg) {
		this.rg = rg;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
