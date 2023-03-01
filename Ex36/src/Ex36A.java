/*
Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

import javax.swing.JOptionPane;

public class Ex36A {
    public static void main(String[] args) {
        int opc = 0;
        int a = 0;
        
        while(opc != 0){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Receber número. \n"
                    + "2 - Calcular a Série. \n"
                    + "9 - Sair do programa. "));
        
            switch(opc){
                case 1:
                    a = recebeNum(a);
                    break;
                
                case 2: 
                    calculaSerie(a);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        }
    }
    
    public static int recebeNum(int a){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        
        return a;
    }
    
    public static void calculaSerie(int a){
        int i = 0;
        double S = 0;
        
        for(i = a; i > 1; i--){
            S = 1 + 1 / S * i;
        }
        
        JOptionPane.showMessageDialog(null, S);
    }
    
}
