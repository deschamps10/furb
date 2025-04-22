import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o limite diário de pesca (Kg): ");
        double limiteKg = sc.nextDouble();
        double limiteG = limiteKg * 1000;
        double totalPesca = 0;
        String continuar;

        while (true) {
            System.out.print("Peso do peixe (g): ");
            double peso = sc.nextDouble();
            if (peso < 0) break;

            totalPesca += peso;
            if (totalPesca > limiteG) {
                System.out.println("Limite diário excedido!");
                break;
            }

            System.out.printf("Peso acumulado: %.2fg%n", totalPesca);
            System.out.print("Deseja informar o peso de mais um peixe (s/n)? ");
            continuar = sc.next().toLowerCase();
            if (!continuar.equals("s")) break;
        }

        sc.close();
    }
}
