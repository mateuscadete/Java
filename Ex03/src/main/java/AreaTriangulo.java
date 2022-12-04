import javax.swing.JOptionPane;

/*
    3. Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */
public class AreaTriangulo {
    public static void main(String Args[]){
        double base = 0, altura = 0, resultado = 0;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        
        resultado = (base * altura) / 2;
        
        System.out.println("O resultado é: " + resultado);
    
    }
}
