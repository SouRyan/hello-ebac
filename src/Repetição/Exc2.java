package Repetição;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
    }
}
