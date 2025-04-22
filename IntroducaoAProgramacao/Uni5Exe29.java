import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor desejado: ");
        int valor = sc.nextInt();
        int[] cedulas = {20, 10, 5, 2, 1};

        System.out.println("Cédulas necessárias:");
        for (int cedula : cedulas) {
            int quantidade = valor / cedula;
            if (quantidade > 0) {
                System.out.printf("%d cédula(s) de R$%d%n", quantidade, cedula);
                valor %= cedula;
            }
        }

        sc.close();
    }
}
