package br.com.fiap.exercicio.model;

public class Medio extends Formacao{

	private String tipo;
	
	public double calcularMnesalidade(double fator) {
		mensalidade = duracao * fator * 500;
		return mensalidade;
	}
	
	public Medio() {
	}
	
	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
