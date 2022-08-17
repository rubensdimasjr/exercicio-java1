import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Variaveis var = new Variaveis();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var.setNome(scanner.nextLine());

        System.out.println("Digite a nota da primeira prova: ");
        var.setNota1(scanner.nextDouble());

        System.out.println("Digite a nota da segunda prova: ");
        var.setNota2(scanner.nextDouble());

        System.out.println("Digite a nota da terceira prova: ");
        var.setNota3(scanner.nextDouble());

        scanner.close();

        var.setMedia((var.getNota1() + var.getNota2() + var.getNota3()) / 3);

        System.out.println("======================================");

        System.out.println("Nome: " + var.getNome());
        System.out.println("Nota Média: " + var.getMedia());
    }
}
