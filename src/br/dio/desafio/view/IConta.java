package br.dio.desafio.view;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtratoPF();

	void imprimirExtratoPJ();
}
