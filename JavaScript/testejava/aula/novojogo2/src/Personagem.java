import java.io.PrintStream;

public class Personagem {
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem (String nome, int energia, int fome, int sono){
        this.nome = nome;
        if(energia >= 0 && energia <=10){
            this.energia = energia;
        }

        if(fome >=0 && fome <=10){
            this.fome = fome;
        }

        if(sono >=0 && sono <=10){
            this.sono = sono;
        }
    }


    void cacar(){
        if (energia >= 2){
        System.out.println(nome + " está cacando!!");
        energia -= 2;
    }else{
            System.out.println(nome + " está sem energia para caçar!!");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if (fome >=1){
        System.out.println(nome + " está comendo!!");
        energia = Math.min(energia + 1, 10);
        fome--;
        }else{
            System.out.println(nome + " está sem fome!!");
        }
    }

    void dormir(){
        if (sono >=1){
            System.out.println(nome + " está dormindo!!");
            energia = Math.min(energia + 1, 10);
            sono--;
        }else{
            System.out.println(nome + " está sem sono!!");
        }
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }

   public int getFome(){
        return fome;
   }
   public void setFome(int fome){
        this.fome = fome;
   }

   public int getSono(){
        return sono;
   }
   public void setSono(int sono){
        this.sono = sono;
   }

}


