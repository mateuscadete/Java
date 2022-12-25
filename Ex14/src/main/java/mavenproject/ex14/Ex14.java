package mavenproject.ex14;

/*
14. Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/

import javax.swing.JOptionPane;

public class Ex14 {

    public static void main(String[] args) {
        int angulo1 = 0, angulo2 = 0, resultado = 0;
        
        //Recebe o valor do primeiro ângulo
        angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "
            + "do primeiro ângulo: "));
        
        //Recebe o valor do segundo ângulo
        angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "
            + "do segundo ângulo: "));
        
        //Calcula o valor do ângulo baseando-se em 180º
        resultado = 180 - (angulo1 + angulo2);
        
        JOptionPane.showMessageDialog(null, "O valor do 3º ângulo é: " + resultado);
        
    }
}
