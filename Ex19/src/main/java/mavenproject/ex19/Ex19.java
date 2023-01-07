package mavenproject.ex19;

import javax.swing.JOptionPane;

/*
19. Receba 2 valores reais. Calcule e mostre o maior deles.
*/

public class Ex19 {

    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        
        //Recebe os valores do primeiro e segundo número
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro "
                + "número: "));
        
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo "
                + "número: "));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1 
                    + "O menor número é: " + num2);
        }
        else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "O maior número é : " + num2 
                    + "O menor número é: " + num1);
        }
        else if(num1 == num2){
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
        else{
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
       
    
    }
    
}
