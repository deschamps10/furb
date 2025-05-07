import java.util.Scanner;

public class Uni6Exe01 {
  public static void main(String[] args) {
    int[] numeros = lerNumeros();
    escreverInverso(numeros);
  }

  private static int[] lerNumeros() {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];
    for (int i = 0; i < 10; i++) {
      vetor[i] = sc.nextInt();
    }
    return vetor;
  }

  private static void escreverInverso(int[] vetor) {
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println(vetor[i]);
    }
  }
}