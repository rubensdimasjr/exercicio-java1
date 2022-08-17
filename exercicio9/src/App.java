import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("#########################################");
        System.out.println("#     Cálculo de Rendimento Poupança    #");
        System.out.println("#########################################");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        double deposito = leia.nextFloat();
        leia.close();

        double resultado = (0.70 * deposito / 100) + deposito;
        DecimalFormat fmt = new DecimalFormat("0.00");
        String rendimento = fmt.format(resultado);
        System.out
                .println("O rendimento de R$" + deposito + " em 1 mês (com juros de 0.70% a.m.) é de: R$" + rendimento
                        + " aproximadamente.");

    }
}
