package br.com.fiap.exercicio.model;

public class Tecnologo extends Formacao{

	private boolean planoEstendido;
		
	//Metodos
	public double calcularMensalidade(double fator) {
		mensalidade = duracao * fator * 600;
		return mensalidade;
	}
	
	//Contrutores
	public Tecnologo() {
	}
	
	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
}
