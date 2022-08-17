import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("#################################");
        System.out.println("# Cálculo Celsius -> Fahrenheit #");
        System.out.println("#################################");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C (Celsius): ");
        float temperatura_c = leia.nextFloat();

        leia.close();
        float temperatura_f = (9 * temperatura_c + 160) / 5;

        System.out.println("A temperatura convertida é: " + temperatura_f + "°F (Fahrenheit)");
    }
}
