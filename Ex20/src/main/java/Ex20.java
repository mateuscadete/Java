/*
 20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.
 */

import javax.swing.JOptionPane;

public class Ex20 {

    public static void main(String args[]){
    
        procedure();
    
    }
    
    static void procedure(){
        double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
    
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));
        
        delta = Math.pow(b,2) - 4 * a * c;
        
          if(delta == 0){
            x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);  
            
            JOptionPane.showMessageDialog(null, "X1 = " + x1);
        }
        else{
            x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
            
            x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
            
            JOptionPane.showMessageDialog(null, "X1 = " + x1 + "\nX2 = " + x2);
        }
    }
}
