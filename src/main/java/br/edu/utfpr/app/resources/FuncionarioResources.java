package br.edu.utfpr.app.resources;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.utfpr.app.dao.FuncionarioDao;
import br.edu.utfpr.app.model.Funcionario;

@Path("funcionarios")
public class FuncionarioResources {

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Funcionario busca(@PathParam("id") long id) {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = dao.busca(id);
		return funcionario;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response add(Funcionario funcionario) {
		FuncionarioDao dao = new FuncionarioDao();
		dao.add(funcionario);
		URI uri = URI.create("/funcionarios/" + funcionario.getMatricula());
		return Response.created(uri).build();
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	@Path("{id}")
	public Response del(@PathParam("id") long id) {
		FuncionarioDao dao = new FuncionarioDao();
		dao.del(id);
		return Response.ok().build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response altera(Funcionario funcionario) {
		FuncionarioDao dao = new FuncionarioDao();
		dao.altera(funcionario);
		return Response.ok().build();
	}

}
