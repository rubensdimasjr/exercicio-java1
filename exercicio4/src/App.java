import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Variaveis var = new Variaveis();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var.setNome(scanner.nextLine());

        System.out.println("Digite seu salário: ");
        var.setSalario(scanner.nextFloat());

        System.out.println("Digite o total de vendas feitas: ");
        var.setVendas(scanner.nextFloat());

        var.setSalarioFinal((var.getVendas() * 0.15) + var.getSalario());

        scanner.close();

        System.out.println("=========================================");

        System.out.println("Nome: " + var.getNome());
        System.out.println("Salário sem comissão: " + var.getSalario());
        System.out.println("Salário final: " + var.getSalarioFinal());
    }
}
