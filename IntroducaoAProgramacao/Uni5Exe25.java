import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontoE = 0, pontoD = 0;

        while (true) {
            System.out.print("Ponto (E/D): ");
            char ponto = sc.next().toUpperCase().charAt(0);
            if (ponto == 'E') pontoE++;
            else if (ponto == 'D') pontoD++;

            if ((pontoE >= 21 || pontoD >= 21) && Math.abs(pontoE - pontoD) >= 2) break;
        }

        String vencedor = pontoE > pontoD ? "Jogador Esquerdo" : "Jogador Direito";
        System.out.println("Vencedor: " + vencedor);
        sc.close();
    }
}
