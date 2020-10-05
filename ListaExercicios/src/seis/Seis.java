package seis;

import javax.swing.JOptionPane;

public class Seis {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual e o seu nome ?");
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual e a sua idade ?"));
		
		if (idade>=18) {
			
			JOptionPane.showMessageDialog(null, nome + ", você pode tirar carteira!");

		} else {
			int idadeFalta = 18 - idade;
			JOptionPane.showMessageDialog(null, ( nome + ", você pode tirar carteira daqui " + idadeFalta + " anos"));

		}
	}

}
