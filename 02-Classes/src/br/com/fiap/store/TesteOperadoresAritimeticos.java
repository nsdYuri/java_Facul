package br.com.fiap.store;
import java.util.Scanner;

public class TesteOperadoresAritimeticos {
	public static void main(String[] args) {
		
		//Criar objeto que le o teclado
		Scanner leitor = new Scanner(System.in);
		
		//Delcarar a variavel com a quantidade de alunos da turma
		System.out.println("Digitem quantos alunos possuem na turma ao todo: ");
		int totalAlunos = leitor.nextInt();
		totalAlunos++; //++ ira adicionar mais um aluno a variavel
		
		//Para adicionar mais 6 alunos na turma
		totalAlunos += 6;
		
		//Calcular quantos grupos de 5 pessoas para o challenge é possivel fazer
		int grupos = totalAlunos / 5;
		System.out.println("Sera possivel formar " + grupos + " grupos de 5 pessoas para o challange.");
		
		//Calcular quantos alunos formaramo ultimo grupo
		int lastgp = totalAlunos % 5;
		System.out.println("O ultimo grupo sera formado por " + lastgp + " pessoas.");
		
		int x = 10;
		x += 5;
		x -= 5;
		x *= 5;
		x /= 5;
		x %= 5;
		System.out.println(x);
		
		
		
	}
}
