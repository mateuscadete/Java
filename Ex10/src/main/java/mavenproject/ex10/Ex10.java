package mavenproject.ex10;

import javax.swing.JOptionPane;

/*
10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/

public class Ex10 {
    public static void main(String args[]) {
        double a = 0, b = 0, resultado = 0;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "primeiro número: "));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "segundo número: "));
        
        if(a < b){
            resultado = b - a; 
        }
        else if(b < a){
            resultado = a - b;
        }
        else if(a == b){
           JOptionPane.showMessageDialog(null,"Os números são iguais");
        }    
        else{
            System.out.print("O valor é inválido");
        }
        
        JOptionPane.showMessageDialog(null,"A diferença é: " + resultado);
    }
}
