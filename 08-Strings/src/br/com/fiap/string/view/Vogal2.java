package br.com.fiap.string.view;
import javax.swing.JOptionPane;

public class Vogal2 {
	public static void main(String[] args) {
		
		//Ler uma palavra
		String palavra2 = JOptionPane.showInputDialog("Digite uma palavra");
		
		String vogais = "aeiou";
		
		//Criar um laço de repetição para percorrer todos os caracteres de vogais
		for (int i = 0; i < vogais.length(); i++){
			//Para cada caractere, deve subistituir por *
			palavra2 = palavra2.replace(vogais.charAt(i), '*');
		}
		
		//Exibir resultado
		JOptionPane.showMessageDialog(null, palavra2);
	}
	
}
