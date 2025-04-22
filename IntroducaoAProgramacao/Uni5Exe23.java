import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Nome do vendedor: ");
            String nome = sc.next();
            System.out.print("Quantidade de produtos vendidos: ");
            int n = sc.nextInt();
            double totalVendas = 0;

            for (int i = 1; i <= n; i++) {
                System.out.printf("Produto %d - Preço: ", i);
                double preco = sc.nextDouble();
                System.out.printf("Produto %d - Quantidade: ", i);
                int qtd = sc.nextInt();
                totalVendas += preco * qtd;
            }

            double salario = totalVendas * 0.30;
            System.out.printf("Vendedor: %s - Total de vendas: R$%.2f - Salário: R$%.2f%n", nome, totalVendas, salario);

            System.out.print("Deseja digitar os dados de mais um vendedor (s/n)? ");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("s"));

        sc.close();
    }
}
