import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("#################################");
        System.out.println("#    Conversão Real -> Dolar    #");
        System.out.println("#################################");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor (em R$) a ser convertido: ");
        float reais = leia.nextFloat();

        leia.close();
        double dolar = (reais * 0.1930);
        DecimalFormat fmt = new DecimalFormat("0.00");
        String result = fmt.format(dolar);

        System.out.println("O valor informado em dolar é: " + result + "U$");
    }
}
