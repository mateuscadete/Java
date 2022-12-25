package mavenproject.ex12;

import javax.swing.JOptionPane;

/*
12. Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 17 anos.
 */

public class Ex12 {

    public static void main(String[] args) {
        int anoNascimento = 0, anoAtual = 0, idade = 0;
        
        //Recebe o ano de nascimento e atribui à variável correspondente
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano "
            + "de nascimento: "));
        
        //Recebe o ano atual e atribui à variável correspondente
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"
            + " atual: "));
        
        /* Calcula a idade com base na variável anoNascimento e
        anoAtual e atribui a variável idade */
        idade = anoAtual - anoNascimento;
        
        // Mostra a idade
        JOptionPane.showMessageDialog(null, "A idade é: " + idade);
               
    }
}
