package mavenproject.ex13;

import javax.swing.JOptionPane;

/*
13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia
 */

public class Ex13 {

    public static void main(String[] args) {
        double kg = 0, dias = 0;
        
        //Recebe o valor em quilos 
        kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a "
            + "qtde de quilos: "));
        
        //Converte o valor de quilos p/ gramas e calcula a quantidade de dias
        dias = (kg * 1000) / 50;
      
        //Mostra o resultado da conversão em dias
        JOptionPane.showMessageDialog(null, "O valor em dias são: " + dias);
   
    }
}
