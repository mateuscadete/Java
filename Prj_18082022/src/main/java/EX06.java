// 06) Receba os valores em x e y. Efetue a troca de seus valores e mostre seus conteúdos.

import javax.swing.JOptionPane;
public class EX06 {
    public static void main(String args[]){
        int x, y, z;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
        
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
        
        z = x;
        
        x = y;
        
        y = z;
        
        System.out.println("O valor de x é: " + x + " O valor de y é: " + y);
    
    
    }
}
