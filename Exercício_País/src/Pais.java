import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pais {






    // Atibutos
    private String nome;
    private String nome_capital;
    private float dimensao;
    private List<String> paises;
    String dados = nome + nome_capital;

    public Pais(String n, String c, float d){ // Construtor parametrado
        nome = n;
        nome_capital = c;
        dimensao = d;
    }






    // Métodos
    public boolean equals(Pais outro){
        return(outro.dados == dados);
    }

    public void defina_fronteira(){
        paises = new ArrayList(500);
    }

    public void retorne_fronteira(){
        System.out.println(paises);
    }

    public void vizinhos(Pais outro){
        System.out.println(paises.retainAll(outro.paises));
    }





    // Método de acesso e atribuição
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_capital() {
        return nome_capital;
    }

    public void setNome_capital(String nome_capital) {
        this.nome_capital = nome_capital;
    }

    public float getDimensao() {
        return dimensao;
    }

    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }

    public List getPaises() {
        return paises;
    }

    public void setPaises(List paises) {
        this.paises = paises;
    }
}
