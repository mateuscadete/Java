/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ_matrizvetor;

/**
 *
 * @author Admin
 */
public class ex01 {

    public static void main(String[] args) {
        // Número de semanas e dias da semana
        int semanas = 5;
        int diasPorSemana = 7;

        // Matriz para representar o calendário
        int[][] calendario = new int[semanas][diasPorSemana];

        // Preenchendo a matriz com os dias do mês
        int dia = 1;
        boolean mesIniciado = false;

        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < diasPorSemana; j++) {
                // Junho de 2024 começa em um sábado (índice 5)
                if (i == 0 && j < 5) {
                    calendario[i][j] = 0; //Dias anteriores ao início do mês
                } else if (dia <= 30) {
                    calendario[i][j] = dia++;
                } else {
                    calendario[i][j] = 0; //Dias após o término do mês
                }

            }

        }

        //Imprimindo o calendário
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
        System.out.println("Calendário de Junho 2024:");
        for (String diaDaSemana : diasDaSemana) {
            System.out.print(diaDaSemana + "\t");
        }
        System.out.println();
        
        for(int i = 0; i < semanas; i++){
            for(int j = 0; j < diasPorSemana; j++){
                if(calendario[i][j] == 0){
                    System.out.print("\t"); //Espaço vazio para os dias fora do mês
                    
                }else{
                    System.out.print(calendario[i][j] + "\t");
                    
                }
                
            }
            System.out.println();
        }
    }
}
