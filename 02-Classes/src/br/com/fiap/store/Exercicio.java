package br.com.fiap.store;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		
		//Criar objeto que le os dados inseridos pelo usuario
		Scanner leitor = new Scanner(System.in);
		
		//ler o nome do aluno
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine(); //funcao que le uma String
		
		System.out.println("Digite sua nota da cp1: ");
		double cp1 = leitor.nextDouble();
		
		System.out.println("Digite sua nota da cp2: ");
		double cp2 = leitor.nextDouble();
		
		System.out.println("Digite sua nota da cp3");
		double cp3 = leitor.nextDouble();
		
		System.out.println("Digite sue nota do Challenge");
		double challenge = leitor.nextDouble();
		
		System.out.println("Digite sua nota da Global Solution");
		double gs = leitor.nextDouble();
		
		//calcular media do checkpoint
		double mediacp = (cp1 + cp2 + cp3)/3;
		
		//calcular media do semestre
		double media = mediacp*0.2 + challenge*0.2 + gs*0.6;
		
		//Exibir nome e media final do semestre
		System.out.println("O aluno: " + nome + " tem mádia final semestral igual a: " + media);
		
		
		
		
	}
}
