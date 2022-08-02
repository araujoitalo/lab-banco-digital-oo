package br.dio.desafio.model;

import br.dio.desafio.view.IConta;
import lombok.Data;

@Data
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected ClientePessoaJuridica clientej;
	protected ClientePessoaFisica clientef;
	protected Banco banco;

	public Conta(ClientePessoaJuridica clientej) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.clientej = clientej;
	}

	public Conta(ClientePessoaFisica clientef) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.clientef = clientef;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}


	protected void imprimirInfosComunsPJ() {
		System.out.println(String.format("Nome Fantasia: %s", this.clientej.getNomeFantasia()));
		System.out.println(String.format("Razao Social: %s", this.clientej.getRazaoSocial()));
		System.out.println(String.format("CNPJ: %s", this.clientej.getCnpj()));
		System.out.println(String.format("Endereço: %s", this.clientej.getEndereco()));
		System.out.println(String.format("Bairro: %s", this.clientej.getBairro()));
		System.out.println(String.format("Telefone: %s", this.clientej.getTelefone()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	protected void imprimirInfosComunsPF() {
		System.out.println(String.format("Titular: %s", this.clientef.getNome()));
		System.out.println(String.format("Cpf: %s", this.clientef.getCpf()));
		System.out.println(String.format("Endereço: %s", this.clientef.getEndereco()));
		System.out.println(String.format("Bairro: %s", this.clientef.getBairro()));
		System.out.println(String.format("Telefone: %s", this.clientef.getTelefone()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
