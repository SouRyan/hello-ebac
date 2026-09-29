package Logica.IfElse;

import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O primeiro número "+ num1+ " é maior que "+num2);
        }else if (num1 < num2) {
            System.out.println("O segundo número "+ num2+ " é maior que "+num1);
        }else {
            System.out.println("Os número são iguais");
        }
    }
}
