package br.com.fiap.string.view;
import javax.swing.JOptionPane;

public class Vogal {
	public static void main(String[] args) {
		
		//ler uma palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		
		//Substituir vogais por *
		String vogal = palavra
				.replace("a", "*")
		        .replace("e", "*")
		        .replace("i", "*")
		        .replace("o", "*")
		        .replace("u", "*");
		
		//Exibir o resultado
		JOptionPane.showMessageDialog(null, vogal);
	}
}
