import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rapaz = new String[5];
        String[] moca = new String[5];

        System.out.println("Respostas do rapaz:");
        lerRespostas(sc, rapaz);

        System.out.println("Respostas da moça:");
        lerRespostas(sc, moca);

        int afinidade = calcularAfinidade(rapaz, moca);
        System.out.println("Afinidade: " + afinidade);
        escreverMensagemAfinidade(afinidade);

        sc.close();
    }

    public static void lerRespostas(Scanner sc, String[] respostas) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Pergunta " + (i+1) + " (SIM, NÃO, IND): ");
            respostas[i] = sc.next().toUpperCase();
        }
    }

    public static int calcularAfinidade(String[] r1, String[] r2) {
        int pontos = 0;
        for (int i = 0; i < 5; i++) {
            if (r1[i].equals(r2[i])) {
                pontos += 3;
            } else if (r1[i].equals("IND") || r2[i].equals("IND")) {
                pontos += 1;
            } else {
                pontos -= 2;
            }
        }
        return pontos;
    }

    public static void escreverMensagemAfinidade(int pontos) {
        if (pontos == 15) {
            System.out.println("Casem!");
        } else if (pontos >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontos >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (pontos >= 0) {
            System.out.println("Vale um encontro.");
        } else if (pontos >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
}