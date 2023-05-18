package br.com.fiap.exercicio.model;

public class Formacao {
	
	private String descricao;
	private int periodo;
	protected double mensalidade;
	protected int duracao;
	
	//Metodos:
	public void definirDuracao(String formacao) {
		if(formacao.equalsIgnoreCase("medio")) {
			duracao = 36;
		}else if(formacao.equalsIgnoreCase("tecnologo")) {
			duracao = 24;
		}else if(formacao.equalsIgnoreCase("bacharelado") && (descricao.equals("ENGENHARIA"))) {
			duracao = 60;
		}else {
			duracao =  48;
		}
	}
	
	
	public double calcularMedia(double global1, double global2) {
		 return global1 * 0.4 + global2 * 0.6;
	}
	
	public double calcularMedia(double global1, double cp1, double challenge1, double global2, double cp2, 
			double challenge2) {
			//Calcular a media do 1° Semestre
			double s1 = global1 * 0.6 + cp1 * 0.2 + challenge1 *0.2;
			//Calcular media 2° Semestre
			double s2 = global2 * 0.6 + cp2 * 0.2 + challenge2 * 0.2;
			return calcularMedia(s1, s2);
	}
	
	public double calcularMedia(double cp1, double cp2, double cp3) {
		double media;
		if(cp1 <= cp2 && cp1 <= cp3) {
			System.out.println(cp1 + " é a menor nota");
			media = (cp2 + cp3) / 2;
		}else if(cp2 <= cp1 && cp2 <= cp3) {
			System.out.println(cp2 + " é a menor nota");
			media = (cp1 + cp3) / 2;
		}else {
			System.out.println(cp3 + " é a menor nota");
			media = (cp1 + cp2) / 2; 
		}
		return media;
	}
	
	//Contrutores: 
	public Formacao() {
	}
	
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
}
