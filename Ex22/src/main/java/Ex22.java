/*
22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente.
 */

import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String args[]){
        int a = 0, b = 0;
        
        //Recebe os valores inteiros
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        //Compara se são números diferentes
        if(a != b){
            //Se são números diferentes, compara se a maior que b
            if(a < b){
                
                JOptionPane.showMessageDialog(null, a + " " + b);
            
            }
            //Caso contrário b é maior que a
            else{
            
                JOptionPane.showMessageDialog(null, b + " " +  a);
            
            }
        }
        //Caso o número seja igual ou digite outra coisa, valor inválido
        else{
            
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }
}
