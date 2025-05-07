import java.util.Scanner;

public class Uni6Exe002 {
  public static void main(String[] args) {
    double[] valores = lerValores();
    double media = calcularMedia(valores);
    imprimirMaioresQueMedia(valores, media);
  }

  private static double[] lerValores() {
    Scanner sc = new Scanner(System.in);
    double[] vetor = new double[12];
    for (int i = 0; i < 12; i++) {
      vetor[i] = sc.nextDouble();
    }
    return vetor;
  }

  private static double calcularMedia(double[] vetor) {
    double soma = 0;
    for (double valor : vetor) {
      soma += valor;
    }
    return soma / vetor.length;
  }

  private static void imprimirMaioresQueMedia(double[] vetor, double media) {
    for (double valor : vetor) {
      if (valor > media) {
        System.out.println(valor);
      }
    }
  }
}
