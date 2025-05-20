import java.util.Scanner;

public class Uni6Exe04 {
  public static void main(String[] args) {
    int[] vetor1 = lerVetor();
    int[] vetor2 = lerVetor();
    int[] vetor3 = somarVetores(vetor1, vetor2);
    escreverVetores(vetor1, vetor2, vetor3);
  }

  private static int[] lerVetor() {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];
    for (int i = 0; i < 10; i++) {
      vetor[i] = sc.nextInt();
    }
    return vetor;
  }

  private static int[] somarVetores(int[] v1, int[] v2) {
    int[] resultado = new int[10];
    for (int i = 0; i < 10; i++) {
      resultado[i] = v1[i] + v2[i];
    }
    return resultado;
  }

  private static void escreverVetores(int[] v1, int[] v2, int[] v3) {
    for (int i = 0; i < 10; i++) {
      System.out.printf("%d + %d = %d\n", v1[i], v2[i], v3[i]);
    }
  }
}