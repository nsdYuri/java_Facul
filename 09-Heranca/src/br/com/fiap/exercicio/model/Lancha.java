package br.com.fiap.exercicio.model;

public class Lancha extends Veiculo{

		private int qtdMotores;
		
		public Lancha() {
		}
		
		public Lancha(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor,
				int quantidadeMotores) {
			super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
			this.qtdMotores = qtdMotores;
		}

		public int getQtdMotores() {
			return qtdMotores;
		}

		public void setQtdMotores(int qtdMotores) {
			this.qtdMotores = qtdMotores;
		}
}
