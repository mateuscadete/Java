/*
41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
resultado 7.
 */

import javax.swing.JOptionPane;

public class Ex41 {
    public static void main(String args[]){
        int opc = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opc desejada: \n"
                    + "1 - Calcular/Mostrar dado. \n"
                    + "9 - Encerrar programa."));
        
            switch(opc){
                case 1:
                    calculaDado();
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
    
    public static void calculaDado(){
        int i = 0, i2 = 0, S = 0;
        
        for(i = 0; i <= 7; i++){
            for(i2 = 7; i2 >= 0; i2--){
                
                S = i + i2;
                
                if(S == 7){
                
                    JOptionPane.showMessageDialog(null, i + " + " + i2 + " = " + S);
                    
                }
            }
        } 
    }
}
