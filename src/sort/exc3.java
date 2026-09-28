package sort;

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        String invertido = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        for (int i = 0; i < nome.length(); i++){
             invertido = nome.charAt(i) + invertido;
        }
        System.out.println(invertido);
    }
}
