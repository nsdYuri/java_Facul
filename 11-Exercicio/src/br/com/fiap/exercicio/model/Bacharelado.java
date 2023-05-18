package br.com.fiap.exercicio.model;

public class Bacharelado extends Formacao{

	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	//Metodos
	public double calcularMensalidade(double fator) {
		mensalidade = (duracao * fator * 600) + (cargaHorariaEstagio * 12);
		return mensalidade;
	}
	
	//Construtores
	public Bacharelado() {
	}
	
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	
}
