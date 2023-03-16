/*
42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */

import javax.swing.JOptionPane;

public class Ex42 {

    public static void main(String args[]) {
        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Calcular/Mostrar série. \n"
                    + "9 - Sair do programa. "));

            switch (opc) {
                case 1:
                    calcularSerie();
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        }
    }

    public static void calcularSerie() {
        double i = 0, i2 = 3, S = 0;

        for (i = 2; i <= 50; i++) {
            
            S = S + i / i2;

            System.out.println((S + 1) + " - " + i + " - " + i2);
            
            i2 = i2 + 2;       
        }
    }
}
