import javax.swing.JOptionPane;

/* 
5. Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
*/
public class Ex05 {
    public static void main(String[] args) {
       double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, delta = 0;

       // Recebe os valores de a, b e c
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
       
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));

       c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
       
       // Calcula o valor do delta
       delta = Math.pow(b, 2) - 4 * a * c;
       
       /* Compara se delta é igual a zero ou seja se possui raízes iguais
        em seguida calcula as raízes da equação
       */
       if (delta == 0){
           x1 = -1 * b + (Math.sqrt(delta)) / 2 * a;
           
           System.out.println(x1);
       }
       else{
            x1 = -1 * b + (Math.sqrt(delta)) / 2 * a;
            
            x2 = -1 * b - (Math.sqrt(delta)) / 2 * a;
            
            System.out.println("x1 é: " + x1 + "\n" + "x2 é: " + x2);
       }
     
    }
}
