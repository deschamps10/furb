import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo, 7=Sábado): ");
        int primeiroDia = sc.nextInt();
        System.out.print("Informe o número de dias do mês: ");
        int diasNoMes = sc.nextInt();

        System.out.println("D S T Q Q S S");
        int dia = 1;
        for (int i = 1; i <= diasNoMes; i++) {
            if (i == 1) {
                for (int j = 1; j < primeiroDia; j++) {
                    System.out.print("   ");
                }
            }
            System.out.printf("%2d ", dia++);
            if ((i + primeiroDia - 1) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
