//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println(String.format("Olá usuario, para começarmos, insira seu nome"));
    String nome = scanner.nextLine();

    IO.println(String.format("Agora, insira seu cpf"));
    String cpf = scanner.nextLine();

    IO.println(String.format("insira sua idade"));
    int idade = scanner.nextInt();

    IO.println(String.format("insira sua altura em metros, utilize virgula"));
    double altura = scanner.nextDouble();

    IO.println(String.format("insira sua estado civil"));
    String Civil = scanner.nextLine();

    IO.println("Seja bem vindo " + nome + " ! seu CPF é: " + cpf + " você tem " + idade + " com essa altura: " + altura+ "metros, parabens!");



}
