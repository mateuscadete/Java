package mavenproject.ex15;

/*
15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
a hipotenusa.
*/

import javax.swing.JOptionPane;

public class Ex15 {

    public static void main(String[] args) {
        double cateto1 = 0, cateto2 = 0, hipotenusa = 0;
        
        //Recebe o valor do primeiro cateto
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
            + "valor do primeiro cateto: "));
        
        //Recebe o valor do segundo cateto
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o "
                + "valor do segundo cateto: "));
        
        //Calcula a hipotenusa com base nas variáveis coletadas
        hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        //Mostra o resultado do cálculo da hipotenusa
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
    }
}
