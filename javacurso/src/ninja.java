package src;
public class ninja {
    private String nome;
    String aldeia;
    int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nomex) {
        nome = nomex;
    }

    public void ataquebase(String nome){
        System.out.println(nome + " arremessou uma kunai!");
    }
}
