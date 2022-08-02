package br.dio.desafio.model;

import lombok.Data;

@Data
public class ClientePessoaFisica extends Cliente{

    private String cpf;
    private String nome;
}
