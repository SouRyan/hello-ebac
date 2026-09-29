package POO.Exercíciomódulo12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        double preco;
        int resposta = 0;

        Scanner sc = new Scanner(System.in);
        boolean s= true;
        boolean j= true;

        while(s == true) {
            IO.println("Seja bem-vindo, diga quantos carros deseja: ");
            resposta = sc.nextInt();
            if (resposta >= 50) {
                IO.println("O limite maximo de carros que você pode comprar é de 50!");
            }else{
                Carro[] carro = new Carro[resposta];
                for(int i = 0; i < resposta; i++){

                    IO.println("Insira o nome do carro: ");
                    nome = sc.next();

                    IO.println("Insira o preço do carro: ");
                    preco = sc.nextDouble();
                    carro[i] = new Carro(nome, preco);
                }
                for (int i =0 ; i< resposta; i++ ){
                    IO.println((i+1)+"º Carro, modelo: "+ carro[i].nome + " preço: "+carro[i].preco);
                }
                s = false;
            }

        }

    }
}
