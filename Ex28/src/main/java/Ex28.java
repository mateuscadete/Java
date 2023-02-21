
import javax.swing.JOptionPane;

/*
28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o
novo preço sabendo que:
Venda Mensal Preço Atual Preço Novo
< 500 < 30 + 10%
>= 500 e < 1000 >= 30 e < 80 +15%
>= 1000 >= 80 - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 */

public class Ex28{
    public static void main(String args[]){
        int opc = 0;
        double[] Vetor = new double[2];
        
        //Repete a sequência de códigos enquanto opc é diferente de 9
        while(opc != 9){
            //Coleta opções digitadas pelo usuário
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Coletar valores. \n"
                    + "2 - Calcular reajuste. \n"
                    + "9 - Sair do programa. \n "));
            
            //Captura a opc desejada e executa um grupo de comandos
            switch(opc){
                case 1:
                    //Caso seja digitado 1 leva o vetor para a função coletarValores
                    Vetor = coletarValores(Vetor);
                    break;
                
                case 2:
                    //Caso seja digitado 2 leva o vetor para o método calcularReajuste 
                    calcularReajuste(Vetor);
                    break;
                    
                    //Caso seja digitado 9 encerra o programa 
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                    //Caso contrário "Valor inválido"
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }
    
    public static double[] coletarValores(double[] vet){
        //Coleta os valores digitados pelo usuário e os atribui as posições 0 e 1 do vetor
        vet[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda mensal: "));
        
        vet[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do preço atual: "));
        
        //Retorna o vetor com os valores novos
        return vet;
    }
    
    public static void calcularReajuste(double[] Vet){
       
        /*
            Compara os valores digitados levando em conta o seguinte príncipio:
                Venda Mensal        Preço Atual         Preço Novo
                < 500               < 30                + 10%
                >= 500 e < 1000     >= 30 e < 80        +15%
                >= 1000             >= 80               - 5%
                
            Obs.: para outras condições, preço novo será igual ao preço atual.
        */
        if(Vet[0] < 500 && Vet[1] < 30){
            Vet[1] = (Vet[1] *  (10 / 100)) + Vet[1];
            
            JOptionPane.showMessageDialog(null, "O reajuste é: " + Vet[1]);
        }
        else if(Vet[0] >= 500 && Vet[0] < 1000 && Vet[1] >= 30 && Vet[1] < 80){
            Vet[1] = (Vet[1] *  (15 / 100)) + Vet[1];
           
            JOptionPane.showMessageDialog(null, "O reajuste é: " + Vet[1]);
        }
        else if(Vet[0] >= 1000 && Vet[1] >= 80){
            Vet[1] = (Vet[1] *  (5 / 100)) - Vet[1];
            
            JOptionPane.showMessageDialog(null, "O reajuste é: " + Vet[1]);
        }
        else{
            JOptionPane.showMessageDialog(null, "O preço atual é: " + Vet[1]);
        }
    }
}