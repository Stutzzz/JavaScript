import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Quantas tarefas irá adcionar: "));
        
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            String tarefa = JOptionPane.showInputDialog("Adicione uma terefa: ");
            String[] cont = new String[num];
            contador += 1;
            System.out.println(contador + "- " + tarefa);

        }
        String[] check = new String[num];
        System.out.println(check.length);

    }
}
