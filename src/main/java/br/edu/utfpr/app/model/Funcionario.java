package br.edu.utfpr.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Funcionario {

	private long matricula;
	private String nome;

	public Funcionario() {
	}

	public Funcionario(long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
