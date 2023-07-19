import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
       /* 2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior de idade,
segundo a legislação brasileira (18 anos). Escreva uma versão com if/else e outra com o
operador ternário.*/

        /*int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));

        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "voce é maior de idade!");
        }else{
            JOptionPane.showMessageDialog(null,"voce é menor de idade");
        }*/

/*----------------------------------------------------------------------------------------------- */

        /*3. Escreva um programa que receba um número inteiro e retorne a mensagem &quot;Este
número é Par&quot; se o número for Par ou retorne &quot;Este número é Ímpar&quot; se o número for
ímpar. Utilize a operação de resto de divisão %.*/

        /*int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número interiro: "));

        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número é par!");
        }else{
            JOptionPane.showMessageDialog(null, "O número é impar!");
        }*/

/*----------------------------------------------------------------------------------------------- */

        /*4. Utilizando switch/case, escreva um programa que receba 3 notas de um aluno e uma
letra. Se a letra for A, a função deve retornar a média aritmética das notas do aluno. Se
for B, a sua média ponderada (pesos: 5, 3 e 2, respectivamente). A função também deve
informar se a letra for diferente de A e B. Cálculo da média ponderada: ((nota1*5) +
(nota2*3) + (nota3*2)) / 10.*/

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

        String letra = JOptionPane.showInputDialog("Digite uma letra (A/B): ");

        switch(letra){
            case "A":
                double resultadoA = (nota1 + nota2 + nota3) /3;
                JOptionPane.showMessageDialog(null,"O resultado da média das notas é igual a: " + resultadoA);
                break;
            case "B":
                double resultadoB = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2))/10;    
                JOptionPane.showMessageDialog(null,"O resultado da média ponderada é igual a: " + resultadoB);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite uma das dua letras (A/B)");    
            }

    }
}
