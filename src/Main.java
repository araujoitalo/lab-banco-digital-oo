import br.dio.desafio.model.Cliente;
import br.dio.desafio.model.Conta;
import br.dio.desafio.model.ContaCorrente;
import br.dio.desafio.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente italo = new Cliente();
		italo.setNome("Italo Araujo");
		italo.setCpf("093.279.689-96");
		
		Conta cc = new ContaCorrente(italo);
		Conta poupanca = new ContaPoupanca(italo);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
