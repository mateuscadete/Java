package mavenproject.ex07;

import javax.swing.JOptionPane;

/*
 7. Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
*/

public class Ex07 {
    public static void main(String args[]){
        double altura = 0, comprimento = 0, largura = 0, volume = 0;
    
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "valor da altura: "));
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
        + "valor do comprimento: "));
        
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
        + "valor da largura: "));
           
        volume = altura * largura * comprimento;
        
        JOptionPane.showMessageDialog(null,"O valor do volume é: " + volume);
    }
}
