package br.com.fiap.exercicio01.view;
import br.com.fiap.exercicio01.model.*;

public class Excercicio01 {
	public static void main(String[] args) {
		
		//instanciar uma Cor
		Cor preto = new Cor();
		preto.alteraCor(0, 0, 0, "Preto");
		
		//Iinatanciar um carro
		Carro landRover = new Carro();
		landRover.setModelo("Discovery");
		landRover.setAnoFabircacao(2023);
		landRover.setComprimento(4.85);
		landRover.setCor(preto);
		landRover.setMotor(1);
		landRover.setPlaca("YU260608");
		landRover.setQtdLugares(7);
		landRover.setQtdPortas(4);
		
		//Exibir alguns valores do carro
		System.out.println("Intitulado o melhor SUV desse ano: " + landRover.getComprimento() + " de comprimento" +
		" contendo " + landRover.getQtdLugares() + " lugares e " + landRover.getQtdPortas() + " portas.");
		
		//Exibir o modelo e o ano
		System.out.println("Vem ai o mais novo: " + landRover.getModelo() +  landRover.getAnoFabircacao());
		
		//Exibir o nome da cor da lancha
		System.out.println(landRover.getCor().getNome());
	}

}
