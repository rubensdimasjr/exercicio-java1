import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Variaveis var = new Variaveis();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        var.setA(scanner.nextInt());

        System.out.println("Digite o valor de B: ");
        var.setB(scanner.nextInt());

        scanner.close();

        var.setFalsoA(var.getB());
        var.setFalsoB(var.getA());

        System.out.println("========================");

        System.out.println("Novo valor de A é: " + var.getFalsoA());

        System.out.println("Novo valor de B é: " + var.getFalsoB());
    }
}
