package sample.model;

public class Produto {

    //atributos
    private String nome;
    private double preco;

    //construtor
    public Produto(){

    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //to string
    @Override
    public String toString() {
        return "Nome do produto: " + nome +
                "; preço: " + preco;
    }
}
