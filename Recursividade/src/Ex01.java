/*
1)   Serie1 = (1+2+3+...+100) 
 */

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String args[]){
        int num = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        System.out.println("O resultado é: " +FSerie(num));
    
    }
    
    public static int FSerie(int n){
        int S = 0;
        
        if(n != 1){
            S = n + FSerie(n - 1);
        
            return S;
        }
        return 1;
    }
}