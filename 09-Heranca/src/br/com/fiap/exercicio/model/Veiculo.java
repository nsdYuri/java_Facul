package br.com.fiap.exercicio.model;

public class Veiculo {
	
	private String modelo;
	private int qtdLugares;
	private int anoFabricacao;
	private double comprimento;
	private Cor cor;
	
	public Veiculo() {
	}
	
	public Veiculo(String modelo, int qtdLugares, int anoFabricacao, double comprimento, Cor cor) {
		this.modelo = modelo;
		this.qtdLugares = qtdLugares;
		this.anoFabricacao = anoFabricacao;
		this.comprimento = comprimento;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdLugares() {
		return qtdLugares;
	}

	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
}
