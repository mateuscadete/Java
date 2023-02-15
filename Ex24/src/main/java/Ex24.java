/*
24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

import javax.swing.JOptionPane;

public class Ex24 {

    public static void main(String args[]) {
        int opc = 0;
        double a = 0;

        while (opc != 9) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Coletar número \n"
                    + "2 - Comparar número \n"
                    + "9 - Sair"));

            switch (opc) {
                case 1:
                    a = FRecebe(a);
                    break;

                case 2:
                    a = FDivide(a);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }

    public static double FRecebe(double b) {

        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

        return b;
    }

    public static double FDivide(double c) {

        //Compara o resto da divisão, caso for zero é divisível por 2
        if (c % 2 == 0) {
            JOptionPane.showMessageDialog(null, "É divisível por 2");
            
            if(c % 3 == 0){
                JOptionPane.showMessageDialog(null, "É divisível por 3");
            }
            else{
                JOptionPane.showMessageDialog(null, "Não é divisível por 3");
            }

        } 
        else {
            JOptionPane.showMessageDialog(null, "Não é divisível por 2");
            
            //Compara o resto da divisão, caso for zero é divisível por 3
            if (c % 3 == 0) {
                JOptionPane.showMessageDialog(null, "É divisível por 3");

            } 
            //Caso contrário não é divisível por 3
            else {
                JOptionPane.showMessageDialog(null, "Não é divisível por 3");
            }
        }

        return c;
    }

}
