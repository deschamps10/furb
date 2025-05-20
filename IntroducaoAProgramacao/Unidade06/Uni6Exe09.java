import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sexo = new int[30];
        int[] nota = new int[30];
        int[] idade = new int[30];

        int somaNota = 0;
        int somaNotaHomens = 0, qtdHomens = 0;
        int notaMulherMaisJovem = -1;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int mulheres50MaisNotaMaior = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Cliente " + (i+1) + ":");
            System.out.print("Sexo (1=fem / 2=masc): ");
            sexo[i] = sc.nextInt();

            System.out.print("Nota (0-10): ");
            nota[i] = sc.nextInt();
            somaNota += nota[i];

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (sexo[i] == 2) {
                somaNotaHomens += nota[i];
                qtdHomens++;
            } else if (sexo[i] == 1) {
                if (idade[i] < menorIdadeMulher) {
                    menorIdadeMulher = idade[i];
                    notaMulherMaisJovem = nota[i];
                }
            }
        }

        double mediaGeral = somaNota / 30.0;
        double mediaHomens = qtdHomens > 0 ? somaNotaHomens / (double) qtdHomens : 0;

        for (int i = 0; i < 30; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                mulheres50MaisNotaMaior++;
            }
        }

        System.out.printf("Nota média geral: %.2f\n", mediaGeral);
        System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + mulheres50MaisNotaMaior);

        sc.close();
    }
}