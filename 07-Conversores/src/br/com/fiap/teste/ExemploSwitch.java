package br.com.fiap.teste;
import javax.swing.JOptionPane;

public class ExemploSwitch {
	public static void main(String[] args) {
		
		//Ler dois numeros com JOption
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número"));
		
		//Ler uma opcao: 1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir
		int op = Integer.parseInt(
				JOptionPane.showInputDialog("Digite \n1-Somar \n2-Subtrair \n3-Multiplicar \n4-Diviidir"));
		
		//Realizar a op escolhida
		switch (op){
				case 1:
					double soma = n1 + n2;
					JOptionPane.showMessageDialog(null, "A soma dos numeros inseridos é igual a: " + soma );
				break;
				
				case 2:
					double subtrair = n1 - n2;
					JOptionPane.showMessageDialog(null, "A diferença entre os números inseridos é igual a: " + subtrair);
				break;
				
				case 3:
					double multiplicar = n1 * n2;
					JOptionPane.showMessageDialog(null, "A multiplicação entre os números inseridos é igual a: " + multiplicar);
				break;
				
				case 4:
					double dividir = n1 / n2;
					JOptionPane.showMessageDialog(null, "A divisão entre os números escolhidos é igual a: " + dividir);
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Não foi possivel concluir a opração desejada.");
		}
	}

}
