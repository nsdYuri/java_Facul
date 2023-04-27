package br.com.fiap.store;

public class Teste {
	//metodo que comeca a execução do programa java (usado apenas em classes que serão executadas)
	//atalho (main -> CTRL + espaço
	public static void main(String[] args) {
		
		//Criar um objeto do tipo "Editora" e instanciar a classe
		Editora churros = new Editora();
		
		//Incluir informações dentro do objeto
		churros.nome = "Brotha";
		churros.endereco = "Fransico Morato";
		churros.cnpj = "123456789";
		
		//Criar outro objeto do tipo "Editora"
		Editora ucm = new Editora();
		ucm.nome = "Marvel";
		ucm.endereco = "Hollywood";
		ucm.cnpj = "987654321";
		
		//Criar um objeto do tipo "Ebook"
		Ebook marvel = new Ebook();
		marvel.nome = "Vingadores";
		marvel.genero = "Ação";
		marvel.idioma = "pt-br";
		marvel.quantidadePaginas = 616;
		marvel.rating = 9.7;
		marvel.resumo = "Vingadores são os heróis mais poderosos daa terra que se uniram para travar "
				+ "batalhas que os outros não conseguiriam";
		marvel.valor = 780.50;
		marvel.isbn = "nao sei";
		
		//Exibir nome da editora que esta na variavel churros
		System.out.println("O nome da editora apelidada como churrors é: " + churros.nome);
		
		//Exibir o nome e valor da editora do ebook
		System.out.println("Sua principal concorrente é a editora: " + ucm.nome + 
				" que tem como principal produto a obra " + marvel.nome + " custando a partir de " + marvel.valor);
	}
}
