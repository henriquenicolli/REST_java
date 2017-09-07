package br.edu.utfpr.app.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import br.edu.utfpr.app.model.Funcionario;

public class ClientePost {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Funcionario funcionario = new Funcionario(3, "maria");
		Entity<Funcionario> entity = Entity.entity(funcionario, MediaType.APPLICATION_XML); 
		target.path("/funcionarios/").request().post(entity);
	}

}
