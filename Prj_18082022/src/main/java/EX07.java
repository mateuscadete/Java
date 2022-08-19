// 07) Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume

import javax.swing.JOptionPane;

public class EX07 {
    public static void main(String args[]){
        double c, l, h, v;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
        
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        
        v = c * l * h;
        
        System.out.println("O volume é: " + v);
    
    }
}
