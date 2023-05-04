package br.com.fiap.exercicio.view;
import br.com.fiap.exercicio.model.*;

public class Terminal {
	public static void main(String[] args) {
		
		//Instanciar uma profissao
		Profissao profissao = new Profissao("Analista Java");
		
		//Instanciar um funcionario
		Funcionario yu = new Funcionario(1, "Yuri", profissao);
		
		System.out.println(yu.getNome() + " " + yu.getMatricula() + " " + yu.getProfissao().getNome());
	}

}
