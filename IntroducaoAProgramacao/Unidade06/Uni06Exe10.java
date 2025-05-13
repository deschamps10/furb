import java.util.Scanner;

public class Uni06Exe10 {
    private Uni06Exe10() {
        int opcao = 0;
        int posicao = 0;
        int vet[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MENU-----");

        do {
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            opcao = sc.nextInt();
            System.out.println("Opção Digitada: " + opcao);

            switch (opcao) {
                case 1:
                    incluirValor(vet, sc, posicao);
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;

            }
        } while (opcao != 8);

    }

    private int incluirValor(int[] vet, Scanner sc, int posicao) {
        System.out.println("Digite um número: ");
        int numero =  sc.nextInt();
        if (posicao < vet.length) {
            vet[posicao] = numero;
            System.out.println("Número" + numero + "incluindo na posição vetor["+posicao+"]");
        }
            else {
                 System.out.println("Vetor Cheio!");
            }
        
        return posicao + 1;
    }

    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
