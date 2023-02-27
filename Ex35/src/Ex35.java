/*
    Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e
mostre o resultado da somatória dos números ímpares entre esses valores.
 */

import javax.swing.JOptionPane;

public class Ex35 {
    public static void main(String args[]){
        int opc = 0; 
        int a[] = new int[2];
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Coletar 2 números.\n"
                    + "2 - Calcular ímpares. \n"
                    + "9 - Sair do programa."));
            
            switch(opc){
                case 1:
                    a = coletaNum(a);
                    break;
                    
                case 2: 
                    calculaImpar(a);
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
    
    public static int[] coletaNum(int[] a){
        a[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        
        a[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        return a;
    }
    
    public static void calculaImpar(int[] a){
        int resultado = 0, i = 0, S = 0;
        
        if(a[0] > a[1]){
            resultado = a[0] - a[1];
        
            for(i = a[1] + 1; i <= a[0]; i++){
                if(i % 2 != 0){
                    S = i + S;
                
                }
            }
        }
        else if(a[1] > a[0]){
            resultado = a[1] - a[0];
        
            for(i = a[0] + 1; i <= a[1]; i++){
                if(i % 2 != 0){
                    S = i + S;
                }
            }
        }
        else if(a[1] == a[0]){
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor inválido");
    
        }
        
        JOptionPane.showMessageDialog(null, S);
    }    
}

