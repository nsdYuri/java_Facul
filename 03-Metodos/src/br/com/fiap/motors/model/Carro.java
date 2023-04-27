package br.com.fiap.motors.model;

public class Carro {
	 
	//Atributos
	String modelo;
	int ano;
	double valor;
	
	//Metodos
	//Idade calcular idade (ano atual)
	int calcularIdade(int anoAtual) {
		//calcular idade
		int idade = anoAtual - ano;
		//retornar valor
		return idade;
	}
	
	//atualizar o valor do carro 
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
	
	//Criar um metodo que calcula e retorna o valor do seguro do carro
	//Seguro do carro é baseado no valor do carro, 5% do valor do carro
	double valorSeguro() {
		double seguro = valor * 0.5;
		return seguro;
		
	}
	
	/*Criar um metodo que recebe a quantidade de parcelas, calcula e retorna
	 * o valor da parcela do seguro*/
	double calcularParcelas(int parcelas) {
		double valorParcela = (valor * 0.5) / parcelas;
		return valorParcela;
	}
}
