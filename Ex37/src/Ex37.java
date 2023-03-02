/*
37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu
N’nésimo termo.
*/

import javax.swing.JOptionPane;

public class Ex37 {
    public static void main(String args[]){
        int opc = 0, a = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada. \n"
                    + "1 - Escolher um número. \n"
                    + "2 - Calcular Fibonacci. \n"
                    + "9 - Sair do programa."));
            
            switch(opc){
                case 1:
                    a = escolhaNum(a);
                    break;
                    
                case 2:
                    calcularFibonacci(a);
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
    
    public static int escolhaNum(int b){
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        
        return b;
    }
    
    public static void calcularFibonacci(int n){
        int ant = 0, atual = 1, i = 0, prox = 0;
    
        for(i = 0; i <= n; i++){
            ant = atual;
            atual = prox;
            prox = ant + atual;
            
            JOptionPane.showMessageDialog(null, prox);
        }
    }
}
