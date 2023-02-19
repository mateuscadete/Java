/*
25. Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do
jogo em horas e minutos, sabendo que o tempo máximo é menor que 24
horas e pode começar num dia e terminar noutro.
 */

import javax.swing.JOptionPane;

public class Ex25 {

    public static void main(String args[]) {
        int Vet[] = new int[2];
        int opc = 0;

        //Coleta a opção digitada pelo usuário
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Receber horas.\n"
                    + "2 - Mostrar tempo de jogo..\n"
                    + "9 - Sair."));

            //Com base na opção executa um grupo de comandos
            switch (opc) {
                //Envia o vetor vazio, coleta e retorna valores digitados pelo usuário
                case 1:
                    Vet = recebeHoras(Vet);
                    break;
                   
                //Mostra os valores tratados pela função recebeHoras
                case 2:
                    JOptionPane.showMessageDialog(null, "Duração de " + Vet[0] + "horas"
                            + " e " + Vet[1] + " minutos");
                    break;

                //Finaliza a execução do programa
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;

                //Mensagem de erro caso o número seja inválido
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }

    public static int[] recebeHoras(int[] Vt) {
        int MM = 0, HH = 0, HI = 0, HF = 0, MI = 0, MF = 0;

        //Recebe a hora inicial, hora final, minuto inicial e minuto final
        HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
        
        MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial: "));

        HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));
        
        MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final: "));

        /*
        Compara e executa um grupo de comandos de acordo com os valores digitados
        Ex.:
        
            HI MI  HF MF                         
            
            4h30 e 17h45 -> 4 < 17 = 17 - 4 = 13h (HH)        
                         -> 30 < 45 = 45 - 30 = 15min (MM)
        
            17h45 e 4h30 -> 17 > 4 = (24 - 17) + 4 = 11h (HH)
                         -> 45 > 30 = (60 - 45) + 30 = 45min (MM)
        
            4h45 e 17h30 -> 4 < 17 = 17 - 4 = 13h (HH)
                         -> 45 > 30 = (60 - 45) + 30 = 45min (MM)
                         
            17h30 e 4h45 -> 17 > 4 = (24 - 17) + 4 = 11h (HH)
                         -> 30 < 45 = 45 - 30 = 15min (MM)
        */
        if (HI < HF) {
            HH = HF - HI;

            if (MI < MF) {
                MM = MF - MI;

            }
            else if (MI > MF) {
                MM = (60 - MI) + MF;
            }    
        } else if (HI > HF) {
            HH = (24 - HI) + HF;

            if (MI < MF) {
                MM = MF - MI;
            }
            else if (MI > MF) {
                MM = (60 - MI) + MF;
            }
        }
        //O vetor recebe os valores tratados
        Vt[0] = HH;
        Vt[1] = MM;

        //Retorna o vetor para a função principal
        return Vt;
    }
}
