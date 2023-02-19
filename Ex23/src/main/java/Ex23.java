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
            //Mostra tela com as opções 1 - Coleta 4 números, 2 - Ordena em ordem crescente, 3 - Mostrar valores, 9 - Sair do programa
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Coleta 4 números"
                + "\n 2 - Ordena em ordem crescente \n 3 - Mostrar valores \n 9 - Sair do programa"));
            
            //Captura a opção digitada pelo usuário e executa uma função/procedimento
            switch (opc) {
                case 1:
                    //Selecionada a opc 1 inicializa a função e envia o vetor para a função coletaNumeros e coleta 4 números digitados pelo usuário
                    Vet = coletaNumeros(Vet);
                    break;
                    
                case 2:
                     //Selecionada a opc 2 inicializa a função e envia o vetor para a função ordenarVetor e ordena o vetor em ordem crescente
                    Vet = ordenarVetor(Vet);
                    break;
                    
                case 3:
                     //Selecionada a opc 3 inicializa a função e envia o vetor para a função mostrarVetor e o mostra em tela
                    mostrarVetor(Vet);
                    break;

                case 9:
                     //Selecionada a opc 9 encerra o programa
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;  
                    
                default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");    
            }
        }
    }    
        
    public static int[] coletaNumeros(int[] vt){
        int i = 0;
        
        //Recebe o vetor vazio e coleta os 4 números pelo usuário
        for (i = 0; i < 4; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:  " + " posição:"+ i + "/4"));
        }
        //Retorna o vetor com os valores coletados
        return vt;
    }
    
    public static int[] ordenarVetor(int[] Vt){
        int i = 0, i2 = 0, aux = 0;
    
        //Recebe o vetor desordenado e o organiza em ordem crescente
        for (i = 0; i < 4; i++) {
            //Vetor inicializado na posição zero compara o primeiro com a segunda posição depois inicializa uma condição
            for (i2 = i + 1; i2 < 4; i2++) {
                //Compara a posição com a atual se caso a posição atual for maior que a próxima troca, assim comparando cada uma com todas (bubble sort)
                if (Vt[i] > Vt[i2]) {
                    aux = Vt[i];

                    Vt[i] = Vt[i2];

                    Vt[i2] = aux;
                }
            }
        }   
        //Retorna o vetor para a função principal organizado
        return Vt;

    }

    static void mostrarVetor(int[] V) {
        int i = 0;
        
        //Recebe o vetor ordenado e mostra ao usuário
        for (i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, "\n " + V[i]);
        }
    }

}
