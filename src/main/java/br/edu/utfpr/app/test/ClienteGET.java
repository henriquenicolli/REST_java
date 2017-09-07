package br.edu.utfpr.app.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

import br.edu.utfpr.app.model.Funcionario;

public class ClienteGET {
	
	@Test
	public void testeGET() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Funcionario funcionario = target.path("/funcionarios/" + 1).request().get(Funcionario.class);
		
		Assert.assertTrue(funcionario.getNome().equals("joao"));
	}

}
