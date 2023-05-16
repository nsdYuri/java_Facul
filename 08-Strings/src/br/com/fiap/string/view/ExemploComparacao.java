package br.com.fiap.string.view;

public class ExemploComparacao {
	public static void main(String[] args) {
		
		//Declarar duas variaveis tipo String 
		String nome = "Faculdade de Tecnologia";
		String nome2 = new String("FIAP");
		
		//Verificar se os nomes são iguais
		if (nome.equals(nome2)) {
			System.out.println("Validação concluida com sucesso!");
		}else {
			System.out.println("Os nomes inseridos não são iguais");
		}
		
		//Verificar se os os nmomes são iguais não diferenciando maiusculas e minusculas
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("Validação concluida com sucesso!");
		}else {
			System.out.println("Os nomes inseridos não são iguais");
		}
		
		//Impreimir a quantidades de letras na variavel nome
		System.out.println(nome + " tem exatamente, " + nome.length() + " letras.");
		
		//Validar se o nome tem menos de 20 caracteres
		if (nome.length() <= 20) {
			System.out.println("Validação concluida com sucesso");
		}else {
			System.out.println("O nome inserido tem mais de 20 caracteres, tente novamente.");
		}
	}
}
