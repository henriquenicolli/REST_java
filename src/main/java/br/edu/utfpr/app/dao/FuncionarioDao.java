package br.edu.utfpr.app.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.utfpr.app.model.Funcionario;

public class FuncionarioDao {

	private static Map<Long, Funcionario> banco = new HashMap<>();
	private static long cont = 2;

	static {
		Funcionario joao = new Funcionario(1l, "joao");
		banco.put(1l, joao);
	}

	public void add(Funcionario funcionario) {
		banco.put(cont++, funcionario);
	}

	public void del(long id) {
		banco.remove(id);
	}

	public Funcionario busca(long id) {
		return banco.get(id);
	}

	public void altera(Funcionario funcionario) {
		banco.replace(funcionario.getMatricula(), funcionario);
	}

}
