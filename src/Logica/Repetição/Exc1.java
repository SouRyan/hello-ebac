package Logica.Repetição;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println("Decresente : ");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
