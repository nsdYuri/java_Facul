package br.com.fiap.teste;
import javax.swing.JOptionPane;

public class ConversaoStringPrimitivo {
	public static void main(String[] args) {
		
		//Declarar uma variavel do tipo String
		String idade = "18";
		
		//Transformar a String em um tipo primitivo
		//byte, short, int, long, float, double
		byte idadeByte = Byte.parseByte(idade);
		short idadeShort = Short.parseShort(idade);
		int idadeInt = Integer.parseInt(idade);
		long idadeLong = Long.parseLong(idade);
		float idadeFloat = Float.parseFloat(idade);
		double idadeDouble = Double.parseDouble(idade);
		
		//Ler um numero
		idade = JOptionPane.showInputDialog("Digite sua idade");
		
		//exiba quanto falta para atingir 18 anos
		
		
	}

}
