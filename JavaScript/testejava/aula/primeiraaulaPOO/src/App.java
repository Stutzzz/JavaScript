import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String calcular = JOptionPane.showInputDialog("Digite uma operação (+,-,*,/): ");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        double res = 0;
        String operacao = "";

        switch (calcular) {
            case ("+"):
                res = n1 + n2;
                operacao = "Soma";
                break;
            case ("-"):
                res = n1 - n2;
                operacao = "Subtração";
                break;
            case ("*"):
                res = n1 * n2;
                operacao = "Multiplicação";
                break;
            case ("/"):
                res = n1 / n2;
                operacao = "Divisão";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dados incorretos!");
        }
        JOptionPane.showMessageDialog(null, "O resultado da operação é igual a: " + res + " com o operador: ( " + operacao + " )") ;
    }
}
