package mavenproject.ex08;

import javax.swing.JOptionPane;

/*
8. Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */

public class Ex08 {
    public static void main(String args[]){
        double valor = 0, reajuste = 0;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "valor do depósito: "));
        
        reajuste = valor * (1.3 / 100);
    
        JOptionPane.showMessageDialog(null, "O valor do reajuste é: " + reajuste);
    }
}
