package Lote1;

import javax.swing.JOptionPane;
 
 //01) Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o resultado.

public class EX01 {
	public static void main (String args [])
	{
		int c, l, resultado;
		 
		// A vari�vel c representa o comprimento do quadrado, a vari�vel l representa a largura 
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		
		l = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de l: "));
		
		resultado = c * l; 
		
		System.out.println("O resultado �: " + resultado);
		
	}

}
