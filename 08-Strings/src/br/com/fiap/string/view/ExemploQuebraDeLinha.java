package br.com.fiap.string.view;
import javax.swing.JOptionPane;

public class ExemploQuebraDeLinha {
	public static void main(String[] args) {
		
		//Imprimir o texto formatado:
		//		"Compro churros
		//do lado da "FIAP"
		//Modelo JOptionPane:
		JOptionPane.showMessageDialog(null, "Compro churros\n do lado da \"FIAP\"");
		//Modelo Syste.out.println:
		System.out.println("\tCompro churros\n do lado da \"FIAP\"");
	}
}
