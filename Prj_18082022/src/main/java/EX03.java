// 03) Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
import javax.swing.JOptionPane;

public class EX03 {
    public static void main(String args[]){
        double b, h, resultado;
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        
        h = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        resultado = (b * h) / 2;
        
        System.out.println("O resultado é: " + resultado);
        
    }
}
