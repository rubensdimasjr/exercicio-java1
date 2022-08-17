import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Variaveis var = new Variaveis();

        System.out.println("=== Operações Matemáticas ===");
        System.out.println("Digite um número: ");
        var.setNumber1(scanner.nextFloat());

        System.out.println("Digite outro número: ");
        var.setNumber2(scanner.nextFloat());

        scanner.close();

        var.setResult(var.getNumber1() + var.getNumber2());
        System.out.println("O resultado da soma foi: " + var.getResult());

        var.setResult(var.getNumber1() - var.getNumber2());
        System.out.println("O resultado da subtração foi: " + var.getResult());

        var.setResult(var.getNumber1() * var.getNumber2());
        System.out.println("O resultado da multiplicação foi: " + var.getResult());

        var.setResult(var.getNumber1() / var.getNumber2());
        System.out.println("O resultado da divisão foi: " + var.getResult());
    }
}
