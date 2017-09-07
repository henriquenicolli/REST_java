package br.edu.utfpr.app.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Test;

import br.edu.utfpr.app.model.Funcionario;

public class ClientePOST {

	@Test
	public void testePOST() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		String path = "/funcionarios/";
		Funcionario funcionario = new Funcionario(10, "rose");
		Entity<Funcionario> entity = Entity.entity(funcionario, MediaType.APPLICATION_XML);
		Response post = target.path(path).request().post(entity);
		Assert.assertTrue(post.getStatus() == 201);
	}

}
