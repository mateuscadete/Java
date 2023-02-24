
import javax.swing.JOptionPane;

// 33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.



public class Ex33 {
    public static void main(String args[]){
        int opc = 0, a = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                    + "1 - Receber número. \n"
                    + "2 - Cálcular série. \n"
                    + "9 - Sair do programa."));
            
            switch(opc){
                case 1:
                    a = recebeNumero(a);
                    break;
                    
                case 2: 
                    calculaSerie(a);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }
    }
    
    public static int recebeNumero(int b){
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        return b;
    }
    
    public static void calculaSerie(int a){
        int i = 0, resultado = 0;
        
        for(i = 2; i <= a; i++){
            
            resultado = 1 + (1 / i) + resultado;
            
            JOptionPane.showMessageDialog(null, resultado);
        }     
    }
}
