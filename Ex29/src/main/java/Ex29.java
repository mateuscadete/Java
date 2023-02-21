/*
29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */

import javax.swing.JOptionPane;

public class Ex29{
    public static void main(String args[]){
        int opc = 0;
        double valor = 0;
        
        //Repete a sequência de códigos enquanto opc é diferente de 9
        while(opc != 9){
            //Coleta opções digitadas pelo usuário
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Escolher investimento. \n"
                    + "2 - Mostrar investimento. \n"
                    + "9 - Encerrar programa."));
            
            //Captura a opc desejada e executa um grupo de comandos
            switch(opc){
                case 1:
                    //Caso seja digitado 1 leva o vetor para a função escolherInvestimento
                    valor = escolherInvestimento(valor);
                    break;
                    
                case 2:
                    //Caso seja digitado 2 leva o vetor para o método mostrarInvestimento
                    mostrarInvestimento(valor);
                    break;
                    
                case 9:
                    //Caso seja digitado 9 encerra o programa 
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    //Caso contrário "Valor inválido"
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }
    
    public static double escolherInvestimento(double num){
        int investimento = 0;
        
        //Coleta os valores digitados pelo usuário
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite valor do investimento: "));
        
        investimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o investimento desejado: \n"
                + "1 - Poupança. \n"
                + "2 - Renda fixa."));
        
        //De acordo com a opção de investimento digitado calcula o reajuste
        switch(investimento){
            case 1:
                num = num + (num * 0.03) * 30;
                break;
                
            case 2:
                num = num + (num * 0.05) * 30;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
        
        //Retorna o valor calculado para a função principal
        return num;
    }
    
    public static void mostrarInvestimento(double valor){
        //Mostra o resultado do investimento reajustado em 30 dias
        JOptionPane.showMessageDialog(null, "O valor do investimento reajustado é: " + valor);

    }
}
