// 32. Receba um número inteiro. Calcule e mostre o seu fatorial.

import javax.swing.JOptionPane;

public class Ex32 {
    public static void main(String args[]){
        int opc = 0, a = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n"
                    + "1 - Escolher um número. \n"
                    + "2 - Calcular fatorial. \n"
                    + "9 - Encerrar programa. "));
            
            switch(opc){
                case 1:
                    a = escolherNumero(a);
                    break;
                    
                case 2: 
                    calculaFatorial(a);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");
               
            }        
            
        }
    
    }
    
    public static int escolherNumero(int a){

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    
        return a;
    }
    
    public static void calculaFatorial(int a){
        int i = 0, fat = 1;
        
        for(i = a; i > 1; i--){
            fat = fat * i;
        }
        
        JOptionPane.showMessageDialog(null, fat);
    }
    
}