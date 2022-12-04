import javax.swing.JOptionPane;

/*
1. Coletar o valor de um quadrado, calcular sua área 
e apresentar o resultado.
 */

public class AreaQuadrado {
    public static void main(String Args[]){
        double a = 0, resultado = 0;
        
        // Coleta o valor do lado do quadrado
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
        
        // Calcula a área do quadrado utilizando o lado elevado ao quadrado p/ calcular a área
        resultado = Math.pow(a,2);
        
        // Mostra o resultado
        System.out.println("O resultado é: " + resultado);
    
    }
}
