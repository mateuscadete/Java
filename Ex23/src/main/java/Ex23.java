/*
23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Ex23 {

    public static void main(String args[]) {
        int opc = 0;
        
        int Vet[] = new int[4];

        while (opc != 9) {
            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Coleta 4 números"
                + "\n 2 - Ordena em ordem crescente \n 3 - Mostrar valores \n 9 - Sair do programa"));
            
            switch (opc) {
                case 1:
                    Vet = coletaNumeros(Vet);
                    break;

                case 2:
                    Vet = ordenarVetor(Vet);
                    break;

                case 3:
                    mostrarVetor(Vet);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;  
                    
                default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");    
            }
        }
    }    
        
    public static int[] coletaNumeros(int[] vt){
        int i = 0;
        
        for (i = 0; i < 4; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:  " + " posição:"+ i + "/4"));
        }
        return vt;
    }
    
    public static int[] ordenarVetor(int[] Vt){
        int i = 0, i2 = 0, aux = 0;

        for (i = 0; i < 4; i++) {
            for (i2 = i + 1; i2 < 4; i2++) {
                if (Vt[i] > Vt[i2]) {
                    aux = Vt[i];

                    Vt[i] = Vt[i2];

                    Vt[i2] = aux;
                }
            }
        }   
        return Vt;

    }

    static void mostrarVetor(int[] V) {
        int i = 0;
        
        for (i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, "\n " + V[i]);
        }
    }

}
