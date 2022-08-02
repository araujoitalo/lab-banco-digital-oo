package br.dio.desafio.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes = new ArrayList<>();

}
