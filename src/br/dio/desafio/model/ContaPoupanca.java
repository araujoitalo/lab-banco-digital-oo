package br.dio.desafio.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(ClientePessoaJuridica clientej) {
		super(clientej);
	}
	public ContaPoupanca(ClientePessoaFisica clientef) {
		super(clientef);
	}

	@Override
	public void imprimirExtratoPJ() {
		System.out.println("=== Extrato Conta Poupan�a PJ===");
		super.imprimirInfosComunsPJ();
	}

	public void imprimirExtratoPF() {
		System.out.println("=== Extrato Conta Poupan�a PF ===");
		super.imprimirInfosComunsPF();
	}


}
