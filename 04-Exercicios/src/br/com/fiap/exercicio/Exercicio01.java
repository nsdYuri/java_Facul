package br.com.fiap.exercicio;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		//Instanciar o objeto que ira ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Instanciar um aluno
		Aluno aluno = new Aluno();
		
		//Ler o nome do aluno
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = leitor.nextLine();
		
		//Ler as notas do aluno
		System.out.println("Digite a nota da cp1: ");
		aluno.cp1 = leitor.nextDouble();
		
		System.out.println("Digite a nota da cp2: ");
		aluno.cp2 = leitor.nextDouble();
		
		System.out.println("Digite a nota da cp3: ");
		aluno.cp3 = leitor.nextDouble();
		
		System.out.println("Digite a nota do challenge: ");
		aluno.challenge = leitor.nextDouble();
		
		System.out.println("Digite a nota da Global: ");
		aluno.global = leitor.nextDouble();
		
		//Calcular a media semestral do aluno
		double mediaSemestral = aluno.calcularMediaSemestre();
		
		//Exibir o nome e a media do aluno
		System.out.println("o aluno: " + aluno.nome + " teve como media semestral " + mediaSemestral + ".");
		
		//fechar o leitor
		leitor.close();
		
		
		
	}

}
