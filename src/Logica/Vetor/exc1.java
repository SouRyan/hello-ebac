package Logica.Vetor;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Vetor");
        for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor.length - 1; i++) {

            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
        }

        System.out.println("");
        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();
        String nomeLow = nome.toLowerCase();
        int qtde=0;
        for (int i = 0; i < nomeLow.length(); i++) {
            char c = nomeLow.charAt(i);
            if(c == 'a' || c== 'e' || c == 'i' || c == 'o' || c == 'u') {
                qtde += 1;
            }
        }
        System.out.println("Seu nome possui: " + qtde + " Vogais");

    }
}
