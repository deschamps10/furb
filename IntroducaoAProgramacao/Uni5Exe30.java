import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inicial N: ");
        int N = sc.nextInt();
        System.out.print("Informe o decremento K: ");
        int K = sc.nextInt();
        System.out.print("Informe o tamanho da mochila M: ");
        int M = sc.nextInt();

        List<Integer> itens = new ArrayList<>();
        for (int i = N; i > 0; i -= K) {
            itens.add(i);
        }

        List<Integer> mochila = new ArrayList<>();
        int somaMochila = 0;
        for (int item : itens) {
            if (somaMochila + item <= M) {
                mochila.add(item);
                somaMochila += item;
            }
        }

        List<Integer> foraMochila = new ArrayList<>();
        for (int item : itens) {
            if (!mochila.contains(item)) {
                foraMochila.add(item);
            }
        }

        System.out.println("Itens a serem colocados na mochila: " + itens);
        System.out.println("Itens que entraram na mochila: " + mochila);
        System.out.println("Itens que ficaram fora da mochila: " + foraMochila);
        System.out.println("Soma dos itens na mochila: " + somaMochila);
        System.out.println("Soma dos itens fora da mochila: " + foraMochila.stream().mapToInt(Integer::intValue).sum());

        sc.close();
    }
}
