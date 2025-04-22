import javax.swing.JOptionPane;

public class TarefaExtra35 {
     public static void main(String[] args) {
        


        try {
            double custoMensal = Double.parseDouble(
                JOptionPane.showInputDialog("Informe seu custo mensal (R$):")
            );

            double taxaMensal = Math.pow(1.1425, 1.0 / 12) - 1;
            double valorNecessario = custoMensal / taxaMensal;

            JOptionPane.showMessageDialog(null, String.format(
                "Para um custo mensal de R$ %.2f,\n" +
                "você precisaria ter R$ %.2f investidos\n" +
                "para viver de renda com Selic a 14,25%% ao ano.",
                custoMensal, valorNecessario
            ));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        }
    }
}
