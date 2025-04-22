import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor máximo de pedágio: ");
        double maxPedagio = sc.nextDouble();

        int acima = 0, informados = 0, aceitosAcima150 = 0;

        while (true) {
            System.out.print("Valor do pedágio: ");
            double valor = sc.nextDouble();
            if (valor < 0) break;

            System.out.print("Distância: ");
            double distancia = sc.nextDouble();
            informados++;

            if (valor > maxPedagio) {
                acima++;
            } else if (distancia > 150) {
                aceitosAcima150++;
            }
        }

        System.out.printf("%d (acima do valor aceito)%n", acima);
        System.out.printf("%d (trechos informados)%n", informados);
        System.out.printf("%d (acima de 150km com valor aceito)%n", aceitosAcima150);
        sc.close();
    }
}
