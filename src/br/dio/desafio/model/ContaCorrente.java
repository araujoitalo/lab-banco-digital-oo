package br.dio.desafio.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(ClientePessoaJuridica clientej) {
		super(clientej);
	}

	public ContaCorrente(ClientePessoaFisica clientef) {
		super(clientef);
	}

	@Override
	public void imprimirExtratoPJ() {
		System.out.println("=== Extrato Conta Corrente PJ ===");
		super.imprimirInfosComunsPJ();
	}

	@Override
	public void imprimirExtratoPF() {
		System.out.println("=== Extrato Conta Corrente PF ===");
		super.imprimirInfosComunsPF();
	}


	
}
