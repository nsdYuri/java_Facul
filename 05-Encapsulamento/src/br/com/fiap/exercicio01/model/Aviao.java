package br.com.fiap.exercicio01.model;

public class Aviao {
	
	private String nome, prefixo;
	private int qtdLugares, qtdTurbinas, anoFabricacao;
	private double comprimento;
	private Cor cor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public int getQtdLugares() {
		return qtdLugares;
	}
	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}
	public int getQtdTurbinas() {
		return qtdTurbinas;
	}
	public void setQtdTurbinas(int qtdTurbinas) {
		this.qtdTurbinas = qtdTurbinas;
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
