import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        float consumo_med;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a distancia total percorrida: ");
        int dist_total = leia.nextInt();

        System.out.println("Digite o total do combustível gasto: ");
        float combustivel_gasto = leia.nextFloat();

        leia.close();

        consumo_med = dist_total / combustivel_gasto;

        System.out.println("O Consumo médio foi: " + consumo_med);
    }
}
