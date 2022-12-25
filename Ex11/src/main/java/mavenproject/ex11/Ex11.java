package mavenproject.ex11;

import javax.swing.JOptionPane;

/* 11. Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência. */

public class Ex11 {

    public static void main(String[] args) {
        double d = 0, r = 0;
        
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "valor do diâmetro: "));
        
        r = d / 2;
        
        JOptionPane.showMessageDialog(null, "O valor do raio é: " + r);
        
    }
    
}
