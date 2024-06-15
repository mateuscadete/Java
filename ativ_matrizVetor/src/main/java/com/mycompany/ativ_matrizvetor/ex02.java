/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_matrizvetor;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ex02 {

    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;

        //Vetor para armazenar as tentativas do jogador
        int[] tentativas = new int[100]; //Assumimos que o jogador não fará mais de 100 tentativas
        int numTentativas = 0;
        boolean acertou = false;

        System.out.println("Bem vindo ao jogo de Adivinhe o Número!");
        System.out.println("Tente advinhar o número secreto entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas[numTentativas] = tentativa;
            numTentativas++;

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você adivinhou o número em " + numTentativas + "tentativas.");
                acertou = true;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é maior que " + tentativa + ".");
            } else {
                System.out.println("O número secreto é menor que " + tentativa + ".");

            }
        }

        //Imprimir todas as tentativas do jogador
        System.out.println("Suas tentativas: ");
        for (int i = 0; i < numTentativas; i++) {
            System.out.println(tentativas[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }

}
