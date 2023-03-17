/*
43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que
Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
e cresce 2 cm ao ano.
 */

import javax.swing.JOptionPane;

public class Ex43 {
    public static void main(String args[]){
        int opc = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Calcular/Mostrar idade de Maria e Ana.\n"
                    + "9 - Encerrar programa. "));
        
            switch(opc){
                case 1:
                    calcularIdade();
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
    
    public static void calcularIdade(){
        int i = 0;
        double ana = 1.1, maria = 1.5;
    
        while(ana != maria){
            ana = ana + 3;
        
            maria = maria + 2;
            
            i++;
        }
        
        JOptionPane.showMessageDialog(null, i);
    
    }
}
