public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000;
        double aumento = 0.015;

        for (int ano = 1997; ano <= 2025; ano++) {
            aumento *= 2;
            salario += salario * aumento;
        }

        System.out.printf("Salário atual: R$ %.2f%n", salario);
    }
}
