import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo: ");
        int numero = sc.nextInt();

        System.out.println("Decomposição em fatores primos:");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.println(i);
                numero /= i;
            }
        }

        sc.close();
    }
}
