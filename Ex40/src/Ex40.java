/*
40. Receba 2 números inteiros. Verifique e mostre todos os números primos
existentes entre eles.
 */

import javax.swing.JOptionPane;

public class Ex40 {

    public static void main(String args[]) {
        int opc = 0;
        int Vet[] = new int[2];

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Coletar 2 números. \n"
                    + "2 - Mostrar primos existentes entre eles. \n"
                    + "9 - Sair do programa."));

            switch (opc) {
                case 1:
                    Vet = coletaNum(Vet);
                    break;

                case 2:
                    mostraPrimos(Vet);
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

    public static int[] coletaNum(int[] V) {
        V[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));

        V[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        return V;
    }

    public static void mostraPrimos(int[] vet) {
        int i = 0, i2 = 0, tamanho = 0;

        if (vet[0] < vet[1]) {
            tamanho = vet[1] - vet[0];
        } else {
            tamanho = vet[0] - vet[1];
        }

        int array[] = new int[tamanho];

        for (int i = vet[0]; i <= vet[1]; i++) {
            int eprimo = 0, nprimo = 0;
            
            for (int i2 = i + 1; i2 <= vet[1]; i++) {
                if (array[i] % array[i2] == 0) {
                    nprimo = nprimo + 1;
                } else if (array[i] % 1 == 0 && array[i] % array[i] == 0) {
                    eprimo = eprimo + 1;
                }
                
                if(eprimo == 1 && nprimo == 0){
                    JOptionPane.showMessageDialog(null, array[i]);
                }
            }
        }

    }
}
