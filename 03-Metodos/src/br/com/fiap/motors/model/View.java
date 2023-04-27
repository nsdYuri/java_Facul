package br.com.fiap.motors.model;

public class View {
	
	//Como essa sera a classe executada, precisamos do metodo main
	public static void main(String[] args) {
		
		//Instanciar o carro
		Carro discovery = new Carro();
		
		//Incluir informações aos atributos
		discovery.modelo = "HSE";
		discovery.ano = 2024;
		discovery.valor = 1.500000;
		
		//Calcular idade
		int i = discovery.calcularIdade(2023);
		System.out.println("A idade do carro é igual a: " + i);
		
		//atualizar valor do carro
		discovery.atualizarValor(0.8);
		System.out.println("O valor do carro agora é: " + discovery.valor);
		
		//exibir valor do seguro
		double seguro = discovery.valorSeguro();
		System.out.println("O valor do seguro chega na casa dos " + seguro + " reais.");
		
		//exibir valor da parcela em 10x
		double valorParcela = discovery.calcularParcelas(10);
		System.out.println("Parcelando em 10x, o valor de cada parcela fica " + valorParcela + " reais.");;
		
		
	}

}
