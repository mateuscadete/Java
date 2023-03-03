/*
39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N
 */

import javax.swing.JOptionPane;

public class Ex39 {

    public static void main(String args[]) {
        int opc = 0, a = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Calcular qtde de grãos. \n"
                    + "2 - Mostrar valores. \n"
                    + "9 - Sair do programa."));

            switch (opc) {
                case 1:
                    a = calcularQtde(a);
                    break;

                case 2:
                    mostrarQtde(a);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }

    public static int calcularQtde(int b) {
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n: "));

        return b;
    }

    public static void mostrarQtde(int c) {
        int i = 0, resultado = 1;

        for (i = 1; i <= 64; i++) {
            if (resultado <= c) {
                resultado = resultado * 2;

                System.out.println(i + "\n" + resultado);
            }
        }
    }
}
