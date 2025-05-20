import java.util.Scanner;

public class Uni06Exe10 {

    private static int incluirValor(int[] vetor, Scanner teclado, int posicao) {
        System.out.println("Digite um número:");
        int numero = teclado.nextInt();
        if (posicao < vetor.length) {
            vetor[posicao] = numero;
            System.out.println("Número " + numero + " incluído na posição vetor[" + posicao + "]");
            return posicao + 1;
        } else {
            System.out.println("Vetor cheio!");
            return posicao;
        }
    }

    private static void pesquisarValor(int[] vetor, Scanner teclado) {
        System.out.println("Digite o número a ser pesquisado:");
        int numeroDigitado = teclado.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroDigitado) {
                System.out.println("number ++");
                System.out.println("Número: " + numeroDigitado + " encontrado na posição vetor[" + i + "]");
                encontrado = true;  
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        int vetor[] = new int[50];
        int posicao = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    posicao = incluirValor(vetor, sc, posicao);
                    break;
                case 2:
                    pesquisarValor(vetor, sc);
                    break;
                case 3:
                    System.out.println("Função de alteração ainda não implementada.");
                    break;
                case 4:
                    System.out.println("Função de exclusão ainda não implementada.");
                    break;
                case 5:
                    System.out.println("Função de mostrar valores ainda não implementada.");
                    break;
                case 6:
                    System.out.println("Função de ordenação ainda não implementada.");
                    break;
                case 7:
                    System.out.println("Função de inversão ainda não implementada.");
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 8);

        sc.close();
    }
}
