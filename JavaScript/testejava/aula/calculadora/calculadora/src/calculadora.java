import javax.swing.JOptionPane;
public class jogo {

    public static int soma (int a, int b) {
        return a + b;
    }

    public static int subtracao (int a, int b){
        return a - b;
    }

    public static int multiplicacao (int a, int b ){
        return a * b;
    }

    public static int divisao (int a, int b){
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("1- Soma\n2- Subtracao\n3- Multiplicação\n4- Divisão")); 

        boolean p = true;
        if(operacao >4){
            JOptionPane.showMessageDialog(null,"Operacao invalida!!!");
            p = false;
            
        }

        if(p == true){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        int resultado = 0;
        switch (operacao){
            case 1:
            resultado = soma(n1,n2);
            break;
            case 2:
            resultado = subtracao(n1,n2);
            break;
            case 3:
            resultado = multiplicacao(n1,n2);
            break;
            case 4:
            resultado = divisao(n1,n2);
            break;
            

        } 
        JOptionPane.showMessageDialog(null, resultado);
    }
    }
}
