// 04) Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida.

import javax.swing.JOptionPane;

public class EX04 {
    public static void main(String args[]){
        double c, resultado;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor em graus Celsius: "));
        
        resultado = (9 * c + 160) / 5;
        
        System.out.println("O resultado é: " + resultado);
    
    }
}
