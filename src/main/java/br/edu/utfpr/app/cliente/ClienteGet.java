package br.edu.utfpr.app.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import br.edu.utfpr.app.model.Funcionario;

public class ClienteGet {

	public static void main(String[] args) {

		Client cliente = ClientBuilder.newClient();
		WebTarget target = cliente.target("http://localhost:8080");
		Funcionario funcionario = target.path("/funcionarios/" + 1).request().get(Funcionario.class);
		System.out.println(funcionario.getMatricula());
		System.out.println(funcionario.getNome());
	}

}
