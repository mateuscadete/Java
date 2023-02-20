/*
26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo
do menor.
 */

import javax.swing.JOptionPane;

public class Ex26 {

    public static void main(String args[]) {
        int opc = 0;
        int a[] = new int[2];

        //Repete a sequência de códigos enquanto opc é diferente de 9
        while (opc != 9) {
            //Coleta opções digitadas pelo usuário
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Coletar números. \n"
                    + "2 - Comparar números. \n"
                    + "9 - Sair do programa."));

            //Captura a opc desejada e executa um grupo de comandos
            switch (opc) {
                case 1:
                    //Caso seja digitado 1 leva o vetor "a" para a função coletaNumeros
                    a = coletaNumeros(a);
                    break;

                case 2:
                    //Caso seja digitado 2 leva o vetor "a" para o método coletaNumeros
                    comparaNumeros(a);
                    break;

                case 9:
                    //Caso seja digitado 9 encerra o programa
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    //Caso contrário "Valor inválido"
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                    break;
            }
        }
    }

    public static int[] coletaNumeros(int[] b) {
        //Coleta os números digitados pelo usuário e os atribui ao vetor
        b[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));

        b[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        //Retorna os valores atribuidos ao vetor para a main function
        return b;
    }

    public static void comparaNumeros(int[] c) {
        /*Compara o maior com o menor número, caso o maior seja múltiplo do menor]
            Ex.: 6, 3 = 6 > 3 = 6 % 3 = 0 saída: "6 é múltiplo de 3"
                 3, 6 = 3 < 6 = 6 % 3 = 0 saída: "6 é múltiplo de 3"
        */
        if (c[0] < c[1]) {
            if (c[1] % c[0] == 0) {
                JOptionPane.showMessageDialog(null, c[1] + " é múltiplo de " + c[0]);
            }
        } else if (c[0] > c[1]) {
            if (c[0] % c[1] == 0) {
                JOptionPane.showMessageDialog(null, c[0] + " é múltiplo de " + c[1]);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números não são múltiplos");
        }
    }

}
