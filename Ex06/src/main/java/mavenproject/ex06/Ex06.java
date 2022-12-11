package mavenproject.ex06;

import javax.swing.JOptionPane;

/*
6. Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.
*/

public class Ex06 {
    public static void main(String args[]){
        double x = 0, y = 0, z = 0;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
        
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y: "));
    
        z = x;
        
        x = y;
        
        y = z;
        
        JOptionPane.showMessageDialog(null,"O valor de x é: " + 
                + x + "\n"+ "O valor de y é: " + y);

    }
}
