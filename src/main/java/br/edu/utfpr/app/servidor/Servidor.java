package br.edu.utfpr.app.servidor;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {
	public static void main(String[] args) throws IOException {

		URI target = URI.create("http://localhost:8080");
		ResourceConfig config = new ResourceConfig().packages("br.edu.utfpr.app");
		HttpServer servidor = GrizzlyHttpServerFactory.createHttpServer(target, config);
		System.out.println("Pressione uma tecla para parar...");
		servidor.start();
		System.in.read();
		servidor.stop();
		System.out.println("servidor parado...");
	}
}
