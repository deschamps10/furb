import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0;
        int totalVotos = 0;

        String continuar;
        do {
            System.out.print("Voto para: 1 - Nenhum de Nós, 2 - CPM22, 3 - Skank, 4 - Jota Quest: ");
            int voto = sc.nextInt();
            switch (voto) {
                case 1: votos1++; break;
                case 2: votos2++; break;
                case 3: votos3++; break;
                case 4: votos4++; break;
                default: System.out.println("Voto inválido"); continue;
            }
            totalVotos++;
            System.out.print("Mais um voto? (s/n): ");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("s"));

        System.out.printf("Votos para Nenhum de Nós: %d (%.2f%%)%n", votos1, (votos1 * 100.0) / totalVotos);
        System.out.printf("Votos para CPM22: %d (%.2f%%)%n", votos2, (votos2 * 100.0) / totalVotos);
        System.out.printf("Votos para Skank: %d (%.2f%%)%n", votos3, (votos3 * 100.0) / totalVotos);
        System.out.printf("Votos para Jota Quest: %d (%.2f%%)%n", votos4, (votos4 * 100.0) / totalVotos);

        int vencedor = Math.max(Math.max(votos1, votos2), Math.max(votos3, votos4));
        if (vencedor == votos1) {
            System.out.println("O vencedor é Nenhum de Nós!");
        } else if (vencedor == votos2) {
            System.out.println("O vencedor é CPM22!");
        } else if (vencedor == votos3) {
            System.out.println("O vencedor é Skank!");
        } else {
            System.out.println("O vencedor é Jota Quest!");
        }

        sc.close();
    }
}
