import javax.swing.JOptionPane;

/*
2. Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */

public class CalculaSalario {
    public static void main(String Args[]){
        double salario = 0, resultado = 0;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário: "));
        
        resultado = (salario * 0.15) + salario;
        
        System.out.println("O salário reajustado é: " + resultado);
    
    }
    
}
