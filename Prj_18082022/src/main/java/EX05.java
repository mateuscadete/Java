/* 05) Receba os coeficientes A, B e C de uma equação do 2º grau (ax ^2 + bx + c). 
Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes);
*/
import javax.swing.JOptionPane;

public class EX05 {
    public static void main(String args[]){
        double a, b, c, x1, x2, delta, resultado;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
        
        x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("O valor de x1 é: " + x1);
        
        System.out.println("O valor de x2 é: " + x2);
    
    }
}
