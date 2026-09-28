package LeituraDeDados;

import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println(String.format("Olá usuario, para começarmos, insira seu nome"));
        String nome = scanner.nextLine();

        IO.println(String.format("Agora, insira seu cpf"));
        String cpf = scanner.nextLine();

        IO.println(String.format("insira sua idade"));
        int idade = scanner.nextInt();

        IO.println(String.format("insira sua altura em metros, utilize virgula"));
        double altura = scanner.nextDouble();
        scanner.nextLine();

        IO.println(String.format("insira sua peso em kg, utilize virgula"));
        double peso = scanner.nextDouble();
        scanner.nextLine();

        IO.println(String.format("Agora, insira seu estado civil"));
        String civil = scanner.nextLine();

        IO.println("Seja bem vindo " + nome + " ! seu CPF é: " + cpf + " você tem " + idade + "anos de idade, e possui altura de: " + altura + "metros, e seu estado civil é " + civil + "Seu peso é: "+peso + " parabens!");
    }
}
