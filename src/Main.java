import br.dio.desafio.model.*;

public class Main {

	public static void main(String[] args) {

		ClientePessoaFisica italo = new ClientePessoaFisica();
		italo.setNome("Italo Araujo");
		italo.setCpf("093.279.689-96");
		italo.setEndereco("Rua Antonio Maia Do Amaral, 271");
		italo.setBairro("Valparaiso");
		italo.setTelefone("34992439392");

		ClientePessoaJuridica iga = new ClientePessoaJuridica();
		iga.setNomeFantasia("IGA Tecnologia da Informaçao");
		iga.setRazaoSocial("IGA ME");
		iga.setCnpj("68.307.807/0001-05");
		iga.setEndereco("Rua Major Gote, 101");
		iga.setBairro("Centro");
		iga.setTelefone("3438215689");
		
		Conta cc = new ContaCorrente(italo);
		Conta poupanca = new ContaPoupanca(italo);


		cc.depositar(1000);
		cc.transferir(1000, poupanca);


		cc.imprimirExtrato();
		poupanca.imprimirExtrato();



	}

}
