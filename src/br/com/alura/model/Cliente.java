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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cnpj ^ (cnpj >>> 32));
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + (int) (rg ^ (rg >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cnpj != other.cnpj)
			return false;
		if (cpf != other.cpf)
			return false;
		if (rg != other.rg)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
