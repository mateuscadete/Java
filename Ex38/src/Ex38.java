/*
Receba 100 números inteiros reais. Verifique e mostre o maior e o menos
valor. Obs.: somente valores positivos.
 */

import javax.swing.JOptionPane;

public class Ex38 {

    public static void main(String args[]) {
        int opc = 0;
        int vet[] = new int[100];

        //Repete o grupo de comandos abaixo até que a opc seja diferente de 0
        while (opc != 9) {
            //Coleta a opc digitada pelo usuário
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Receber números. \n"
                    + "2 - Mostrar números. \n"
                    + "9 - Sair do programa."));

            //De acordo com a opc digitada executa um comando específico conforme abaixo
            switch (opc) {
                case 1:
                    vet = recebeNumeros(vet);
                    break;

                case 2:
                    mostrarNumeros(vet);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }

    public static int[] recebeNumeros(int[] V) {
        int i = 0;

        //Percorre o vetor
        for (i = 0; i <= 99; i++) {
            //Recebe o vetor vazio e o preenche com os valores digitados pelo usuário
            V[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                    + "um número " + i + " de 100"));
        }
        return V;
    }

    public static void mostrarNumeros(int[] Vet) {
        int i = 0, i2 = 0, aux = 0;

        //Agrupa o vetor em ordem crescente 
        for (i = 0; i <= 99; i++) {
            for (i2 = i; i2 <= 99; i2++) {
                if (Vet[i] > Vet[i2]) {
                    aux = Vet[i];

                    Vet[i] = Vet[i2];

                    Vet[i2] = aux;
                }
            }
        }

        //Caso o maior número seja positivo, ou seja, maior que zero printa na tela
        if (Vet[0] > 0) {
            JOptionPane.showMessageDialog(null, "O menor é: " + Vet[0]);
        } else if (Vet[99] > 0) {
            //Caso o menor número seja positivo, ou seja, maior que zero printa na tela
            JOptionPane.showMessageDialog(null, "O maior é: " + Vet[99]);
        }
    }
}
