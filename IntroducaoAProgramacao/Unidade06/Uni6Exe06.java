import java.util.Scanner;

public class Uni6Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        lerVetor(sc, vetor);

        System.out.print("Informe um valor a ser buscado: ");
        double valor = sc.nextDouble();

        boolean encontrado = encontrarValor(vetor, valor);
        System.out.println(encontrado ? "Valor encontrado no vetor." : "Valor não encontrado no vetor.");

        sc.close();
    }

    public static void lerVetor(Scanner sc, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    public static boolean encontrarValor(double[] vetor, double valor) {
        for (double v : vetor) {
            if (v == valor) {
                return true;
            }
        }
        return false;
    }
}