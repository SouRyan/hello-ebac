package POO.Exercíciomódulo13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int qtdeAlunos;
    int qtdeProvas;
    boolean continuar = true;
    System.out.println("Quantos alunos deseja cadastrar?");
    qtdeAlunos = input.nextInt();
    Alunos[] aluno = new Alunos[qtdeAlunos];

    System.out.println("Quantas provas deseja cadastrar?");
    qtdeProvas = input.nextInt();

    for (int i = 0; i < qtdeAlunos; i++) {



        double[] resultadoAluno = new double[qtdeProvas];
        System.out.println("Qual o nome do aluno?");
        String nomeAluno = input.next();
        aluno[i] = new Alunos(nomeAluno, null);
        while(continuar){
        for (int j = 0; j < qtdeProvas; j++) {
            System.out.println("Qual foi resultado da prova º"+(j+1)+"?");
            double re =  Double.parseDouble(input.next());
            resultadoAluno[j] = re;
        }
        boolean notasValidas = aluno[i].setNotas(resultadoAluno);
            if (!notasValidas) {
                System.out.println("Tente novamente.");
            }else {
                continuar = false;
            }
        }
    }

        for (int i = 0; i < qtdeAlunos; i++){
            IO.println("As Notas do aluno "+aluno[i].getNome() +" são " +aluno[i].CalcularNotas());
        }
}
}
