import javax.swing.JOptionPane;

/*
4. Receba a temperatura em graus Celsius. Calcule e mostre
a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

*/
public class Ex04 {

    public static void main(String[] args) {
        int f= 0, c= 0;
        
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite a "
                + "temperatura em graus"));
        
        f = (9 * c + 160) / 5;
        
        System.out.println("O resultado é: " + f);
        
    }
}
