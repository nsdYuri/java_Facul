package br.com.fiap.exercicio01.model;

public class Carro {
	
	private String modelo, placa;
	private int qtdPortas, qtdLugares, anoFabircacao;
	private double comprimento;
	private Cor cor;
	private float motor = 1;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public int getQtdLugares() {
		return qtdLugares;
	}
	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}
	public int getAnoFabircacao() {
		return anoFabircacao;
	}
	public void setAnoFabircacao(int anoFabircacao) {
		this.anoFabircacao = anoFabircacao;
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
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	 

}
