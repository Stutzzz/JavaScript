public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar(){
        System.out.println("O" + nome + "está caçando!");
    }

    void comer(){
        System.out.println("O" + nome + "está comendo!");
    }

    void dormir(){
        System.out.println("O" + nome + "está dormindo!");
    }
}
