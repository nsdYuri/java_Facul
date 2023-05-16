package br.com.fiap.string.view;
import javax.swing.JOptionPane;

public class Maiuscula {
	public static void main(String[] args) {
		
		String algo = JOptionPane.showInputDialog("Digite algo");
		System.out.println(algo.toUpperCase());
	}
}
