import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Informe o tamanho do vetor (até 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);

        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        Map<Double, Integer> frequencia = new HashMap<>();
        for (double valor : vetor) {
            frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
        }

        System.out.println("Valor | Frequência");
        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }

        sc.close();
    }
}
