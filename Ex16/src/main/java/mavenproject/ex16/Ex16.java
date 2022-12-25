package mavenproject.ex16;

import javax.swing.JOptionPane;

/*
16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
de desconto e o número de descendentes. Calcule o salário que serão as
horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
Líquido. Exiba o salário a receber.
*/

public class Ex16 {

    public static void main(String[] args) {
        double valorHora = 0, salario = 0;
        int horasTrabalhadas = 0, dependentes = 0;
        
        //Coleta a qtde das horas trabalhadas
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite "
            + "a qtde de horas trabalhadas: "));
        
        //Coleta o valor por hora trabalhada
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"
                + " por hora: "));
        
        //Coleta a qtde de dependentes
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde de"
                + " dependentes"));
        
        //Calcula o salário com base nas variáveis anteriores
        salario = (valorHora * horasTrabalhadas) * 22 + (dependentes * 100);
        
        //Mostra o valor do salário
        JOptionPane.showMessageDialog(null, "O valor do salário é: " + salario);
    }
}
