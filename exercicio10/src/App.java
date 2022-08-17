import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("############################################");
        System.out.println("##    Prestações Loja Mamão com Açucar    ##");
        System.out.println("############################################");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = leia.nextDouble();

        leia.close();
        double p1 = valor / 1;
        double p2 = valor / 2;
        double p3 = valor / 3;
        double p4 = valor / 4;
        double p5 = valor / 5;

        System.out.println("1ª Prestação -> R$" + p1 + "\n");
        System.out.println("2ª Prestação -> R$" + p2 + "\n");
        System.out.println("3ª Prestação -> R$" + p3 + "\n");
        System.out.println("4ª Prestação -> R$" + p4 + "\n");
        System.out.println("5ª Prestação -> R$" + p5 + "\n");
    }
}