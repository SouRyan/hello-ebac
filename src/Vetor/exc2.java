package Vetor;

import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 ==0 ){
                vetor[i] = vetor[i] *2;
            }else {
                vetor[i] = (int) Math.pow(vetor[i],2);
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }


    }
}
