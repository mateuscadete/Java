/*
1. Fatorial com recursividade.
 */

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String args[]){
        int num = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        System.out.println("O fatorial é: " + FFat(num));
    
    }
    
    public static int FFat(int n){
        int fat = 0;
        
        if(n != 1){
            fat = n * FFat(n - 1);
            
            return fat;
        }
        return 1;
    }
}
