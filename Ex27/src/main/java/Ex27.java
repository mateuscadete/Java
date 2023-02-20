/*
27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de
duração (minutos). Calcule e mostre a velocidade média em km/h.
 */

import javax.swing.JOptionPane;

public class Ex27{
    public static void main(String args[]){
        int opc = 0;
        double[] Vet = new double[2];
        
        //Repete a sequência de códigos enquanto opc é diferente de 9
        while(opc != 9){
            //Coleta opções digitadas pelo usuário
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1- Coletar números. \n"
                    + "2- Calcular a velocidade média. \n"
                    + "9- Encerrar programa."));
            
            //Captura a opc desejada e executa um grupo de comandos
            switch(opc){
                //Caso seja digitado 1 leva o vetor "a" para a função coletaNumeros
                case 1:
                    Vet = coletaNumeros(Vet);
                    break;
                    
                //Caso seja digitado 2 leva o vetor "a" para o método coletaNumeros    
                case 2:
                    calculaMedia(Vet);
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
    
    public static double[] coletaNumeros(double[] v){
        //Coleta os números digitados pelo usuário e os atribui ao vetor
        v[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a extenção do circuito em metros: "));
        
        v[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do percurso em minutos: "));   
        
        //Retorna os valores atribuidos ao vetor para a main function
        return v;
    }
    
    public static void calculaMedia(double[] vet){
        double Km = 0;
        
        /*
            Calcula a Vm com base na seguinte lógica: Km/h = (metros / 1000) / (minutos / 60)
                                                        " =     km          /       h
                                                        " = <resultado>
        */
        Km = (vet[0] / 1000) / (vet[1] / 60);
        
        //Mostra o resultado do cálculo ao usuário
        JOptionPane.showMessageDialog(null, "A velocidade média é: " + Km + " Km/h");
    }
}