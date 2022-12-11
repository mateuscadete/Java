package mavenproject.ex09;

import javax.swing.JOptionPane;

/*
9. Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */

public class Ex09 {
    public static void main(String args[]){
        double a = 0, b = 0, resultado = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                + "primeiro número: "));
    
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o "
                + "segundo número: "));
        
        resultado = Math.pow(a,2) + Math.pow(b,2);
        
        JOptionPane.showMessageDialog("O resultado da soma dos quadrados é: " + resultado);
    }
}
