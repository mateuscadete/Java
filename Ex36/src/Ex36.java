/*
Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args) {
        int opc = 0;
        double a = 0;
        
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
                    a = calculaSerie(a);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }
    
    public static double recebeNum(double a){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado: "));
        
        return a;
    }
    
    public static double calculaSerie(double a){
        double S = 0;
        
        if(a != 1){
            S = 1 + 1 / S * calculaSerie(a - 1);
        }
        return S;
    }
    
}
