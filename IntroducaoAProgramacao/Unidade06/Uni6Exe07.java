import java.util.Arrays;
import java.util.Scanner;

public class Uni6Exe07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor;

        int n;
        do {
            System.out.print("Informe o tamanho do vetor (até 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);

        vetor = new int[n];
        inserirValores(sc, vetor);
        ordenarVetor(vetor);
        escreverVetor(vetor);
        sc.close();
    }

    public static void inserirValores(Scanner sc, int[] vetor) {
        int count = 0;
        while (count < vetor.length) {
            System.out.print("Digite um número inteiro: ");
            int valor = sc.nextInt();

            boolean existe = false;
            for (int i = 0; i < count; i++) {
                if (vetor[i] == valor) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                vetor[count] = valor;
                count++;
            } else {
                System.out.println("Valor já existente, informe outro.");
            }
        }
    }

    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void escreverVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int i : vetor) System.out.print("[" + i + "]");
        System.out.println();
    }
}