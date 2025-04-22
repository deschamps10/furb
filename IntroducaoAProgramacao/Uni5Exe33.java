import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votos = new int[6]; // Votos para 4 candidatos, 1 nulo, 1 em branco
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite seu voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para finalizar): ");
            int voto = sc.nextInt();

            if (voto == 0) {
                break;
            } else if (voto >= 1 && voto <= 6) {
                votos[voto - 1]++;
                totalVotos++;
            } else {
                System.out.println("Opção incorreta");
            }
        }

        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Candidato %d: %d votos (%.2f%%)%n", i + 1, votos[i], (votos[i] * 100.0) / totalVotos);
        }
        System.out.printf("Votos nulos: %d votos (%.2f%%)%n", votos[4], (votos[4] * 100.0) / totalVotos);
        System.out.printf("Votos em branco: %d votos (%.2f%%)%n", votos[5], (votos[5] * 100.0) / totalVotos);

        sc.close();
    }
}
