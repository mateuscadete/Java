import javax.swing.JOptionPane;

/*
Utilizar a modularização para: Coletar o valor do lado de um quadrado, 
calcular sua área e apresentar o resultado.
*/
public class Ex01{
    public static void main(String args[]){
        double lado = 0;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite a "
                + "área do quadrado: "));
        
        System.out.println("A área é: " + FArea(lado));
        
    }
    static double FArea(double l){
        
        l = Math.pow(l,2);
        
        return l;
    }

}
