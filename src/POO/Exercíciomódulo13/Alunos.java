package POO.Exercíciomódulo13;

public class Alunos {

    private String nome;
    private double[] notas;


    public Alunos(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean setNotas(double[] notas) {

        if (notas == null) {
            return false;
        }

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < 0) {
                IO.println("Não é possível salvar uma nota negativa");
                return false;
            }

            if (notas[i] > 10) {
                IO.println("Não é possível salvar uma nota maior que dez");
                return false;
            }
        }

        this.notas = notas;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public double CalcularNotas() {
        double soma = 0;
        double resultado = 0;
        if (this.notas != null) {
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        resultado = soma / notas.length;
        return resultado;
        } return 0;
    }


}
