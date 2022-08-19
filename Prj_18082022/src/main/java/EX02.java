// 02) Receba o valor de um salário, calcule e mostre o resultado
import javax.swing.JOptionPane;

public class EX02 {
    public static void main(String args[]){
        double salario, resultado;
        
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salário: "));
        
        resultado = salario * 0.15;
        
        System.out.println("O resultado é: ");
    }
}
