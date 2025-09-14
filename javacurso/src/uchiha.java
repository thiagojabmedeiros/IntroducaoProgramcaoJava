package src;

public class uchiha extends ninja{
    public void sharingan(){
        System.out.println("Sharingan!");
    }
    public void amaterasu(){
        System.out.println("Amaterasu!!");
    }

    @Override
    public void ataquebase(String nome){
        System.out.println(nome + " arremessou uma kunai com chamas do amaterasu!");
    }
}
