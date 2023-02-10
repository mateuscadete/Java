/*
 21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
Mostre a mensagem de acordo com a média:
a. Se a média for >= 6,0 exibir “APROVADO”;
b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c. Se a média for < 3,0 exibir “RETIDO”.
 */

import javax.swing.JOptionPane;

public class Ex21 {
    
    static double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
    
    public static void main(String args[]){
        int opc = 0;
       
        opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo: "
                + "\n 1 - Coletar as notas do aluno. "
                + "\n 2 - Calcula e mostra a média do aluno. "));
        
        switch(opc){
            case 1: 
                FColeta();
                break;
                
            case 2:
                FCalcula();
                break;
                
        } 
    }
    
    static void FColeta(){
        double n1 = 0 , n2 = 0, n3 = 0, n4 = 0;
        
        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira "
                + "nota: "));
        
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda "
                + "nota: "));
        
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira "
                + "nota: "));
        
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta "
                + "nota: "));

    }
    
    static void FCalcula(){
        double media = 0;
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
  
}
