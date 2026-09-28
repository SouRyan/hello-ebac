package Repetição;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int i = 1;
        String texto = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Bom dia seja Bem-Vindo");
        do{
            System.out.println("1 - Continuar e 2 - Sair");
            i = input.nextInt();
            if(i==1){
                System.out.println("Insira uma frase: ");
                input.nextLine();
                texto = input.nextLine();
                System.out.println("Sua frase foi: "+texto);
            }else{
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                i=0;
            }

        }while(i==1);
    }

}
