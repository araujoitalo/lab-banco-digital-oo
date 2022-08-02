package br.dio.desafio.model;

import lombok.Data;

@Data
public class ClientePessoaJuridica extends Cliente{

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
}
