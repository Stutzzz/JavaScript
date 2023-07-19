import javax.swing.JOptionPane;

public class Checklist {
    public static void main(String[] args) {
        String[] tarefas = {"Tarefa 1", "Tarefa 2", "Tarefa 3", "Tarefa 4", "Tarefa 5"};
        boolean[] status = new boolean[tarefas.length];
        
        for (int i = 0; i < tarefas.length; i++) {
            status[i] = JOptionPane.showConfirmDialog(null, tarefas[i], "Tarefa " + (i + 1), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        }
        
        int concluidas = 0;
        for (boolean b : status) {
            if (b) {
                concluidas++;
            }
        }
        
        JOptionPane.showMessageDialog(null, concluidas + " tarefas concluídas.");
    }
}
