package br.com.fiap.empresa.view;

import br.com.fiap.empresa.model.Funcionario;
import br.com.fiap.empresa.model.Gerente;

public class Terminal {

	public static void main(String[] args) {
		
		//Instanciar um Gerente
		Gerente g1 = new Gerente(1, "Lucas", 
				20000,"12.321.312-85", "Senior", 500, null);
		
		
		//Instanciar um Funcionario
		Funcionario f1 = new Funcionario(2, "Igor", 
				5000, "56.213.654-55", "Pleno");
		
		
		//Aumentar o salario do gerente em 5%
		g1.aumentarSalario(50);
		
		
		//Promover o funcionario para Senior
		f1.aumentarSalario("senior");
		
		
		//Exibir o salario do gerente e do funcionario
		System.out.println("Salário Gerente: " + g1.getSalario());
		System.out.println("Salário Fun: " + f1.getSalario());
		System.out.println("O bonus de " + g1.getNome() + " agora é: " + g1.getBonus());
		
		
		//Qual método ele utiliza? Gerente ou Funcionario?
		Funcionario f = new Gerente();
		f.aumentarSalario("pleno");
		System.out.println(f.getSalario());
		
		
		//Validar se a variavel f possui um objeto do tipo Gerente
		if (f instanceof Gerente) {
			System.out.println("f é um objeto do tipo gerente");
			//Cast (forçar um objeto a ser de um tipo especifico)
			Gerente g = (Gerente) f;
			System.out.println(g.getBonus());
		} else {
			System.out.println("f não é um objeto do tipo gerente");
		}
		
	}
}