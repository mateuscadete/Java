package mavenproject.ex17;

import javax.swing.JOptionPane;

/* 
17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o
automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
*/

public class Ex17 {
    public static void main(String[] args) {
        double litros = 0, tempo = 0, velocidadeMedia = 0;
        
        //Recebe o tempo de percurso
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite "
            + "o tempo de percurso: "));
        
        //Recebe a velocidade média
        velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite "
            + "a velocidade média: "));
        
        //Calcula a qtde em litros com base nas variáveis coletadas
        litros = (velocidadeMedia / 12) * tempo ;
        
        //Exibe a qtde de litros gastos
        JOptionPane.showMessageDialog(null, "A qtde de litros gastos é: " + litros);

    }
}
