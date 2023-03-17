
import javax.swing.JOptionPane;

/*
44. Receba o número da base e do expoente. Calcule e mostre o valor da
potência.
 */

public class Ex44 {
    public static void main(String args[]){
        int opc = 0;
        int potencia[] = new int[2];
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Coletar a base/expoente. \n"
                    + "2 - Calcular potência. \n"
                    + "9 - Sair do programa."));
            
            switch(opc){
                case 1:
                    potencia = coletaNum(potencia);
                    break;
                    
                case 2: 
                    calculaPotencia(potencia);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }
    
    public static int[] coletaNum(int[] Vet){
        Vet[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        
        Vet[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
        
        return Vet;
    }
    
    public static void calculaPotencia(int[] vet){
        int i = 0, exponencia = 0;
        
        for(i = 1; i < vet[1]; i++){
            
            exponencia = vet[0] * vet[0] + exponencia;
            
        }
        
        JOptionPane.showMessageDialog(null, exponencia);
    }
}
