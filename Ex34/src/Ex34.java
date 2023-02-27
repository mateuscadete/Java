/*
 34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */

import javax.swing.JOptionPane;

public class Ex34 {
    public static void main(String[] args) {
       int opc = 0, a = 0;
       
       while(opc != 9){
       
           opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
                   + "1 - Coletar número. \n"
                   + "2 - Calcular tabuada. \n"
                   + "9 - Sair do programa. "));
           
           switch(opc){
               case 1:
                   a = coletaNumero(a);
                   break;
                   
               case 2:
                   calcularTabuada(a);
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
    
    public static int coletaNumero(int n){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
    
        return n;
    }
    
    public static void calcularTabuada(int b){
        int i = 0, resultado = 0;
        
        for(i = 0; i <= 10; i++){
            resultado = b * i;
            
            JOptionPane.showInputDialog(null, b + " X " + i + " = " + resultado);
        }
    }
    
}