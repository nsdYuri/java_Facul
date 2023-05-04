package br.com.fiap.exercicio01.model;

public class Lancha {

		private String modelo;
		private int qtdLugares, qtdMotores, anoFabricacao;
		private double comprimento;
		private Cor cor;
		
		
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
		public int getQtdMotores() {
			return qtdMotores;
		}
		public void setQtdMotores(int qtdMotores) {
			this.qtdMotores = qtdMotores;
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
