import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salario: "));

        if(salario > 1320){
            JOptionPane.showMessageDialog(null,"Voce ganha mais que um salrio minimo");
        }else{
            JOptionPane.showMessageDialog(null,"Voce ganha menos que um salrio minimo");
        }

    }
}
