package mavenproject.ex18;

import javax.swing.JOptionPane;

/* 
17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

public class Ex18 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0, resultado = 0;
        
        //Recebe o primeiro número
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite "
            + "o primeiro número: "));
        
        //Recebe o segundo número
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite "
            + "o segundo número: "));
        
        if(n1 > n2){
            resultado = n1 - n2;
        }
        else if(n2 > n1){
            resultado = n2 - n1;
        }
        else{
            JOptionPane.showMessageDialog(null,"Valor inválido");
        }
        
        JOptionPane.showMessageDialog(null,"A diferença é: " + resultado);
        
    }
}
