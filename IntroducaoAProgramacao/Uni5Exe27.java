import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String novoFuncionario;

        double maiorProducao = 0;
        String diaMaiorProducao = "";
        String periodoMaiorProducao = "";
        int maiorManha = 0, maiorTarde = 0;
        int totalFuncionarios = 0;

        do {
            int dia;
            do {
                System.out.print("Informe o dia (1 a 30): ");
                dia = sc.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido.");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Quantidade de peças no turno da manhã: ");
            int producaoManha = sc.nextInt();
            System.out.print("Quantidade de peças no turno da tarde: ");
            int producaoTarde = sc.nextInt();

            double valorRecebido = 0;
            if (dia <= 15) {
                if (producaoManha + producaoTarde > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = (producaoManha + producaoTarde) * 0.80;
                } else {
                    valorRecebido = (producaoManha + producaoTarde) * 0.50;
                }
            } else {
                valorRecebido = producaoManha * 0.40 + producaoTarde * 0.30;
            }

            System.out.printf("Valor a receber: R$ %.2f%n", valorRecebido);

            if (producaoManha + producaoTarde > maiorProducao) {
                maiorProducao = producaoManha + producaoTarde;
                diaMaiorProducao = String.valueOf(dia);
            }

            if (producaoManha > maiorManha) {
                maiorManha = producaoManha;
                periodoMaiorProducao = "manhã";
            }

            if (producaoTarde > maiorTarde) {
                maiorTarde = producaoTarde;
                periodoMaiorProducao = "tarde";
            }

            totalFuncionarios++;
            System.out.print("Novo funcionário (1.sim 2.não)? ");
            novoFuncionario = sc.next();

        } while (novoFuncionario.equals("1"));

        System.out.printf("Maior produção: %s peças no dia %s%n", maiorProducao, diaMaiorProducao);
        System.out.printf("Maior produção no turno: %d peças no turno da %s%n", maiorManha, periodoMaiorProducao);
        sc.close();
    }
}
